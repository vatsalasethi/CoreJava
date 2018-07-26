class Greeting 
{
	
	public synchronized void sayHello(String name) {
		System.out.println("!");
		System.out.println(name);
		System.out.println("!");
	}
}

class GreetingThread extends Thread{
	
	
	String name;
	Greeting greeting;
	GreetingThread(String name, Greeting greeting)
	{
		
		this.name=name;
		this.greeting=greeting;
		
		
	}
	
	
	
	public void run() {
		
		greeting.sayHello(this.name);
	}
}

public class SynchronizedDemo {

	
	public static void main(String args[])
	{
		Greeting g=new Greeting();
		//Greeting g1=new Greeting();
		//g.sayHello("Vatsala");
		//g1.sayHello("Sethi");
		
		
		GreetingThread gt1=new GreetingThread("Vatsala", g);
		
		GreetingThread gt2=new GreetingThread("New", g);
	
			gt1.start();
			gt2.start();
		
	}
}
