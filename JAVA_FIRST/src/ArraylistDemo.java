import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistDemo {

	public static void main(String[] args){
		
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(10.10);
		list.add("tops");
		list.add("t");
		list.add(null);
		list.add(true);
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(3));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array list Element");
		int a=sc.nextInt();
		list.add(a);
		System.out.println(list);
		System.out.println("Enter Index Number to Remove elements:");
		int index=sc.nextInt();
		list.remove(index);
		System.out.println(list);
		System.out.println("list os size :"+list.size());
	}
	
}
