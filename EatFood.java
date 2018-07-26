class Restaurant {
	
	public synchronized void takeLunch(String name) {
		System.out.println("!1 ");
		System.out.println("Lunch taken by" + name);
		System.out.println("!2 ");
	}

}


class Restro extends Thread {
	
	String name;
	Restaurant r;
	Restro(String name, Restaurant r){
		
		this.name=name;
		this.r=r;
	}
	
	public void run() {
		r.takeLunch(this.name);
		
	}	
}

public class EatFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurant r= new Restaurant();
		Restro r1= new Restro("Vatsala", r);
		r1.setPriority(1);
		r1.start();
		Restro r2= new Restro("Person",r);
		r2.start();
	}

}
