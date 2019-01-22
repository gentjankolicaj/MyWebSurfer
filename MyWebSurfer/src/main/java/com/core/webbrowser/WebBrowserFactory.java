package com.core.webbrowser;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.util.DriverUtils;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public class WebBrowserFactory {


	private WebBrowserFactory() {

	}
	
	
	public static WebBrowser[] getBrowsers(MyBrowserType...browserTypes) {
		WebBrowser[] browsersArray=new WebBrowser[browserTypes.length];
		for(int i=0;i<browserTypes.length;i++) {
			WebDriver driver=DriverUtils.initWebDriver(browserTypes[i]);
			WebBrowser browser=new WebBrowser(driver,browserTypes[i]);
			browsersArray[i]=browser;
			
		}
		return browsersArray;
	}

	
	
    public static List<WebBrowser> getBrowsers(List<MyBrowserType> browserTypes) {
		List<WebBrowser> browsersList=new ArrayList<>(browserTypes.size());
		for(MyBrowserType var:browserTypes) {
			WebDriver driver=DriverUtils.initWebDriver(var);
			WebBrowser browser=new WebBrowser(driver,var);
			browsersList.add(browser);
		}
		return browsersList;
	}
    
    
    public static WebBrowser getBrowser(MyBrowserType browserType) {
    	WebDriver driver=DriverUtils.initWebDriver(browserType);
		WebBrowser browser=new WebBrowser(driver,browserType);
		return browser;
    }
    
    

}
