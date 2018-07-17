
public class TestBand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Band b1=new Band();
		Band b2=new Band();
		String a[]= {"array value"};
		

		String b[]= {"array value 2"};
		
		b1.setBandDetails("VS", a, b, "dr", "kp");
		b2.printBandDetails(); 
		b1.count();
		b2.count();
		
	}

}
