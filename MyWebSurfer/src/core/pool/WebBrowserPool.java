package core.pool;

import java.util.HashMap;

import core.WebBrowser;

public class WebBrowserPool {

	public static HashMap<Integer, WebBrowser> webBrowserPool = new HashMap<>();

	public static HashMap<Integer, WebBrowser> getBrowserPool() {
		return webBrowserPool;
	}

	public static void addWebBrowserToPool(Integer index, WebBrowser browser) {
		webBrowserPool.put(index, browser);
	}

	public static void removeWebBrowserFromPool(Integer index) {
		webBrowserPool.remove(index);
	}

	public static void replaceWebBrowserFromPool(Integer key, WebBrowser newBrowser) {
		webBrowserPool.replace(key, newBrowser);
	}

	public static void clearHashMap() {
		webBrowserPool.clear();
	}

}
