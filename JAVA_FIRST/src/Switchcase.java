import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		int a[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter array aelements");
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter"+i+"Elements");
			a[i]=sc.nextInt();
			
		}
		System.out.println("Array elements are ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
	}

}
