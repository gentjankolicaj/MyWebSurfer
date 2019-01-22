package com.core.website;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public abstract class AbstractWebSite {

	protected String server;
	protected int port;
	

	/**
	 * 
	 */
	public AbstractWebSite() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param server
	 * @param port
	 * @param region
	 * @param location
	 * @param owner
	 */
	public AbstractWebSite(String server, int port) {
		super();
		this.server = server;
		this.port = port;
		
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	
}
