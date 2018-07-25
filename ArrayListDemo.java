import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll=new LinkedList();
		
		ll.add("Java");
		ll.add("c++");
		ll.add("php");
		ll.add("python");
		ll.add("c#");
		
		System.out.println(ll);
		
		
		
		Iterator ii= ll.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		
	
		
		  ListIterator l= ll.listIterator();
			while(l.hasNext()) {
				System.out.println(l.next());
		
			}
			while(l.hasPrevious()) {
				System.out.println(l.previous());
			}
				
	}}
