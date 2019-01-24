package com.util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.config.GlobalConfig;
import com.core.webbrowser.MyBrowserType;
import com.core.webbrowser.DriverType;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public class DriverUtils {

	public static WebDriver initWebDriver(MyBrowserType browserType) {
		WebDriver tmp = null;
		switch (browserType) {
		case CHROME:
			tmp = initChrome(DriverType.CHROME_DRIVER);
			break;
		case FIREFOX:
			tmp = initFirefox(DriverType.GECKO_DRIVER);
			break;
		case HTML_UNIT:
			tmp = initHtmlUnit(DriverType.HTML_UNIT_DRIVER);
			break;
		case EDGE:
			tmp = initEdge(DriverType.EDGE_DRIVER);
			break;

		}
		return tmp;

	}

	private static WebDriver initChrome(DriverType driverType) {
		System.setProperty(driverType.getDriverName(), findDriverPath(driverType));
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(GlobalConfig.C_TIMEOUT, GlobalConfig.TIME_UNIT);
		 return driver;
	}

	private static WebDriver initFirefox(DriverType driverType) {
		System.setProperty(driverType.getDriverName(), findDriverPath(driverType));
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(GlobalConfig.F_TIMEOUT, GlobalConfig.TIME_UNIT);
		return driver;
	}

	private static WebDriver initEdge(DriverType driverType) {
		System.setProperty(driverType.getDriverName(), findDriverPath(driverType));
		WebDriver driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(GlobalConfig.E_TIMEOUT, GlobalConfig.TIME_UNIT);
		return driver;
	}

	private static WebDriver initHtmlUnit(DriverType driverType) {
		System.setProperty(driverType.getDriverName(), findDriverPath(driverType));
		WebDriver driver= new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(GlobalConfig.H_TIMEOUT, GlobalConfig.TIME_UNIT);
		return driver;
	}

	public static String findDriverPath(DriverType driverType) {
		String path = "";
		path = GlobalConfig.DRIVERS_PATH + "\\" + driverType.getDriverExe();
		return path;
	}
	
	
	public static void killDrivers() {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {

				try {
					Runtime.getRuntime().exec("TASKKILL /F /IM " + DriverType.CHROME_DRIVER.getDriverExe());
					Runtime.getRuntime().exec("TASKKILL /F /IM " + DriverType.EDGE_DRIVER.getDriverExe());
					Runtime.getRuntime().exec("TASKKILL /F /IM " + DriverType.GECKO_DRIVER.getDriverExe());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
	}

}
