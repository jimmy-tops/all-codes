package com.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aa\\Desktop\\Automation Tools\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("JImmy");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("JImmy");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(20000);

		driver.close();
		

		
	}
	
	
}
