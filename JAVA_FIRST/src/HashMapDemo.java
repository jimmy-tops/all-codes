import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(101, "jimmy");
		map.put(102, "jimmy 2");
		map.put(103, "jimmy 3");
		map.put(104, "jimmy 4");
		map.put(106, "jimmy 5");
		
		System.out.println(map);
		map.put(432, "jimmy 4");
		System.out.println(map);
		
		ArrayList tr=new ArrayList();
		tr.add(5000);
		tr.add(9000);
		tr.add(7000);
		tr.add(56000);
		HashMap<Integer, ArrayList> hm=new HashMap();
		hm.put(501, tr);
		System.out.println(hm);
		
	}
	
}
