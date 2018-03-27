package core;

import config.GlobalConfig;
import util.MyApplicationUtils;
import util.MyUtils;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public class WebBrowserFactory {

	private static WebBrowserFactory instance = new WebBrowserFactory();

	static {
		System.setProperty(MyUtils.getDriverName(GlobalConfig.BROWSER),
				MyUtils.getDriverPath(GlobalConfig.rootDriverPath, GlobalConfig.BROWSER));
	}

	private WebBrowserFactory() {

	}

	public static WebBrowserFactory getInstance() {
		return instance;
	}

	public void initWebBrowsers(int amount) {
		int i = 0;
		do {
			new WebBrowser();
			i++;
		} while (i < amount);
		MyApplicationUtils.printBrowsers();

	}

}
