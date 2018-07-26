import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewYork {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter your name");
		String myName= br.readLine();
		
		System.out.println("Enter your city");
		String city= br.readLine();
		
		System.out.println( "Welcome " + myName);
		System.out.println("You are living in " + city);
		
		
		
	}

}
