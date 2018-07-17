
public class Band {

	String bandName;
	String singers[];
	String guitarist[];
	String drummer;
	String keyboardPlayer;
	
	public void setBandDetails(String bandName, String[] singers, String[] guitarists, String drummer, String keyboardPlayer)
	{
		
		this.bandName=bandName;
		this.singers=singers;
		this.guitarist=guitarists;
		this.drummer=drummer;
		this.keyboardPlayer= keyboardPlayer;
		
		
		
		
	}
	public void printBandDetails()
	{
		System.out.print(bandName);
		for(int i=0; i<singers.length; i++) {
		System.out.print(singers);}
		for(int i=0; i<guitarist.length; i++) {
		System.out.print(guitarist);}
		System.out.print(drummer);
		System.out.print(keyboardPlayer);
	}
	
	public int count()
	{
		
		return 2+singers.length+guitarist.length;  
		
		
		
	}

	
	
	
}


