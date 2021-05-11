package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
	
	
	
	
	
	
	
	
	@Test(dataProvider="LoginData")
	public void folder(String pc,String memory,String HardDrive) throws InterruptedException {
		
		DemoWebShop demowebshow = new DemoWebShop(driver);
		Login_Page Login_Page = new Login_Page(driver);
		
		
		Thread.sleep(2000);
		demowebshow.Login_Button();
		Thread.sleep(2000);
		Logger.info("Username and Password are correct");
		Thread.sleep(2000);
		Login_Page.Email("corneliugurin@gmail.test");
		Thread.sleep(2000);
        Login_Page.Password("lenroc88");
        Thread.sleep(2000);
		Login_Page.Login();
		Thread.sleep(2000);
		Logger.info("Login was succesful");
		demowebshow.COMPUTERS();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/a/img")).click();
		Logger.info("Acces Deskop Computer succesfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")).click();
		Logger.info("Acces cheap Computer succesfully");
		Thread.sleep(5000);
		driver.findElement(By.id(pc)).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id(memory)).click();
		Thread.sleep(3000);
		
		
		Thread.sleep(3000);
		driver.findElement(By.id(HardDrive)).click();
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.id("add-to-cart-button-72")).click();
		
		
		driver.findElement(By.className("cart-label")).click();
		Logger.info("Acces shopping card");
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//input[@title = \"Continue\"]")).click();
		Logger.info("First Click");
		Thread.sleep(5000);
		WebElement x = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
		x.click();
		Logger.info("Pass Shipping Adress");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
		Logger.info(" Pass Shipping Method");
		Thread.sleep(2000);
		driver.findElement(By.id("paymentmethod_2")).click();
		Logger.info(" Insert Credit Card");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
		Logger.info("  Pass Payment Method");
		Thread.sleep(2000);
		driver.findElement(By.id("ExpireMonth")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ExpireMonth\"]/option[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ExpireYear")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ExpireYear\"]/option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("CardholderName")).sendKeys("Barbara Gordon");
		Thread.sleep(2000);
		driver.findElement(By.id("CardCode")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.id("CardNumber")).sendKeys("4485564059489345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
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