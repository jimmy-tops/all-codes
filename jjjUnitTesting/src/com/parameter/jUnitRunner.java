package com.parameter;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class jUnitRunner {

	public static void main(String [] args) {
		org.junit.runner.Result result = JUnitCore.runClasses(ArithmeticTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	
}
}
