package com.driver;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Desktop\\Automation Tools\\Java-Automation-8-master\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	
		driver.close();
		
		
	}

}
