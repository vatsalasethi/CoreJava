import java.io.*;
public class ReadMyName {

	public static void main(String[] args) throws IOException {

		//How to read a single character?
	/*System.out.println("Enter character!");
		*int x = System.in.read();
		System.out.println((char)x);
	*/ 
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter your name");
		String myName= br.readLine();
		
		System.out.println("Welcome" + myName);
	
	
	
	}

}
