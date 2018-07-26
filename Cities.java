import java.io.*;

public class Cities {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String myName="";
		int count=0;
		System.out.println("Enter your name");
		while(!myName.equalsIgnoreCase("stop")){
			myName= br.readLine();
			count=count+1;
		
		}
	
		System.out.println("hey" + count + myName);
	}

}
