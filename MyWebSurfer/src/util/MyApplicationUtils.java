package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import core.WebBrowser;
import core.pool.WebBrowserPool;

public class MyApplicationUtils {

	public static void printBrowsers() {
		HashMap<Integer, WebBrowser> local = WebBrowserPool.getBrowserPool();
		Set<Integer> hashMapKeys = local.keySet();
		Iterator<Integer> iterator = hashMapKeys.iterator();
		PrintUtils.printHeader();
		while (iterator.hasNext()) {
			PrintUtils.print(iterator.next(), local.get(iterator.next()));
		}

	}

}
