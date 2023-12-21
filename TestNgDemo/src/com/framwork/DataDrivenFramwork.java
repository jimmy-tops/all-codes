package com.framwork;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDrivenFramwork {
	
	@Test
	public String[][] readExel() {
		String data[][]=null;
		String filepath =".xlsx";
		File file=new File(filepath);
		Workbook workbook=new XSSFWorkbook(file);
		Sheet sheet=Workbook.getsheet("Sheet1");
		int rows=sheet.getPhysicalNumberOfRows();
		System.out.println("total rows :"+rows);
		data=new String[rows][];
		for(int i=0;i<data.length;i++)
			
		{
			Row row=sheet.getRow(i);
			int cols=row.getPhysicalNumberOfCells();
			System.out.println("total cols:"+cols);
			data[i]=new String[cols];
			for(int j=0;j<data[i].length;j++);
			{
				int j;
				Cell cell=row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j]=cell.getStringCellValue();
						
			}
		}
		return data;
				
	}
}
