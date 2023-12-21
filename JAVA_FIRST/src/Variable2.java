import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Variable2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		double c,d,total;
		System.out.println("Enter A value:");
		a=sc.nextInt();
		System.out.println("Enter B value:");
		b=sc.nextInt();
		System.out.println("Enter c value:");
		c=sc.nextDouble();
		/*
		 * System.out.println("Enter c value:"); c=sc.nextInt();
		 */		System.out.println("Enter D value:");
		d=sc.nextDouble();
		total=a+b+c+d;
		System.out.println("Toatal: "+total);
		
		total=a*b*c*d;
		System.out.println("multi: "+total);
		total=a/b/c/d;
		System.out.println("dive: "+total);
		total=a-b-c-d;
		System.out.println("min: "+total);
		total=a+b-c/d;
		System.out.println("diffent: "+total);
		
	}
}