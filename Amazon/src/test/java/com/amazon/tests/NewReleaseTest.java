package com.amazon.tests;

import org.testng.annotations.Test;

import com.amazon.base.Base;
import com.amazon.pages.NewReleasePage;

public class NewReleaseTest extends Base
{
	NewReleasePage newPage;
	@Test
	public void verifySearchProduct() 
	{
		try {
			newPage.searchProduct();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
