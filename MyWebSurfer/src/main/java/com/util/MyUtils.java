package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public class MyUtils {

	public static String getDriverPath(String rootPath, MyBrowser browser) {
		switch (browser) {
		case CHROME:
			return rootPath.concat("chromedriver_32bit.exe");
		case FIREFOX:
			return rootPath.concat("geckodriver_64bit.exe");
		case OPERA:
			return rootPath.concat("operadriver_64bit.exe");
		case HTML_UNIT:
			return rootPath.concat("htmlunit-driver-2.29.2.jar");
		case IEXPLORER:
			return rootPath.concat("iexplorer.exe");
		case PHANTOM:
			return rootPath.concat("phantomjs.jar");
		default:
			return rootPath.concat("geckodriver_64bit.exe");

		}
	}

	public static String getDriverName(MyBrowser browser) {
		switch (browser) {
		case CHROME:
			return "webdriver.chrome.driver";
		case FIREFOX:
			return "webdriver.gecko.driver";
		case OPERA:
			return "webdriver.opera.driver";
		case HTML_UNIT:
			return "htmlunit.binary.path";
		case IEXPLORER:
			return "webdriver.ie.driver";
		case PHANTOM:
			return "phantomjs.binary.path";

		default:
			return "webdriver.gecko.driver";
		}
	}

	public static WebDriver initWebDriver(MyBrowser browser) {
		switch (browser) {
		case CHROME:
			return initChrome();
		case FIREFOX:
			return initFirefox();
		case OPERA:
			return initOpera();
		case HTML_UNIT:
			return initHtmlUnit();
		case IEXPLORER:
			return initIE();
		case PHANTOM:
			return initPhantom();

		default:
			return initFirefox();
		}

	}

	private static WebDriver initChrome() {
		return new ChromeDriver();
	}

	private static WebDriver initFirefox() {
		return new FirefoxDriver();
	}

	private static WebDriver initOpera() {
		return new OperaDriver();
	}

	private static WebDriver initIE() {
		return new InternetExplorerDriver();
	}

	private static WebDriver initHtmlUnit() {
		return new HtmlUnitDriver();
	}

	private static WebDriver initPhantom() {
		return new HtmlUnitDriver();
	}

}
