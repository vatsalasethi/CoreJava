import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		
		hm.put("1", "VS");
		hm.put("2", "Jack");
		hm.put("3", "Peter");
		
		System.out.println(hm);

		System.out.println(hm.get(("2")));
		Set keys=hm.keySet();
		System.out.println(keys);
		
		Iterator it= keys.iterator();
		
		while(it.hasNext())
			
		{
			
			String key=(String)it.next();
			System.out.println(hm.get(key));
		}
	
	}
	}
