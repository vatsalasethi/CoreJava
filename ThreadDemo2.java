class AlphaThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char c='a'; c<='e';c++)
			System.out.println(c + "");
	}
	
	
}

class NumberThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			
			System.out.println(i + "");
		}
		
		
	}
	
	
	
}


public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread at=new Thread(new AlphaThread1());
		Thread nt=new Thread(new NumberThread1());
		
		at.run();
	
		nt.run();
	}

}
