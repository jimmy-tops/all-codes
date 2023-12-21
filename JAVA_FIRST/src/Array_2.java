import java.util.Scanner;

public class Array_2 {
	
	public static void main(String[] args) {
		int a[]=new int[5];
		int i,sum=0,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Element");
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+" Element");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Array elements are");
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		
		System.out.println("Sum of Array Elements "+sum);
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
	
			}
       
           }

		System.out.println("Array elements are Aesending order ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		
		for(i=0;i<a.length;i++)
			/*
			 * { System.out.println("a["+i+"]="+a[i]); }
			 */

			/*
			 * System.out.println("Sum of Array Elements "+sum); for(i=0;i<a.length;i++)
			 */
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println("Array elements are Desending order ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
	}
	
}
