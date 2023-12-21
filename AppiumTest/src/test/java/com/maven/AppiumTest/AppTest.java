package com.maven.AppiumTest;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

/**
 * Unit test for simple App.
 */
public class AppTest
{

@Test
public void appiumTest() throws InterruptedException, MalformedURLException
{
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("Jimmy");
	options.setApp("C:\\Users\\baps\\Desktop\\Automation Tools\\Testing Api\\ApiDemos-debug.apk");
	
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
	
	Thread.sleep(7000);
	
	driver.findElement(By.id("android:id/text1")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Content\"]")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Graphics\"]")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	
	
	
			driver.quit();
	
}
}
