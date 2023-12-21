package jjjUnitTesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class junitTesting {
	 
	public static void main(String[] args) {
		Result result=JUnitCore.runClasses(junittesing.class);
		System.out.println("Result :"+result.wasSuccessful());
	}

}
