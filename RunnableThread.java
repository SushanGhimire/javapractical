
package PracticalJava7thSem;


public class RunnableThread implements Runnable {
    public void run() {
		for(int i=0; i<5;i++) {
			System.out.println("Child Thread");
		}
	}
}
class ThreadDemo{
	public static void main(String args[]) {
		RunnableThread r= new RunnableThread();
		Thread t= new Thread(r);
		t.start();
		for(int i=0; i<5;i++) {
			System.out.println("Main Thread");
		}
		
	}
}
