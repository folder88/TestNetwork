package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class RealConfig {

	
	static Properties pro;
	
	
	
	
	
	
	public  RealConfig() 
	{	
		File src = new File("./Configuration/confing.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println("Exception is " + e.getMessage()); 
		}
		
	}
	
	
public String getbaseURL() {
		
		String url = pro.getProperty("baseUrl");
		return url;
	}
	
public  String getUsername() {
		
		String username = pro.getProperty("username");
		return username;
	}

public String getPassword() {
	
	String password = pro.getProperty("password");
	return password;
}


public String getChromePath() {
	
	String chromepath = pro.getProperty("firefox");
	return chromepath;
}

public String getFirefoxpath() {
	
	String firefoxpath = pro.getProperty("chromepath");
	return firefoxpath;
}


}
