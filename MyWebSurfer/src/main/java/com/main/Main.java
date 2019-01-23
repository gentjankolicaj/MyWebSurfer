package com.main;

import com.core.webbrowser.MyBrowserType;
import com.core.webbrowser.WebBrowser;
import com.core.webbrowser.WebBrowserFactory;
import com.task.Step;
import com.task.Task;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public class Main {

	public static void main(String[] args) {
		
		task_1();

	}

	public static void task_1() {

		Task task = new Task();
		task.addStep(new Step() {

			@Override
			public void perform() throws Exception {

				WebBrowser[] webBrowsers = WebBrowserFactory.getBrowsers(MyBrowserType.CHROME, MyBrowserType.FIREFOX,
						MyBrowserType.EDGE, MyBrowserType.CHROME);

			}

		});

		try {

			task.finish();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void task_2() {

		Task task = new Task();
		task.addStep(new Step() {

			@Override
			public void perform() throws Exception {

				WebBrowser[] webBrowsers = WebBrowserFactory.getBrowsers(MyBrowserType.CHROME, MyBrowserType.FIREFOX,
						MyBrowserType.EDGE, MyBrowserType.CHROME);

			}

		});
		
		
		try {

			task.finish();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
