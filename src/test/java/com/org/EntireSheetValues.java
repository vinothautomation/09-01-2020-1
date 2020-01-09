package com.org;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EntireSheetValues {
public static void main(String[] args) throws Throwable {
	File loc = new File("F:\\SOFTWARES\\selenium\\WORKED_FILED\\eclipse-workspace_selenium_projrcts\\Demo\\testdatas\\TestRun.xlsx");
	
	FileInputStream stream = new FileInputStream (loc);
	
	Workbook w = new XSSFWorkbook(stream);
	
	Sheet s = w.getSheet("Sheet1");
	
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
	Row r = s.getRow(i);
	
	for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
	Cell c = r.getCell(j);
	
	System.out.println(c);
		
}}}}
