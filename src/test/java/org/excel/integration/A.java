package org.excel.integration;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class A  {
public static String  getData (int rowNo, int cellNo) throws Throwable {
	String v= null;
	File location = new File("F:\\SOFTWARES\\selenium\\WORKED_FILED\\eclipse-workspace_selenium_projrcts\\Demo\\testdatas\\TestRun.xlsx");
	FileInputStream stream = new FileInputStream(location);
	Workbook w = new XSSFWorkbook(stream);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(rowNo);
	Cell c = r.getCell(cellNo);
	int cellType = c.getCellType();
	if (cellType==1) {
	v = c.getStringCellValue();
	}
	else
	{
	if (DateUtil.isCellDateFormatted(c)) {
	Date dateCellValue = c.getDateCellValue();
	SimpleDateFormat simple = new SimpleDateFormat ("dd-MMM-yyyy");
	v = simple.format(dateCellValue);
	}
	else
	{
	double numericCellValue = c.getNumericCellValue();
	long l = (long) numericCellValue;
	v = String.valueOf(l);
	}}
	return v;	
    }}
