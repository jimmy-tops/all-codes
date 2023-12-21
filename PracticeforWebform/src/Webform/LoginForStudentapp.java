package Webform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForStudentapp {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Desktop\\Automation Tools\\Java-Automation-8-master\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://student.imperial-english.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("user_email")).sendKeys("01@yopmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("user_password")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"my_form\"]/button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("Notes")).click();
		Thread.sleep(1000);
		
		
	
	
	

}
}
