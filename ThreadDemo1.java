class NumberThread extends Thread
{
	
	public void run()
	{
		

		for(int i=1; i<=5; i++)
			
			
			System.out.println(i);
	}
}

class AlphaThread extends Thread
{
	public void run() {
		for(char c='A'; c<='E'; c++)
			System.out.println(c);
	}
}


public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		NumberThread nt=new NumberThread();

		nt.start();
		
		AlphaThread at = new AlphaThread();
		at.start();
	}

}
