package com.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.core.webbrowser.DriverType;
import com.core.webbrowser.MyBrowserType;

public class DriverUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInitWebDriver() {
		WebDriver driver=DriverUtils.initWebDriver(MyBrowserType.CHROME);
		assertNotNull(driver);
	}
	
	
	@Test
	public void testFindDriverPath() {
		String path=DriverUtils.findDriverPath(DriverType.CHROME_DRIVER);
		assertNotEquals(path,"");
	}

}
