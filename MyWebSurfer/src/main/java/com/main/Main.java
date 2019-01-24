package com.main;

import java.util.Arrays;
import java.util.List;

import com.core.surfer.InternetUser;
import com.core.surfer.SurfResult;
import com.core.surfer.UserInfo;
import com.core.surfer.logic.SurfLogic_1;
import com.core.webbrowser.MyBrowserType;
import com.core.webbrowser.WebBrowser;
import com.core.webbrowser.WebBrowserFactory;
import com.core.webbrowser.WebBrowserUtils;
import com.core.website.WebSite;
import com.report.ReportFileType;
import com.report.ReportUtils;
import com.task.SubTask;
import com.task.Task;
import com.util.DriverUtils;

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
		task.addStep(new SubTask() {

			@Override
			public void complete() throws Exception {

				UserInfo userInfo=new UserInfo("005","john","doe","005@m16.uk.gov","For Queen And Country","London","UK");
				
				String baseUrl="https://www.seleniumhq.org/";
				String[] subDirectories= {"https://www.seleniumhq.org/projects/","https://www.seleniumhq.org/download/",
						"https://www.seleniumhq.org/docs/","https://www.seleniumhq.org/support/","https://www.seleniumhq.org/about/"};
				
				WebSite webSite=new WebSite();
				webSite.setBaseUrl(baseUrl);
				webSite.setSubDirectories(Arrays.asList(subDirectories));

				

				WebBrowser[] webBrowsers = WebBrowserFactory.getBrowsers(MyBrowserType.CHROME, MyBrowserType.FIREFOX,
						MyBrowserType.EDGE, MyBrowserType.CHROME);
				
				
				InternetUser user=new InternetUser();
				user.setUserInfo(userInfo);
				user.setBrowsers(webBrowsers);
				user.setWebSite(webSite);
				
				user.setLogic(new SurfLogic_1()); //Sets the logic implemented for surfing,in order to have other logic of surfing ,you must implement Logic interface and make changes to surf() method.
				
				List<SurfResult> surfResult=user.surf();
				
				ReportUtils.saveResults(surfResult, "SurfReport");	 //saves results in xlsx file in user's home directory
				
			}

		});

		try {

			task.finish();

		} catch (Exception e) {
            WebBrowserUtils.quit();
            DriverUtils.killDrivers();
            
			e.printStackTrace();
		}

	}


}
