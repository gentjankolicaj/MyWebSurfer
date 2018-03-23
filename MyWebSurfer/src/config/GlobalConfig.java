package config;

import util.MyBrowser;

/**
 * 
 * @author gentjan_kolicaj
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
