package com.driver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestSlenium {
	
	    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Desktop\\Automation Tools\\Java-Automation-8-master\\Automation Tools\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    //driver.get("https://www.saucedemo.com/v1/");
	    //Thread.sleep(2000);
	   // driver.manage().window().maximize();
	   // Thread.sleep(2000);
	    //driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
	    //Thread.sleep(2000);
	    //driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    //Thread.sleep(4000);
	    //driver.findElement(By.id("login-button")).click();
	    //Thread.sleep(4000);
	    //driver.close();
	   
	    driver.get("https://student.imperial-english.com/");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.id("user_email")).sendKeys("01@yopmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("user_password")).sendKeys("secret_sauce");
	    Thread.sleep(2000);
	    driver.findElement(By.className("btn btn-danger.btn-sm.mb-2")).click();
	    Thread.sleep(8000);
	    driver.close();					
		}
	                     
	}
	//public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\baps\\Desktop\\Automation Tools\\Java-Automation-8-master\\Automation Tools\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
        //driver.get("https://student.imperial-english.com/");
        //Thread.sleep(2000);
        //driver.manage().window().maximize();
        //Thread.sleep(2000);
         // System.out.println(driver.getPageSource());
         // Thread.sleep(2000);
         // System.out.println(driver.getWindowHandle());
         // Thread.sleep(2000);
         // System.out.println(driver.getClass());
        //  Thread.sleep(2000);
        //  System.out.println(driver.get(null));
        
          //  System.out.println(driver.getCurrentUrl());
           // Thread.sleep(2000);
            //System.out.println(driver.getTitle());
            //Thread.sleep(2000);
        //driver.close();
        //Thread.sleep(2000);
	


