import java.util.ArrayList;
import java.util.Collections;

public class Cop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al = new ArrayList();
ArrayList a2 = new ArrayList();	
	
		
		al.add("H");
		al.add("I");
		al.add("H");
		al.add("j");
		al.add("H");
		a2.add("A");
		a2.add("k");
		System.out.println(al);
		System.out.println(a2);
		Collections.copy( al,a2 );
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		Collections.replaceAll(al, 'H', 'V');
	
	}

}
