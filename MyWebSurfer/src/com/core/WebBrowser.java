package com.core;

import org.openqa.selenium.WebDriver;

import com.config.GlobalConfig;
import com.core.pool.ApplicationPool;
import com.util.MyBrowser;
import com.util.MyUtils;
import com.util.User;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public class WebBrowser {

	private static int browserCount = 0;
	private WebDriver driver;
	private User user;
	private MyBrowser browser = GlobalConfig.BROWSER;

	public WebBrowser(User user) {
		this.driver = MyUtils.initWebDriver(browser);
		this.user = user;
		browserCount++;
		ApplicationPool.addWebBrowser(new Integer(browserCount), this);
	}

	public WebBrowser() {
		this.driver = MyUtils.initWebDriver(browser);
		browserCount++;
		ApplicationPool.addWebBrowser(new Integer(browserCount), this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public MyBrowser getBrowser() {
		return browser;
	}

	public User getUser() {
		return user;
	}

}
