package engine;

import config.GlobalConfig;
import core.WebBrowserFactory;

public class Main {

	public static void main(String[] args) {
		ApplicationStarter start = new ApplicationStarter();
		if (start.start()) {
			WebBrowserFactory instance = WebBrowserFactory.getInstance();
			instance.initWebBrowsers(GlobalConfig.TOTAL_BROWSERS);
		}

	}

}
