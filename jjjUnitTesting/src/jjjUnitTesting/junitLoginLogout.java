package jjjUnitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitLoginLogout {
	
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() throws InterruptedException
	       {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Desktop\\Automation Tools\\Java-Automation-8-master\\Automation Tools\\chromedriver.exe");
			driver=new ChromeDriver();
			try {
				driver.get("https://www.saucedemo.com/v1/");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
	       }
	
	@Before
	public void before() throws InterruptedException
	{
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    Thread.sleep(2000);
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    Thread.sleep(4000);
	    driver.findElement(By.id("login-button")).click();
	    Thread.sleep(4000);
	    
	}
	@Test
	public void test1()
	{
		System.out.println(" test 1");
	}
	@Test
	public void test2()
	{
		System.out.println(" test 2");
	}
	@After
	public void after()
	{
		System.out.println("after test");
	}
	@AfterClass
	public static void afterclass()
	{
		System.out.println("after class ");
	}

	
	

}
