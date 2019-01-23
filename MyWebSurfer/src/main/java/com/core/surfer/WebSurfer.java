package com.core.surfer;

import java.util.List;

import com.core.webbrowser.AbstractWebBrowser;
import com.core.website.AbstractWebSite;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public  abstract class WebSurfer implements Surfable<SurfResult> {
	
	
	public abstract List<AbstractWebBrowser> setBrowsers(List<AbstractWebBrowser> browsers) throws Exception;
	
	public abstract AbstractWebSite setWebSite(AbstractWebSite abstractWebSite) throws Exception;

	
}
