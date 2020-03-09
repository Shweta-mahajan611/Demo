package com.facebook.excelutility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Xls_Writer 
{
	public static void main(String []args) throws IOException
	{
		Xls_Reader reader = new Xls_Reader("C:\\Users\\shwetamahajan\\Documents\\facebook_data.xlsx");
		String sheetName = "FbTestData";
		String data = reader.getCellData(sheetName, "firstname", 2);
		System.out.println(data);
		
		int rowCount = reader.getRowCount(sheetName);
		System.out.println("no of rows : " +rowCount);
		
		reader.addColumn("FbTestData", "age");
		
		if(!reader.isSheetExist("FbTestData"))
		{
			reader.addSheet("FbTestData");
		}
		int colCount = reader.getColumnCount(sheetName);
		System.out.println("no of columns : "+colCount);
		
		reader.setCellData("FbTestData", "age", 2, "20");
		
		//using scanner
		Scanner console = new Scanner(System.in);
		String console_data = console.nextLine();
		System.out.println("console data : "+console_data);
		
		//using InputStreamReader
		BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
		String buff_data = breader.readLine();
		System.out.println("Cons");
		
		
		
	}
	
	
}
