import java.util.ArrayList;

///import java.util.*;

public class vs {

	public static void main(String[] args) {
		
		ArrayList v=new ArrayList(3);
		
		v.add("Vatsala");
		v.add("A");
		v.add("B");
		v.add("C");
		
		int ind=v.indexOf("A");
		if( ind!=-1)
		{
			v.remove(ind);
			v.add(ind,"blue");
			
		}
	
		else System.out.println("not found!");
		
	}
