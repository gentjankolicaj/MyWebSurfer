package com.core.webbrowser;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.util.DriverUtils;

public class WebBrowserFactoryTest {

	private String testUrl="https://www.google.com";
	private String testUrl2="https://www.youtube.com/";
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetBrowsersMyBrowserTypeArray() {
		WebBrowser[] array=WebBrowserFactory.getBrowsers(MyBrowserType.CHROME,MyBrowserType.FIREFOX,MyBrowserType.EDGE,MyBrowserType.CHROME);
		for(WebBrowser browser:array) {
			browser.webDriver.get(testUrl);
		}
		WebBrowserUtils.quit();
	    DriverUtils.killDrivers();
	}

	@Test
	public void testGetBrowsersListOfMyBrowserType() {
		List<MyBrowserType> list=Arrays.asList(MyBrowserType.CHROME,MyBrowserType.FIREFOX,MyBrowserType.EDGE,MyBrowserType.CHROME,MyBrowserType.FIREFOX);
		
		List<WebBrowser> browserList=WebBrowserFactory.getBrowsers(list);
		for(WebBrowser browser:browserList) {
			browser.webDriver.get(testUrl2);
		}
		
		WebBrowserUtils.quit();
	    DriverUtils.killDrivers();
	}

	@Test
	public void testGetBrowser() {
		WebBrowser browser=WebBrowserFactory.getBrowser(MyBrowserType.CHROME);
	    browser.webDriver.get(testUrl);
	    
	    WebBrowserUtils.quit();
	    DriverUtils.killDrivers();
	}

}
