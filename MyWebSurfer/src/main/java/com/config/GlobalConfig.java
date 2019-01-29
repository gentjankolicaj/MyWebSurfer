package com.config;

import java.util.concurrent.TimeUnit;

import com.report.ReportFileType;

/**
 * 
 * @author gentjan koliçaj
 *
 */
public class GlobalConfig {
	
	public static String homeDirectory =System.getProperty("user.home");
	public static String fileSeparator = System.getProperty("file.separator");

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
	public static boolean SaveSurfResults=true;
	public static ReportFileType ReportFile=ReportFileType.XLSX;
	public static String sheetName = "report_sheet";//default sheet name for every xls,xlsx file.
	
}
