
public class End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer t=new Trainer();
		Doctor d=new Doctor();
		Pilot p= new Pilot();
		t.doYouSpeak();
		t.whatDoYouDo();
		d.doYouSpeak();
		d.whatDoYouDo();
		p.doYouSpeak();
		p.whatDoYouDo();
		
	}

}

abstract class person {
	
	public abstract boolean whatDoYouDo();
	
	public boolean doYouSpeak()
	{
		System.out.println("Everyone Speaks!");
		return true;
	}
}


 class Trainer extends person {
	@Override
	public  boolean whatDoYouDo() {
		System.out.println("Deliver lectures");
		return true;
	}
	public boolean doYouSpeak() {
		System.out.println("Everyone Speaks!");
		return true;
	}
}

 class Doctor extends person {
	@Override
	public boolean whatDoYouDo() {
		System.out.println("Cures ill");
		return true;
	}
	public boolean doYouSpeak() {
		System.out.println("Everyone Speaks!");
		return true;
	}
	
}

 class Pilot extends person{
	@Override
	public boolean whatDoYouDo() {
		System.out.println("Flies the airplane");
		return true;
	}
	public boolean doYouSpeak() {
		System.out.println("Everyone Speaks!");
		return true;
	}
}

































