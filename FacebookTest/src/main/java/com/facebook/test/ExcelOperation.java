package com.facebook.test;

import com.facebook.excelutility.Xls_Reader;
public class ExcelOperation 
{
	public static void main(String[] args) 
	{
		Xls_Reader reader = new Xls_Reader("C:\\Users\\shwetamahajan\\Documents\\facebook_data.xlsx");
		
	
		if(reader.isSheetExist("HomePage"))
			System.out.println("Sheet exist");
		else
			reader.addSheet("HomePage");	
		
		int colCount = reader.getColumnCount("FbTestData");
		System.out.println("no of columns : " +colCount);
		
		System.out.println(reader.getCellData("FbTestData", "firstname", 2));
		System.out.println(reader.getCellRowNum("FbTestData", "firstname", "priya"));
	}
}
