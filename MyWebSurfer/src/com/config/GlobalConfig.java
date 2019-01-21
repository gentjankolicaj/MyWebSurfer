package com.config;

import com.util.MyBrowser;

/**
 * 
 * @author gentjan koli�aj
 *
 */
public class GlobalConfig {

	private GlobalConfig() {
	}

	public static final MyBrowser BROWSER = MyBrowser.FIREFOX;

	public static final int TIMEOUT = 1000;
	public static final int TOTAL_BROWSERS = 3;

	public static final String rootDriverPath = "C://BrowserDrivers//";
	public static final String password = "init";

	public static final boolean PRINT_LOGS = true;
}
