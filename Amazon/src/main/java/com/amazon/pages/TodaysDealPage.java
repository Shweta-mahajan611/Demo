package com.amazon.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.amazon.base.Base;

public class TodaysDealPage extends Base 
{
	@Test
	public void getAllDeals() throws InterruptedException
	{
		
		WebElement todaysDeals = driver.findElement(By.xpath("//a[contains(text(),'Today')]"));
		todaysDeals.click();
		Thread.sleep(2000);
		
		String xpath = "//div[@class='a-row dealDetailContainer']";
		
		List<WebElement> deals = driver.findElements(By.xpath(xpath));
		Thread.sleep(2000);
		System.out.println("Total Deals for the day : "+deals.size());
		Thread.sleep(2000);
		
		//get all the deals one by one
		for(int i=0; i<deals.size(); i++)
		{
			System.out.println("Deal "+i+" : " +deals.get(i).getText());
		}
		
		driver.close();
	}
}
