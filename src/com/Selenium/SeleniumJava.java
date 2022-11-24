package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJava {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Java\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com");
		
		d.manage().window().maximize();
		
		int b = d.hashCode();
		
		System.out.println(b);
		
		String a = d.getTitle();		
		
		System.out.println(a);
		d.navigate().to("https://www.amazon.com");
		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();
		
		String c = d.getTitle();
		System.out.println(c);
		
		
		
	}

}
