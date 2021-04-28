package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.TestCase;

public class WienerVersicherung extends BaseClass{

	@Test
	public void method() throws InterruptedException {
		
		
		
	
	
	TestCase y = new TestCase(driver) ;
	
    y.cookies();
	
	Thread.sleep(3000);	
	y.pensionVermögen();
	y.pensionVermögen2();
	y.folder();
		
	}
	
	
}
