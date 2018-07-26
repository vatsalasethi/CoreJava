import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Average {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		double avg=0.0;
		double sum=0;
		int b;
		
		for(int i=0; i<5; i++) {
			
		
		sum=sum+Integer.parseInt(br.readLine());
		} avg=sum/5;
		System.out.println("Average is" + avg);
	}

}

