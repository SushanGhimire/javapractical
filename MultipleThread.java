
package PracticalJava7thSem;

public class MultipleThread implements Runnable{
   String name; //name of thread
	Thread t;
	MultipleThread(String threadname){
		name= threadname;
		t= new Thread(this,name);
		System.out.println("New Thread: "+ t);
		t.start();
	} 
        public void run() {
		for(int i=0; i<20;i++) {
			System.out.println(name +":"+ i);
		}
		System.out.println(name+ "Exiting");
	}
}
class MultiThreadDemo{
		public static void main(String args[]) {
			new MultipleThread("One"); //start the thread
			new MultipleThread("two");
		}
	}