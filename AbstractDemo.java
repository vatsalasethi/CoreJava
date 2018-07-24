abstract class person6

{
	String name, location;
	int age;
	public boolean doesHeBreathe()
	{
		System.out.println("Every person breathes");
		return true;
		
	}
	
	public boolean doesHeSleep()
	{
		System.out.println("Every person sleeps");
		return true;
	}
	
	public abstract boolean doesHeDrive();
	
}


abstract class Employee6 extends person6
{
	public abstract boolean doesHeDrive();
}

class Driver1 extends Employee6
{
	@Override
	public boolean doesHeDrive()
	{
		System.out.println("Every driver drives");
		return true;
	}

}



public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver1 obj= new Driver1();
		System.out.println("Breathing? " + obj.doesHeBreathe());
		System.out.println("Sleep? "+ obj.doesHeSleep());
		System.out.println("Drive? "  + obj.doesHeDrive());		
		
	}

}
