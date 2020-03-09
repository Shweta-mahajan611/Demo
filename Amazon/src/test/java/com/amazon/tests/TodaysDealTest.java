package com.amazon.tests;

import org.testng.annotations.Test;

import com.amazon.base.Base;
import com.amazon.pages.TodaysDealPage;

public class TodaysDealTest extends Base
{
	TodaysDealPage deals;
	@Test
	public void verify()
	{
		try {
			deals.getAllDeals();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
