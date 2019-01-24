package com.core.pool;

import java.util.HashMap;
import java.util.Map;

import com.core.webbrowser.AbstractWebBrowser;

/**
 * 
 * @author gentjan_kolicaj
 *
 */
public class WebBrowserMap {

	private static Map<Integer, AbstractWebBrowser> webBrowserReferences = new HashMap<>();

	public static Map<Integer, AbstractWebBrowser> getWebBrowserReferences() {
		return webBrowserReferences;
	}

	public static AbstractWebBrowser addWebBrowser(Integer key, AbstractWebBrowser value) {
		return webBrowserReferences.put(key, value);
	}

	public static AbstractWebBrowser removeWebBrowser(Integer key) {
		return webBrowserReferences.remove(key);
	}

	public static AbstractWebBrowser replaceWebBrowser(Integer key, AbstractWebBrowser value) {
		return webBrowserReferences.replace(key, value);
	}

	public static void clearMap() {
		webBrowserReferences.clear();
		webBrowserReferences = new HashMap<>();
	}

}
