package com.core.surfer;

import com.core.webbrowser.AbstractWebBrowser;
import com.core.website.AbstractWebSite;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public  abstract class WebSurfer<U> implements Surfable<AbstractWebSite,SurfResult> {
	
	
	public abstract U useBrowsers(AbstractWebBrowser... browsers);

	
}
