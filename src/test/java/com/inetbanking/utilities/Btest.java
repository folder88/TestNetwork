package com.inetbanking.utilities;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.testCases.BaseClass;

public class Btest extends BaseClass {

	 
	@Test
	public void method() {
		
		
		
		String name = username;
		driver.get("http://demo.guru99.com/v4/");
		Logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		
	}

}
