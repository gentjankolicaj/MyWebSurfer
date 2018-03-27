package util;

import org.openqa.selenium.WebDriver;

import config.GlobalConfig;
import core.WebBrowser;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public class PrintUtils {

	public static void print(Integer index) {

	}

	public static void print(Integer index, WebBrowser browser) {
		if (GlobalConfig.PRINT_LOGS) {
			User temp = browser.getUser();
			StringBuilder userDetails = new StringBuilder();
			userDetails.append(temp.getName()).append(",").append(temp.getEmail()).append(",")
					.append(temp.getPassword());

			print(String.valueOf(index), browser.getBrowser().name(), userDetails.toString(), "not implemented");
		}
	}

	public static void print(Integer index, WebDriver driver) {

	}

	private static void print(String index, String browser, String userDetails, String proxy) {
		StringBuilder builder = new StringBuilder();
		builder.append(index).append("|").append(browser).append("|").append(userDetails).append("|").append(proxy)
				.append("|");
		System.out.println(
				"________________________________________________________________________________________________");
		System.out.println(builder.toString());
		System.out.println(
				"________________________________________________________________________________________________");

	}

	public static void printHeader() {
		if (GlobalConfig.PRINT_LOGS) {
			System.out.println();
			System.out.println(
					"| Nr  |    BROWSER    |              USER DETAILS                       | PROXY            |");

		}
	}

	public static void printStep(Class<? extends Object> cls, String string) {

	}

	public static void printStep(Object obj, String string) {

	}

}
