package com.prcatice;

public class MinAndMaxOfArray {
	public static void main(String[] args) {
		
		int[] number = { 1,0,0,4,50};
		
		int min =number[0],max=number[0];
		
		for (int i=0;i<number.length;i++)
		{
			if (max < number[i] )
			{
				max=number[i];
				
			}
			if (min > number[i])
			{
				min=number[i];
			}
		}
		System.out.println("max number "+max );
		System.out.println("min number "+min);
		
	}

}
