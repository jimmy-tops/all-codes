import java.util.Scanner;

public class Switch_case {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A:");
		a=sc.nextInt();
		System.out.println("Enter B:");
		b=sc.nextInt();
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. multi");
		System.out.println("4. divi");
		
		System.out.println("Enter choice");
		d=sc.nextInt();
		
		switch(d)
		{
		case 1:
			c=a+b;
			System.out.println("Addition: "+c);
			break;
		case 2:
	     	c=a-b;
		    System.out.println("Subtcation"+c);
	        break;	
		
		case 3:
			c=a*b;
			System.out.println("Multipication: "+c);
		    break;
		case 4:
			c=a/b;
			System.out.println("Division: "+c);
		    break;
	default:
		System.out.println("invaild choice");
       break;		
		}
	}
	

}
