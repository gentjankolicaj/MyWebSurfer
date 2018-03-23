package core;

import website.core.Client;
import website.core.WebSite;

/**
 * 
 * @author gentjan_kolicaj
 *
 */
public abstract class AbstractWebSurfer implements Actionable {

	protected WebBrowser webBrowser;
	protected WebSite webSite;
	protected Client client;

	/**
	 * @param webBrowser
	 * @param webSite
	 * @param client
	 */
	public AbstractWebSurfer(WebBrowser webBrowser, WebSite webSite, Client client) {
		super();
		this.webBrowser = webBrowser;
		this.webSite = webSite;
		this.client = client;
	}

	public WebBrowser getWebBrowser() {
		return webBrowser;
	}

	public void setWebBrowser(WebBrowser webBrowser) {
		this.webBrowser = webBrowser;
	}

	public WebSite getWebSite() {
		return webSite;
	}

	public void setWebSite(WebSite webSite) {
		this.webSite = webSite;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
