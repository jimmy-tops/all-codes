package Webform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class WebformFor99 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Desktop\\Automation Tools\\Java-Automation-8-master\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Jimmy");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Thakkar");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("Test@yopmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("address1")).sendKeys("Test Address for line 1");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("Ahmedabad Test");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.name("state")).sendKeys("Gujarat Test");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("0000000");
		Thread.sleep(2000);
		Select county=new Select(driver.findElement(By.name("country")));
		Thread.sleep(2000);
		county.selectByVisibleText("AUSTRALIA");
		
		driver.findElement(By.id("email")).sendKeys("Test@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmPassword")).sendKeys("123456789");
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();		
		Thread.sleep(7000);
		
		driver.close();
		Thread.sleep(2000);
	}

}
