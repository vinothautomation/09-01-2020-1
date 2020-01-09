package com.org;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToFindTheCellType {
public static void main(String[] args) throws Throwable {
	File loc = new File("F:\\SOFTWARES\\selenium\\WORKED_FILED\\eclipse-workspace_selenium_projrcts\\Demo\\testdatas\\TestRun.xlsx");
	
	FileInputStream stream = new FileInputStream(loc);
	
	Workbook w = new XSSFWorkbook(stream);
	
	Sheet s = w.getSheet("Sheet1");
	
	Row r = s.getRow(1);
	
	
	Cell c = r.getCell(0);
		
	int cellType = c.getCellType();

	System.out.println(cellType);
	
	}}
