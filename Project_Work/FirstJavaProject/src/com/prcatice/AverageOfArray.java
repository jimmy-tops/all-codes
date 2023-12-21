package com.prcatice;

public class AverageOfArray {

	public static void main(String[] args) {
		

		int[] number = { 1,2,5,4,5};
		
		float
		sum=0;
		for (int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
	
		}
		float avarage=sum/number.length;
		
		System.out.println("Avarage Of Array :"+ avarage);
	}
}
