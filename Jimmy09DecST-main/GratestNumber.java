package com.prcatice;

import java.util.Scanner;

public class GratestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(" Enter  First value  ");
		int a = scanner.nextInt();

		System.out.println(" Enter Second  value ");
		int b = scanner.nextInt();

		System.out.println(" Enter Third  value ");
		int c = scanner.nextInt();

		scanner.close();

		if (a > b && a > c) {
			// if (a > c )
			System.out.println("  A is Gretest NUm :" +a);
			
		} else if (b > a && b > c) {
			if (b > c)
				System.out.println(" B Is Gretest Num :" +b);
		}
		else if (c > a && c > b ) {
			// if (c > b )
			System.out.println(" C is Gretest Num : " +c);
		}

	}

}
