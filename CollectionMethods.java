import java.util.*;

public class CollectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
	
		
		al.add("H");
		al.add("I");
		al.add("a");
		

		
		Collections.sort(al);
		System.out.println(al);
	    int index = Collections.binarySearch(al, "a");
        System.out.println(index);
		
        
			
	
	}}

