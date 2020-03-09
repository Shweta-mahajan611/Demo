package com.facebook.utility;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.facebook.excelutility.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Util 
{
static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel()
	{
		ArrayList<Object[]> list = new ArrayList<Object[]>();
		reader = new Xls_Reader(
				"C:\\Users\\shwetamahajan\\Documents\\facebook_data.xlsx");
		
		for(int rowno=2; rowno<=reader.getRowCount("FbTestData"); rowno++)
		{
			System.out.println();
			String firstname = reader.getCellData("FbTestData", "firstname", rowno);
			System.out.println(firstname);

			String surname = reader.getCellData("FbTestData", "surname", rowno);
			System.out.println(surname);

			String mobilenoOremailaddress = reader.getCellData("FbTestData", "mobilenoOremailaddress", rowno);
			System.out.println(mobilenoOremailaddress);
			
			String password = reader.getCellData("FbTestData", "password", rowno);
			System.out.println(password);
			
			Object obj[] = {firstname,surname,mobilenoOremailaddress,password};
			list.add(obj);
		}
		
		return list;
	}
	
}

