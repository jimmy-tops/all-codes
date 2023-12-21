package jjjUnitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class jUnitAnotetionDemo {
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("Before class ");
	}
	@Before
	public void before()
	{
		System.out.println("before test");
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
