package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	
	public static void main(String[] args) throws IOException  {
		
		File xlloc =new File("C:\\Users\\Anis\\Documents\\Eclipse\\FirstMavenProject\\Excel\\TestingData.xlsx");
	
		FileInputStream filein = new FileInputStream(xlloc);
		
		Workbook w = new XSSFWorkbook(filein);
	    Sheet s = w.getSheet("Data1");
		
		Row r = s.getRow(4);
		
		Cell c = r.getCell(1);
		System.out.println(c);
		
		
	}

}
