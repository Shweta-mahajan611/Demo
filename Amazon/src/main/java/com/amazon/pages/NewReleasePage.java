package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.amazon.base.Base;

public class NewReleasePage extends Base
{
	@Test
	public void searchProduct() throws InterruptedException
	{
		WebElement newReleases;
		
	    newReleases = (WebElement) driver.findElement(By.xpath("//a[contains(text(),'New Releases')]"));
		newReleases.click();
		Thread.sleep(2000);
		
		WebElement product = driver.findElement(By.className("p13n-sc-truncated"));
		Thread.sleep(1000);
		
		String product_Name = product.getText();
		System.out.println("The first product name is : "+product_Name);
		
		driver.close();
	}
}
