package com.core.webbrowser;

import org.openqa.selenium.WebDriver;

public abstract class AbstractWebBrowser {
	
	protected WebDriver webDriver;
    private MyBrowserType browserType;
    
	public AbstractWebBrowser(WebDriver webDriver, MyBrowserType browserType) {
		super();
		this.webDriver = webDriver;
		this.browserType = browserType;
	}

    

}
