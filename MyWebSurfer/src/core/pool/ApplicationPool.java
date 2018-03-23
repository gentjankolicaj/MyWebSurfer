package core.pool;

import java.util.HashMap;

import core.WebBrowser;

/**
 * 
 * @author gentjan_kolicaj
 *
 */
public class ApplicationPool {

	public static HashMap<Integer, WebBrowser> webBrowserPool = new HashMap<>();

	public static HashMap<Integer, WebBrowser> getBrowserPool() {
		return webBrowserPool;
	}

	public static void addWebBrowser(Integer index, WebBrowser browser) {
		webBrowserPool.put(index, browser);
	}

	public static void removeWebBrowser(Integer index) {
		webBrowserPool.remove(index);
	}

	public static void replaceWebBrowser(Integer key, WebBrowser newBrowser) {
		webBrowserPool.replace(key, newBrowser);
	}

	public static void clearMap() {
		webBrowserPool.clear();
	}

}
