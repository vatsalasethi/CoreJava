class myThread1 extends Thread {
	
	public void run() {
	for(int i=1; i<=5; i++) {
		System.out.print(i);
	}}
	
}



class myThread2 extends Thread{
	public void run() {
	for(int j=1;j<=15;j++) {
		System.out.print(j);
	}
}
}



public class FirstThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		myThread1 v = new myThread1();
		v.start();
		
		
		myThread2 k = new myThread2();	
		k.start();
	}

}
