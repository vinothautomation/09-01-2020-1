package com.org;
import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ToCreateAnExcelSheet {
public static void main(String[] args) throws Throwable {
	File location = new File("F:\\SOFTWARES\\selenium\\WORKED_FILED\\eclipse-workspace_selenium_projrcts\\Demo\\testdatas\\CreateNew1.xlsx");
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet("VinothBusinessPlan");
	Row r = s.createRow(5);
	Cell c = r.createCell(5);
	c.setCellValue("Sonam");
	FileOutputStream o = new FileOutputStream (location);
	w.write(o);
	System.out.println("Wrote Sucessfully");
}
}
