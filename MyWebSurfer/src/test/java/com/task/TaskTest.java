package com.task;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.core.surfer.InternetUser;
import com.core.surfer.SurfResult;
import com.core.surfer.UserInfo;
import com.core.surfer.logic.SurfLogic_1;
import com.core.webbrowser.MyBrowserType;
import com.core.webbrowser.WebBrowser;
import com.core.webbrowser.WebBrowserFactory;
import com.core.webbrowser.WebBrowserUtils;
import com.core.website.WebSite;
import com.report.ReportUtils;
import com.util.DriverUtils;

public class TaskTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFinish() throws Exception {
		Task task = new Task();
		Task task1 = new Task();
		task.addStep(new SubTask() {

			@Override
			public void complete() throws Exception {

				UserInfo userInfo = new UserInfo("005", "john", "doe", "005@m16.uk.gov", "For Queen And Country",
						"London", "UK");

				String baseUrl = "https://www.seleniumhq.org/";
				String[] subDirectories = { "https://www.seleniumhq.org/projects/",
						"https://www.seleniumhq.org/download/", "https://www.seleniumhq.org/docs/",
						"https://www.seleniumhq.org/support/", "https://www.seleniumhq.org/about/" };

				WebSite webSite = new WebSite();
				webSite.setBaseUrl(baseUrl);
				webSite.setSubDirectories(Arrays.asList(subDirectories));

				WebBrowser[] webBrowsers = WebBrowserFactory.getBrowsers(MyBrowserType.CHROME,MyBrowserType.CHROME,MyBrowserType.CHROME );

				InternetUser user = new InternetUser();
				user.setUserInfo(userInfo);
				user.setBrowsers(webBrowsers);
				user.setWebSite(webSite);

				user.setLogic(new SurfLogic_1()); 

				List<SurfResult> surfResult = user.surf();

				ReportUtils.saveResults(surfResult, "SurfReport");

			}

		});
		
		task1.addStep(new SubTask() {

			@Override
			public void complete() throws Exception {

				UserInfo userInfo = new UserInfo("005", "john", "doe", "005@m16.uk.gov", "For Queen And Country",
						"London", "UK");

				String baseUrl = "https://www.seleniumhq.org/";
				String[] subDirectories = { "https://www.seleniumhq.org/projects/",
						"https://www.seleniumhq.org/download/", "https://www.seleniumhq.org/docs/",
						"https://www.seleniumhq.org/support/", "https://www.seleniumhq.org/about/" };

				WebSite webSite = new WebSite();
				webSite.setBaseUrl(baseUrl);
				webSite.setSubDirectories(Arrays.asList(subDirectories));

				WebBrowser[] webBrowsers = WebBrowserFactory.getBrowsers( MyBrowserType.FIREFOX, MyBrowserType.FIREFOX, MyBrowserType.FIREFOX);

				InternetUser user = new InternetUser();
				user.setUserInfo(userInfo);
				user.setBrowsers(webBrowsers);
				user.setWebSite(webSite);

				user.setLogic(new SurfLogic_1()); 

				List<SurfResult> surfResult = user.surf();

				ReportUtils.saveResults(surfResult, "SurfReport");

			}

		});


			task.finish();
			task1.finish();
			
			
			
			
		
	}

}
