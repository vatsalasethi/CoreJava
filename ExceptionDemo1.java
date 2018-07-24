
public class ExceptionDemo1 {

	public static void main(String[] args) {
	
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(5/0);}
		catch(ArithmeticException ae)
		{
			System.out.println("try again!");
		}
		System.out.println("end");
	}

}
