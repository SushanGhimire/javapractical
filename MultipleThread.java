
package PracticalJava7thSem;

public class MultipleThread {
   public static void main(String args[]) {
		Thread t= Thread.currentThread();
		System.out.println("Current Thread: "+t);
		t.setName("Not main Thread");
		System.out.println("After Change Thread: "+t);
		System.out.println("Current Thread: "+t.isAlive());
		System.out.println("Current Thread: "+t.getPriority());
		try {
			for(int i=0;i<5;i++) {
				System.out.println(i);
				Thread.sleep(1500);
			}
		}catch(InterruptedException e){
				System.out.println(e);
				e.printStackTrace();
			}
		}
	}