import java.util.Scanner;

public class Star_loop_spsce {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N ");
		n=sc.nextInt();
		while(n>0)
		      {
			sum=sum+n;
			n--;
			 }
		System.out.println("Sum"+sum);
		}
		
			
	}


