package com.inetbanking.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.Baying_Process;
import com.inetbanking.pageObjects.DemoWebShop;
import com.inetbanking.pageObjects.Login_Page;







public class By_computer_test extends BaseClass{
	
	public static String slow_computer_id = "product_attribute_72_5_18_52";
	public static String medium_computer_id = "product_attribute_72_5_18_53";
	public static String fast_computer_id = "product_attribute_72_5_18_65";
	
	public static String pc_8gb = "product_attribute_72_6_19_91";
	public static String pc_4gb = "product_attribute_72_6_19_55";
	
	public static String pc_harddrive_320 = "product_attribute_72_3_20_57";
	public static String pc_harddrive_400 = "product_attribute_72_3_20_58";
	
	
	
	public static String Ground = "Ground";
	public static String Cash_on_delivery="Cash_on_delivery";
	
	
	
	@Test(dataProvider="LoginData")
	public void folder(String pc,String memory,String HardDrive) throws InterruptedException {
		
		DemoWebShop demowebshow = new DemoWebShop(driver);
		Login_Page Login_Page = new Login_Page(driver);
		Baying_Process by = new Baying_Process(driver);
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		demowebshow.Login_Button();
		
		Logger.info("Username and Password are correct");
		
		Login_Page.Email("corneliugurin@gmail.test");
		
        Login_Page.Password("lenroc88");
        
		Login_Page.Login();
		
		Logger.info("Login was succesful");
		demowebshow.COMPUTERS();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/a/img")).click();
		Logger.info("Acces Deskop Computer succesfully");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")).click();
		Logger.info("Acces cheap Computer succesfully");
		
		driver.findElement(By.id(pc)).click();
		
		
		driver.findElement(By.id(memory)).click();
		
		
		driver.findElement(By.id(HardDrive)).click();
		
	
		driver.findElement(By.id("add-to-cart-button-72")).click();
		
		
		driver.findElement(By.className("cart-label")).click();
		Logger.info("Acces shopping card");
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		
		
		by.Payment_process(Ground, Cash_on_delivery);
		
		
		driver.findElement(By.className("ico-logout")).click();
		
	}
	
	

	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException
	
	
	{
	
		String logindata[][]=new String [3][3];
		
		logindata[0][0]=medium_computer_id;  logindata[0][1]=pc_4gb; logindata[0][2]=pc_harddrive_320;
		logindata[1][0]=slow_computer_id; logindata[1][1]=pc_8gb; logindata[1][2]=pc_harddrive_320;
		logindata[2][0]=medium_computer_id; logindata[2][1]=pc_4gb;logindata[2][2]=pc_harddrive_320;
	
		
		
		
		
		return logindata;
	}
	
	
}