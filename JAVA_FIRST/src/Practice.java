import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
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
				System.out.println("A is max ");
			}
			else
			{
				System.out.println("c is max ");
			}
		}
		else
		{
            if(b>c)
            {
            	System.out.println("B is max ");
            }
            else
            {
            	System.out.println("c is max ");
            }
			
		}
	}
        
}
