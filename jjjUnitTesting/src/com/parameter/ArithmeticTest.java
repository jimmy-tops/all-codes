package com.parameter;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArithmeticTest {
	
	int fnumber ,sNumber,result;
	Arithmatic arithmetic;
	
	
	public ArithmeticTest(int fnumber, int sNumber, int result) {
		super();
		this.fnumber = fnumber;
		this.sNumber = sNumber;
		this.result = result;
	}

	@Before
	public void befor()
	{
		arithmetic =new Arithmatic();
	}
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object [][] {{1,2,3},{11,22,33},{12,34,46}});
	}
	 @Test
	public void test()
	{
		 System.out.println("Result : "+result);
		 assertEquals(result,arithmetic.sum(fnumber, sNumber));
		 
	}

	}
  
