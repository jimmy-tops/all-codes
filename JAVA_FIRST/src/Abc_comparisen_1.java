import java.util.Scanner;

public class Abc_comparisen_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter A :");
		a=sc.nextInt();
		System.out.println("Enter B :");
		b=sc.nextInt();
		System.out.println("Enter c :");
		c=sc.nextInt();
		
		if(a>b)
			
		{
			if(a>c)
			{
				System.out.println("A is max");
			}
			else
			{
				System.out.println("C is max ");
			}
		}
		else
		{
			if (b>c)
			{
				System.out.println("B is max ");
			}
			else
			{
				System.out.println("C is max ");
			}
				
		}
	}

}
