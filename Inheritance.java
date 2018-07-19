
public class Inheritance {

	public void m1() {System.out.println("Executed");};
	
	public void m2() {};
	
	public static void main(String args[]) {
		 
		 Child c=new Child();
		 c.m1();
		 c.m2();
		 
		 Inheritance p=new Child();
		 p.m1();
	 }
	
}


 class Child extends Inheritance {
	
	public void c1() {};
	public void c2() {};
	
}
 

 