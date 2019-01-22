package com.core.webbrowser;

/**
 * 
 * @author gentjan koli�aj
 *
 */
public enum MyBrowserType {

	CHROME("CHROME"), FIREFOX("FIREFOX"), HTML_UNIT("HTML_UNIT"),EDGE("EDGE");
	
	private String value;
	
	private MyBrowserType(String value) {
		this.value=value;
	}
	
	public String getValue(){
		return value;
	}
}
