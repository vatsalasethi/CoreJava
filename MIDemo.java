class A
{
	int a=5;
	int b=34;
}

class B extends A{
	
	int c=34;
	
}

class C extends B{
	
	
	int c=43;
}




public class MIDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1= new C();
		System.out.println(c1.a);
		System.out.println(((A)c1).a);
	}

}
