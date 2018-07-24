
public class Neww {

	
	
	public static void main(String [] args) {
		
	String a= args[0];
	int flag=0;

	for(int i=0; i<a.length(); i++) {
		
		
		if(a.charAt(i)=='C')
			flag++;
		
	}
	
	System.out.println(flag);
	}
}



