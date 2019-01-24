package com.core.webbrowser;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.core.pool.WebBrowserMap;
import com.util.DriverUtils;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public class WebBrowserFactory {

    private static int webBrowserKey=0;
    
	private WebBrowserFactory() {

	}
	
	
	public static WebBrowser[] getBrowsers(MyBrowserType...browserTypes) {
		WebBrowser[] browsersArray=new WebBrowser[browserTypes.length];
		for(int i=0;i<browserTypes.length;i++) {
			WebDriver driver=DriverUtils.initWebDriver(browserTypes[i]);
			WebBrowser browser=new WebBrowser(driver,browserTypes[i]);
			browsersArray[i]=browser;
			WebBrowserMap.addWebBrowser(new Integer(i), browser); //saves reference to a static HashMap
			
		}
		return browsersArray;
	}

	
	
    public static List<WebBrowser> getBrowsers(List<MyBrowserType> browserTypes) {
		List<WebBrowser> browsersList=new ArrayList<>(browserTypes.size());
		for(int i=0;i<browserTypes.size();i++) {
			WebDriver driver=DriverUtils.initWebDriver(browserTypes.get(i));
			WebBrowser browser=new WebBrowser(driver,browserTypes.get(i));
			browsersList.add(browser);
			WebBrowserMap.addWebBrowser(new Integer(i), browser); //saves reference to a static HashMap
		}
		return browsersList;
	}
    
    
    public static WebBrowser getBrowser(MyBrowserType browserType) {
    	WebDriver driver=DriverUtils.initWebDriver(browserType);
		WebBrowser browser=new WebBrowser(driver,browserType);
		WebBrowserMap.addWebBrowser(new Integer(webBrowserKey), browser);
		webBrowserKey++;
		return browser;
    }
    
    

}
