import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int a[]=new int[10];
		int i,sum=0,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Array elements"  );
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+" Element :");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Array Elements are");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]= "+a[i]);
		}
		System.out.println("Sum of array elements :"+sum);
	       for(j=0;i<a.length;i++);
	       
	       {
	    	   for(j=i;j<a)
	    	   if (a[i]>a[j])
	              }
	      
	      
	    	  temp=a[i];
	    	  a[i]=a[j];
	    	  a[j]=temp;
	      }
     }
 }
   