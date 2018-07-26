import java.io.*;
public class Exercise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	;	
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
		 FileWriter fw=new FileWriter("d:\\\\vatsala\\\\whatup\\\\sample100.txt");
		 BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("Enter");
		String a= br.readLine();
		
		while(!a.equalsIgnoreCase("stop"))
		{
			a= br.readLine();
			bw.write(a);
			bw.newLine();
			
			
			
		}
		
		fw.close();
		
		
		bw.close();
		
		
		
	}

}
