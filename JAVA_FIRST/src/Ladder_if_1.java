import java.util.Scanner;

public class Ladder_if_1 {
	public static void main(String[] args) {
		int rno,s1,s2,s3,total;
		String snaame;
		double per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student roll no :");
		rno=sc.nextInt();
		System.out.println("Ennter Studnet name :");
		snaame=sc.next();
		System.out.println("Enter Subject A Mark :");
		s1=sc.nextInt();
		System.out.println("Enter Subject B mark  :");
		s2=sc.nextInt();
		System.out.println("Enter Subject c mark  :");
		s3=sc.nextInt();
		
		total=s1+s2+s3;
		per=total/3;
		
		System.out.println("Studnet name : "+snaame);
		System.out.println("Roll no :"+rno);
		System.out.println("Percentage:"+per);
		System.out.println("Total:"+total);
		
		if(per>=70)
		{
			System.out.println("Disti");
		}
		else if (per>=60)
		{
			System.out.println("first class");
		}
		else if (per>=50)
		{
			System.out.println("second ");
	    }
		else if(per>=40)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}

    }
}
