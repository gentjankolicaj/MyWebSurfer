package com.core.surfer;

import java.util.List;

import com.core.webbrowser.AbstractWebBrowser;
import com.core.webbrowser.WebBrowser;
import com.core.website.AbstractWebSite;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public class InternetUser extends WebSurfer {

	private UserInfo userInfo;
	private List<WebBrowser> webBrowsers;

	public InternetUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InternetUser(UserInfo userInfo, List<WebBrowser> webBrowsers) {
		super();
		this.userInfo = userInfo;
		this.webBrowsers = webBrowsers;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public List<WebBrowser> getWebBrowsers() {
		return webBrowsers;
	}

	public void setWebBrowsers(List<WebBrowser> webBrowsers) {
		this.webBrowsers = webBrowsers;
	}

	public List<Object> getSurferInfo() {
		if (userInfo != null)
			return userInfo.getSurferInfo();
		else
			return null;
	}

	@Override
	public List<SurfResult> surf() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AbstractWebBrowser> setBrowsers(List<AbstractWebBrowser> browsers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebSite setWebSite(AbstractWebSite abstractWebSite) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
