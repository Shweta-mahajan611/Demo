package com.facebook.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.facebook.excelutility.Xls_Reader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestData 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// get data from excel file
		Xls_Reader reader = new Xls_Reader("C:\\Users\\shwetamahajan\\Documents\\facebook_data.xlsx");
		int rowcount = reader.getRowCount("FbTestData");
		
		//Add column in excel file
		reader.addColumn("FbTestData", "status");
		
		//parameterization
		for(int rowno=2; rowno<=rowcount; rowno++)
		{
			System.out.println();
			String firstName = reader.getCellData("FbTestData", "firstname", rowno);
			System.out.println(firstName);

			String surName = reader.getCellData("FbTestData", "surname", rowno);
			System.out.println(surName);

			String emailOrMob = reader.getCellData("FbTestData", "mobilenoOremailaddress", rowno);
			System.out.println(emailOrMob);

			String emailOrMob1 = reader.getCellData("FbTestData", "mobilenoOremailaddress", rowno);
			System.out.println(emailOrMob1);
			
			String newPassword = reader.getCellData("FbTestData", "password", rowno);
			System.out.println(newPassword);
			
			// web driver code for getting data from excel file
			driver.findElement(By.id("u_0_m")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys(firstName);
			Thread.sleep(1000);
			
			driver.findElement(By.id("u_0_o")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys(surName);
			Thread.sleep(1000);
			
			driver.findElement(By.id("u_0_r")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys(emailOrMob);
			Thread.sleep(1000);
			
			driver.findElement(By.id("u_0_r")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys(emailOrMob1);
			Thread.sleep(1000);
			
			driver.findElement(By.id("u_0_w")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys(newPassword);
			Thread.sleep(1000);
			
			
			//write into excel file
			reader.setCellData("FbTestData", "status", rowno, "20");
		}
		driver.close();
	
	}
}
