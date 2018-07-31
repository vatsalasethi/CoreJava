
public class Places implements Cloneable {
	String name;
	String country;
	long population;
	
	public Places (String name, String country, long population) {
		
		super();
		this.name=name;
		this.country=country;
		this.population=population;
	}
	
	
	@override
	protected void Objectclone() throws CloneNotSupportedException()
	{		return super.clone();
}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Places p1=new Places("Delhi", "India", 7597);
		System.out.println(p1);
		
		Places p2=null;
		try {
			pr=(Places)p1.clone();
		}
		
		
		catch(CloneNotSupportedException c) {
		}
			System.out.println(p1.country);
			System.out.println(p2.country);
			
			
	}

}
