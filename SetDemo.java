import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add("Peter");
		hs.add("James");
		hs.add("Peter"); //nothing happens, no changes, leaves the set unchanged
		hs.add("ARUN");
		hs.add("Zaikr");
		System.out.println(hs);
			
		
		TreeSet x= new TreeSet();
		System.out.println(x.add("Peter"));
		System.out.println(x.add("Peter"));
		System.out.println(x.add("Peter"));
		System.out.println(x.add("Peter"));
		System.out.println(x.add("Peter"));
		
		System.out.println(x);
	}

}
