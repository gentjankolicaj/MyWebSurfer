package com.core.surfer.logic;

import java.util.ArrayList;
import java.util.List;

import com.core.exception.WebBrowserException;
import com.core.surfer.SurfResult;
import com.core.surfer.UserInfo;
import com.core.webbrowser.AbstractWebBrowser;
import com.core.website.AbstractWebSite;
import com.core.website.HelperMethods;

public class SurfLogic_1 implements Logic<SurfResult>{
	private UserInfo userInfo;
	private List<AbstractWebBrowser> webBrowsers;
	private AbstractWebSite webSite;
	
	public SurfLogic_1() {
		
	}

	@Override
	public List<SurfResult> apply(Object... objects) throws Exception {
	  this.userInfo=(UserInfo)objects[0];
	  this.webBrowsers=(List<AbstractWebBrowser>)objects[1];
	  this.webSite=(AbstractWebSite) objects[2];
	  
	  List<SurfResult> resultList=checkBrowsers();
	 
	  prepareUserDetails(resultList);
	  
	  goToBaseUrl(resultList);
	  
	  navigateToSubDirectories(resultList);
	  
	  
	  return resultList;
	}

	
	private void prepareUserDetails(List<SurfResult> resultList) {
		if(userInfo!=null) {
			SurfResult id=new SurfResult("User id",userInfo.getId());
			SurfResult firstName=new SurfResult("User firstName",userInfo.getFirstName());
			SurfResult lastName=new SurfResult("User lastName",userInfo.getLastName());
			SurfResult email=new SurfResult("User email :",userInfo.getEmail());
			SurfResult password=new SurfResult("User password :",userInfo.getPassword());
			SurfResult city=new SurfResult("User city :",userInfo.getCity());
			SurfResult country=new SurfResult("User country :",userInfo.getCountry());
			
			resultList.add(id);
			resultList.add(firstName);
			resultList.add(lastName);
			resultList.add(email);
			resultList.add(password);
			resultList.add(city);
			resultList.add(country);
			
		}
		SurfResult empty=new SurfResult();
		resultList.add(empty);
		
	}

	private void navigateToSubDirectories(List<SurfResult> resultList) throws Exception{
		for(String subDirectory:webSite.getSubDirectories()) {
			navigateTo(resultList,subDirectory);
			
		}
		
	}

	private List<SurfResult> checkBrowsers() throws Exception{
		  if(webBrowsers!=null&&webBrowsers.size()!=0) {
			  return new ArrayList<>();
		  }
		  else
			  throw new WebBrowserException("Browsers reference null or 0 browsers opened.");
	}
	
	
	private void goToBaseUrl( List<SurfResult> resultList) throws Exception{
		goTo(resultList,webSite.getBaseUrl());
	}
	
	
	private void goTo( List<SurfResult> resultList,String url) throws Exception{
		int nr=0;
		for(AbstractWebBrowser var:webBrowsers) {
			HelperMethods.goTo(var.getWebDriver(),url);
			nr++;
			SurfResult result=new SurfResult();
			result.setKey(getClass().getName()+": "+var.getBrowserType().getValue()+"-"+nr);
			result.setValue(" directed at "+url);
			resultList.add(result);
		}
		SurfResult empty=new SurfResult();
		resultList.add(empty);
	}
	
	private void navigateTo( List<SurfResult> resultList,String url) throws Exception{
		int nr=0;
		for(AbstractWebBrowser var:webBrowsers) {
			HelperMethods.goTo(var.getWebDriver(),url);
			nr++;
			SurfResult result=new SurfResult();
			result.setKey(getClass().getName()+": "+var.getBrowserType().getValue()+"-"+nr);
			result.setValue(" navigate to "+url);
			resultList.add(result);
		}
		SurfResult empty=new SurfResult();
		resultList.add(empty);
	
	}
	
	
	

}
