package Testngpak;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@Test
	public void test()
	{
		System.out.println(" Test");
	}
	@AfterTest
	public void afteTest()
	{
		System.out.println("after Test");
	}

}
