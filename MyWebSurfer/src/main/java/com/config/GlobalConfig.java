package com.config;

import java.util.concurrent.TimeUnit;

import com.report.ReportFileType;

/**
 * 
 * @author gentjan koli�aj
 *
 */
public class GlobalConfig {

	//Config for webDrivers exes
	public static final String DRIVERS_PATH= "C:\\WebDrivers";
    
	
	//Time unit config 
	public static final TimeUnit TIME_UNIT=TimeUnit.SECONDS;
	
	//Chrome browser timeout config
	public static final int C_TIMEOUT=5000;
	
	
	//Firefox browser timeout config
	public static final int F_TIMEOUT=5000;
	
	
	//Edge browser timeout config
	public static final int E_TIMEOUT=5000;
	
	//HtmlUnit browser timeout config
	public static final int H_TIMEOUT=5000;
	
	
	//Config for saving surfing results
	public static final boolean REPORT_SURF_RESULTS=true;
	public static final ReportFileType REPORT_FILE_TYPE=ReportFileType.XLSX;
	
}
