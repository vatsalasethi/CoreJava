 interface TVRemotes {

	
	public void switchoff();
	public void switchon();
	public void changeChannel();
	public void increaseVolume();
	public void decreaseVolume();
	
}

 class action implements TVRemotes {
	
	public void switchoff() {
		System.out.println("ON!");
	}
	public void switchon() {
		System.out.println("off");
	}
	public void changeChannel() {
		System.out.println("changed channel");
	}
	public void increaseVolume() {
		System.out.println("Volume increase");
	}
	public void decreaseVolume() {
		System.out.println("Volume decrease");
	}
	
}
 
 class sony implements TVRemotes {
		
	public void switchoff() {
		System.out.println(" sony ON!");
	}
	public void switchon() {
		System.out.println("sony off");
	}
	public void changeChannel() {
		System.out.println("sony changed channel");
	}
	public void increaseVolume() {
		System.out.println("sony Volume increase");
	}
	public void decreaseVolume() {
		System.out.println("sony Volume decrease");
	}
	
}

public class Interface {

	public static void main(String args[]) {
	action a= new action();
	sony s=new sony();
	
	a.switchoff();
	a.switchon();
	a.changeChannel();
	a.decreaseVolume();
	a.increaseVolume();
	s.switchoff();
	s.switchon();
	s.changeChannel();
	s.decreaseVolume();
	s.increaseVolume();
}}

