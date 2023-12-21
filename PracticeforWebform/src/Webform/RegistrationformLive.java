package Webform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationformLive {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Desktop\\Automation Tools\\Java-Automation-8-master\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://imperial-english.com/public/partnership-registration");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("title")).sendKeys("Mr");
		Thread.sleep(1000);
		driver.findElement(By.id("firstName")).sendKeys("Test");
		Thread.sleep(1000);
		
		driver.findElement(By.id("surname")).sendKeys("SurTest");
		Thread.sleep(1000);
		driver.findElement(By.id("telephone")).sendKeys("123456789");
		Thread.sleep(1000);
		
		driver.findElement(By.id("mobile")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(By.id("email_new")).sendKeys("test@yopmail.com");
		Thread.sleep(1000);
		
		//driver.findElement(By.name("org_name")).sendKeys("TEst");
		//Thread.sleep(1000);
		driver.findElement(By.id("form_name")).sendKeys("TEst Address");
		Thread.sleep(1000);
		
		driver.findElement(By.id("zip_code")).sendKeys("123456");
		Thread.sleep(1000);
		Select country=new Select(driver.findElement(By.id("country_data")));
		country.selectByValue("50");
		Thread.sleep(1000);
		
		Select state=new Select(driver.findElement(By.id("state_data")));
		state.selectByValue("2862");
		Thread.sleep(1000);
		
		Select city=new Select(driver.findElement(By.id("city_data")));
		city.selectByValue("17340");
		Thread.sleep(1000);
		
		driver.findElement(By.id("new_acdamy_name")).sendKeys("Test56");
		Thread.sleep(1000);
		driver.findElement(By.id("new_acdamy_email")).sendKeys("Test56@yopmail.com");
		Thread.sleep(1000);
		
		Select course=new Select(driver.findElement(By.id("course")));
		course.selectByVisibleText("17340");
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkbox")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("label")).click();
		Thread.sleep(2000);
		
		
		
		
	

	}
}