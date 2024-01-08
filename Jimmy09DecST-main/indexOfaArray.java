package com.prcatice;

import java.util.Scanner;

public class indexOfaArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] number = { 1,2,3,4,5};
	
		System.out.println("Enter the value to find ");
		int value =sc.nextInt();
		
		int ind = -1; 
		
		for (int i=0;i<number.length;i++)
		{
			if (number[i]==value)
			{
				ind=i;
			}
	
		}
		if (ind>=0)
			System.out.println("inndex of given number is "+ind);
		else {
			System.out.println("Number not found ");
		}
	}
}
