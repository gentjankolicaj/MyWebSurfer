package com.report;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.maven.shared.utils.StringUtils;
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
	private static int fileNumber = 0;

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

		String filePath = buildFilePath(fileName, ReportFileType.XLSX);

		if (existsSameFile(filePath)) {
			filePath = buildFilePath(fileName, ReportFileType.XLSX);
			outputStream = new FileOutputStream(filePath);
		} else
			outputStream = new FileOutputStream(filePath);

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
		outputStream.close();

	}

	private static void saveResultsToXls(List<SurfResult> list, String fileName, ReportFileType fileType)
			throws Exception {

		String filePath = buildFilePath(fileName, ReportFileType.XLS);

		if (existsSameFile(filePath)) {
			filePath = buildFilePath(fileName, ReportFileType.XLS);
			outputStream = new FileOutputStream(filePath);
		} else
			outputStream = new FileOutputStream(filePath);

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
		outputStream.close();

	}

	private static String buildFilePath(String fileName, ReportFileType fileType) {

		return homeDirectory + fileSeparator + fileName + "_" + fileNumber + "." + fileType.getFileExtension();

	}

	private static boolean existsSameFile(String filePath) {
		File fileObject = new File(filePath);
		if (fileObject.exists()) {
			String name = fileObject.getName().trim();
			String fileName = StringUtils.substring(name, 0, name.indexOf("."));
			String number = StringUtils.substring(fileName, fileName.indexOf("_") + 1, fileName.length());
			fileNumber = Integer.valueOf(number) + 1;
			return true;
		} else {
			fileNumber++;
			return false;
		}

	}

}
