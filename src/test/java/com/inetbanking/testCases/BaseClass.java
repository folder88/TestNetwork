package com.inetbanking.testCases;




import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.RealConfig;


public class BaseClass {
	
	
	RealConfig readconfig = new RealConfig();
	
	public String baseURL = readconfig.getbaseURL();
	public  String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	
	public static Logger Logger;
	
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws InterruptedException {
		
		Thread.sleep(3000);
		Logger  = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		
		
		if(br.equals("chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
			driver = new FirefoxDriver(); 
		}
		else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver(); 
		}
		System.out.println(baseURL);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("https://www.wienerstaedtische.at/privatkunden.html");
	
	}
	
	
	
	
	
	
	@AfterClass
	public void tearDown() {
		
		//driver.quit();
	}
	
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
