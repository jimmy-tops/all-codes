package Testngpak;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo99GuruGroup {
   ChromeDriver driver;
  @Test(groups = {"Get_url"})
	public void geturl() throws InterruptedException {
		 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Desktop\\Automation Tools\\Java-Automation-8-master\\Automation Tools\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.demo.guru99.com/V4/");
		  driver.manage().window().maximize();
	      Thread.sleep(2000);
 	    }
	
	@Test(groups = {"Enter_Credemcial"})		
		  public void login() {
			  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr516572");
	          driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("AsAzyza");
	          driver.findElement(By.id("message18")).click();
	          
		  }
	
}
