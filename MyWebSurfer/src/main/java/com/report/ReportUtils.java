package com.report;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.config.GlobalConfig;
import com.core.surfer.SurfResult;

public class ReportUtils {

	private static String homeDirectory = "";
	private static String fileSeparator = "";
	private static OutputStream outputStream;
	private static int fileNumber=0;

	static {
		homeDirectory = System.getProperty("user.home");
		fileSeparator = System.getProperty("file.separator");

	}

	public static void saveResults(List<SurfResult> list, String fileName) throws Exception {
		if (GlobalConfig.SaveSurfResults) {
			if (GlobalConfig.ReportFile.equals(ReportFileType.XLSX)) {
				saveResultsToXlsx(list, fileName, GlobalConfig.ReportFile);

			} else if (GlobalConfig.ReportFile.equals(ReportFileType.XLS)) {
				saveResultsToXls(list, fileName, GlobalConfig.ReportFile);
			}
		}

	}

	private static void saveResultsToXlsx(List<SurfResult> list, String fileName, ReportFileType fileType)
			throws Exception {
		setOutputStream(buildFilePath(fileName, fileType));
		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet(GlobalConfig.sheetName);

		Row row;
		Cell cell1;
		Cell cell0;

		for (int r = 0; r < list.size(); r++) {
			SurfResult tmp = list.get(r);
			row = sheet.createRow(r);

			cell0 = row.createCell(0);
			cell0.setCellValue(tmp.getKey());

			cell1 = row.createCell(1);
			cell1.setCellValue(tmp.getValue());
		}

		workbook.write(outputStream);
		workbook.close();
		outputStream.flush();

	}

	private static void saveResultsToXls(List<SurfResult> list, String fileName, ReportFileType fileType)
			throws Exception {
		setOutputStream(buildFilePath(fileName, fileType));
		Workbook workbook = WorkbookFactory.create(false); // False argument results in creation of HSSFWorkbook object

		Sheet sheet = workbook.createSheet(GlobalConfig.sheetName);

		Row row;
		Cell cell1;
		Cell cell0;

		for (int r = 0; r < list.size(); r++) {
			SurfResult tmp = list.get(r);
			row = sheet.createRow(r);

			cell0 = row.createCell(0);
			cell0.setCellValue(tmp.getKey());

			cell1 = row.createCell(1);
			cell1.setCellValue(tmp.getValue());
		}

		workbook.write(outputStream);
		workbook.close();
		outputStream.flush();

	}

	private static void setOutputStream(String file) throws Exception {
		if (outputStream != null) {
			outputStream.flush();
			outputStream.close();
			outputStream = new FileOutputStream(file);
		}
		else

			outputStream = new FileOutputStream(file);

	}

	private static String buildFilePath(String fileName, ReportFileType fileType) {
		fileNumber++;
		return homeDirectory + fileSeparator + fileName + "_"+fileNumber+"." + fileType.getFileExtension();
	}

}
