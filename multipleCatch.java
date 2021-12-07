
package PracticalJava7thSem;


public class multipleCatch {
    static String s= null;
	public static void main(String args[]) {
	
	try {
//		System.out.println(s.length());
		int a[]=new int[5];
		a[5]=30/0;
	}catch(ArithmeticException e) {
		System.out.println(e);
	}catch(NullPointerException e){
		System.out.println(e);
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}
	finally {
	
		System.out.println("From Finally");
	}
	System.out.println("Rest of the code");
}
}
