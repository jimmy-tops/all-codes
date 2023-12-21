package com.Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class GetUrl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Desktop\\Automation Tools\\Java-Automation-8-master\\Automation Tools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
        

	}
	
}
