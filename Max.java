import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Max {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		int max=0;
		int num=0;
		for(int i=0; i<5; i++) {
			
		System.out.println("Enter 5 numbers");
		num=Integer.parseInt(br.readLine());
		} 
		
		if(num>max)
			num=max;
		System.out.println("Max" + num);
	}

}

