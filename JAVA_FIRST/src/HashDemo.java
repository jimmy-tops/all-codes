import java.util.HashSet;

public class HashDemo {
	
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(10.10);
		hs.add("tops");
		hs.add('r');
		hs.add(true);
		hs.add(10);
		hs.add(100);
		System.out.println(hs);
		
	}

}
