
public class MyEnumDemo {
	enum weekday {Monday, Tuesday, Wed, Thr, Sat, Sun};
	
	public static void main(String args[]) {
		
		weekday[] w=weekday.values();
		for(weekday w1:w)
			System.out.println(w1);
	
	System.out.println(weekday.Tuesday);
	}
		
}

