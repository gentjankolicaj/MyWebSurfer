package core;

import org.openqa.selenium.WebDriver;

import config.GlobalConfig;
import core.pool.WebBrowserPool;
import util.MyBrowser;
import util.MyUtils;
import util.User;

public class WebBrowser {

	private static int browserCount = 0;
	private WebDriver driver;
	private User user;
	private MyBrowser browser = GlobalConfig.BROWSER;

	public WebBrowser(User user) {
		this.driver = MyUtils.initWebDriver(browser);
		this.user = user;
		browserCount++;
		WebBrowserPool.addWebBrowserToPool(new Integer(browserCount), this);
	}

	public WebBrowser() {
		this.driver = MyUtils.initWebDriver(browser);
		browserCount++;
		WebBrowserPool.addWebBrowserToPool(new Integer(browserCount), this);
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
