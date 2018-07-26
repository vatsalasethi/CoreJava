import java.io.*;
public class WriteFileDemo1 {

	public static void main(String[] args) throws IOException{
/*
		FileOutputStream fos = new FileOutputStream("d:\\vatsala\\whatup\\sample2.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		/*fos.write('h');
				fos.write('e');	
						fos.write('y');
						fos.close();
						System.out.println("Okay, done! what next?");
*/
		/*byte a[] = {'y','e','e','h','a','w'};
		fos.write(a);
			*/
		
		/*dos.writeBytes("hahahdahajf");

		dos.close();
		
		System.out.println("Okay, done! what next?");
*/
		
		
	 FileWriter fw=new FileWriter("d:\\\\vatsala\\\\whatup\\\\sample3.txt");
	 BufferedWriter bw = new BufferedWriter(fw);
	 
	 bw.write("Vatsala");
	 bw.newLine();
	 bw.write("is");
	 bw.newLine();
	 bw.write("AWESOME");
	 bw.newLine();
	 bw.write("yEP");
	 bw.newLine();
	 bw.write("TRUE");
	 bw.newLine();
	 
	 bw.close();
	 fw.close();
	System.out.println("Consider it done!");
	
	}

}
