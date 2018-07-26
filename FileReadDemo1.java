import java.io.*;
public class FileReadDemo1 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		

		/*FileInputStream fis = new FileInputStream("src/hello.txt");
		int xx = fis.read();
		while(xx!=-1)
		{
			System.out.print((char)xx);
			xx=fis.read();
		}
		
		fis.close();*/
		
		FileReader fr = new FileReader("src/hello.txt");
		BufferedReader br = new BufferedReader(fr);
		int flag=0;
		String line = br.readLine();
		while(line!=null)
		{
			//System.out.println(line);
			
			if(line.contains("Java"))
			{
				flag=1;
				break;
			}
			line=br.readLine();
		} if (flag==1)
			System.out.println("Success");
		else
			System.out.println("Java not found");
		
		
		fr.close();
	}
	

}
