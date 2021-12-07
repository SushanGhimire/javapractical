
package PracticalJava7thSem;

public class threading extends Thread {
    public void run() {
	for(int i=0 ;i<=10;i++) {
		System.out.println("Child Thread");
	}
	}
}
class Test{
	public static void main(String args[]) {
		threading thread= new threading();
		thread.start();
		for(int i=0 ;i<=10;i++) {
			System.out.println("main Thread");
		}
	}
}