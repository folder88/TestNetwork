package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inetbanking.testCases.BaseClass;

public class Tesst extends BaseClass{
	
	
	
	 @Test
	  public void testCase02() throws InterruptedException {
		 
		
		 
		 
		 
		 
		 driver.get("https://www.wienerstaedtische.at/privatkunden.html");
		 Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id=\"nav_sub\"]/ul/li[1]/a")).click();
		    driver.findElement(By.xpath("//*[@id=\"nav_sub\"]/ul/li[1]/div/ul/li[3]/a")).click();
		    driver.findElement(By.xpath("//*[@id=\"nav_sub\"]/ul/li[1]/div/ul/li[3]/div/div[2]/ul/li[4]/a")).click();
		    driver.findElement(By.xpath("//*[@id=\"content\"]/aside/section[1]/a")).click();
		    
		    WebElement y = driver.findElement(By.xpath("//*[@id=\"abschluss_form\"]/div[1]/div/div[2]/div/div[1]/button"));
		    System.out.println(y);
		    y.click();
		    WebElement x = driver.findElement(By.xpath("//*[@id=\"Pensionslueckenrechner_person_geburtsdatum\"]"));
		    System.out.println(x);
		    x.click();
		    x.sendKeys("20.05.1988");
		    driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/form/div[3]/button[2]")).click();
		    WebElement t = driver.findElement(By.xpath("//*[@id=\"abschluss_form\"]"));
		    System.out.println(t);
		    //WebElement z = driver.findElement(By.xpath("//body/div[@id='overall']/div[@id='content']/main[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]"));
		    
		    //String ClassName = "big nowrap";
		    List<WebElement> f = driver.findElements(By.xpath("//form[@id=\"abtschluss_form\"]//span[@xpath=\"10\"]"));
		   System.out.println(f);
		    //int slidesize = driver.findElements(By.className(ClassName)).size();
		    //System.out.println(slidesize);
		    
		    //int s = driver.findElements(By.linkText("Weiter zu Ihrem Ergebnis")).size();
		    //System.out.println(s);
		  //*[@id="abschluss_form"]/div[3]/button[1]
		   // WebElement n = driver.findElement(By.className("powermail_field powermail_submit"));
		    //System.out.println(m);
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		    //String s = m.getTagName();
		   //System.out.println(s);
		    //m.click();
		 
	 
	    //driver.get("https://www.wienerstaedtische.at/privatkunden/pension-vermoegen/pensionsvorsorge/pensionskonto-service/pensionslueckenrechner.html#luecke");
	    //Thread.sleep(3000);
	    //driver.findElement(By.xpath("//*[@id=\"abschluss_form\"]/div[1]/div/div[2]/div/div[1]/button")).click();
	    //driver.findElement(By.xpath("//*[@id=\"Pensionslueckenrechner_person_geburtsdatum\"]")).sendKeys("22.05.1988");
	   //Logger.info("1");
	   //WebElement x =driver.findElement(By.id("Pensionslueckenrechner_person_geschlecht_chosen"));
	    //driver.findElement(By.id("Pensionslueckenrechner_person_geburtsdatum")).clear();
	   // driver.findElement(By.id("Pensionslueckenrechner_person_geburtsdatum")).sendKeys("22.05.1988");
	   
	  }
	
	

}
