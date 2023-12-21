import java.util.Scanner;

public class LadderIf {

	public static void main(String[] args) {
		
		int rno,s1,s2,s3,total;
		
		double per;
		String sname;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Studnet name ");
		sname=sc.next();
		System.out.println("Roll no ");
		rno=sc.nextInt();
		System.out.println("s1 mark");
		s1=sc.nextInt();
		System.out.println("s2 mark");
		s2=sc.nextInt();
		System.out.println("s3 mark");
		s3=sc.nextInt();
				
		total=s1+s2+s3;
		per=total/3;
		
		System.out.println("student name : "+sname);
		System.out.println("roll no  : "+rno);
		System.out.println("Total : "+total);
		System.out.println("percetage : "+per);
		
		if (per>=70)

       {
	
       System.out.println("Dist"); 
         }
		else if (per>=60)
		{
			System.out.println("First class");
		}
	else if (per>=50)
	   {
		System.out.println("Second class");
		
	   }

	else if(per>=40)
	{
		System.out.println("pass class");
	
	}
	else
	{
		System.out.println("Fail");
	}

		}
		}
	


