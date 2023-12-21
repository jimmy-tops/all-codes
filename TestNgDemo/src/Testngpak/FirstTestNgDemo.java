package Testngpak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNgDemo {
	
	 ChromeDriver driver;
	  @Test(priority = 0)
	  
  public void geturl() throws InterruptedException {
	 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Desktop\\Automation Tools\\Java-Automation-8-master\\Automation Tools\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://careercenter.tops-int.com/");
	  driver.manage().window().maximize();
      Thread.sleep(2000);
      
	  }
	  @Test(priority = 1)
	  public void credention() throws InterruptedException {
	  
      driver.findElement(By.id("mobile")).sendKeys("9276808668");
      Thread.sleep(2000);
      driver.findElement(By.id("password")).sendKeys("9276808668");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
      Thread.sleep(2000);
      //driver.findElement(By.name("submit")).click();
      //Thread.sleep(2000);
	  }
	  @Test(priority = 2)
	  public void logot() throws InterruptedException {
	  
      driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span[2]/i")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[4]/a")).click();
      Thread.sleep(2000);
     	  
  }
}
