package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import core.WebBrowser;
import core.pool.ApplicationPool;

/**
 * 
 * @author gentjan_kolicaj
 *
 */
public class MyApplicationUtils {

	public static void printBrowsers() {
		HashMap<Integer, WebBrowser> local = ApplicationPool.getBrowserPool();
		Set<Integer> hashMapKeys = local.keySet();
		Iterator<Integer> iterator = hashMapKeys.iterator();
		PrintUtils.printHeader();
		while (iterator.hasNext()) {
			PrintUtils.print(iterator.next(), local.get(iterator.next()));
		}

	}

}
