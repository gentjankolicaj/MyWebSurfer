package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import config.GlobalConfig;
import core.WebBrowser;
import core.pool.WebBrowserPool;

public class MyApplicationUtils {

	private static String[] keywords = { "-", "b:", "u:", "p:", "t:" };

	private static boolean isPassword(String[] args) {
		boolean state = false;
		for (String temp : args) {
			if (temp.contains("p:")) {
				if (temp.length() - 2 == GlobalConfig.password.length()) {
					String input = temp.substring(2, GlobalConfig.password.length() + 2);
					if (GlobalConfig.password.equals(input)) {
						state = true;
					} else
						state = false;
				}

			}
		}
		return state;
	}

	private static boolean isPassword(String password) {
		boolean state = false;
		if (GlobalConfig.password.length() == password.length() - 2) {
			int startIndex = password.indexOf(keywords[3]);
			String input = password.substring(startIndex + 2, GlobalConfig.password.length() + startIndex + 2);
			if (GlobalConfig.password.equals(input)) {
				state = true;
			} else
				state = false;
		}
		return state;
	}

	public static boolean checkPassword(Scanner scanner, String[] args) {
		boolean temp = false;
		if (args == null) {
			String local = scanner.nextLine();
			temp = MyApplicationUtils.isPassword(local);

		} else {
			temp = MyApplicationUtils.isPassword(args);
		}
		return temp;

	}

	private static boolean isBrowser(String browser) {
		int startIndex = browser.indexOf(keywords[1]);
		String input = browser.substring(startIndex + 2, GlobalConfig.password.length() + startIndex + 2);
		if (GlobalConfig.password.equals(input)) {
			return true;
		} else
			return false;
	}

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
