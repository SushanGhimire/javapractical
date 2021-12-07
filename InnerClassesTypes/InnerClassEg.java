
package PracticalJava7thSem.InnerClassesTypes;

public class InnerClassEg {
 private int x= 1;
   public void innerInstance()
   {
       MyInnerClassDemo inner = new MyInnerClassDemo();
       inner. seeOuter();
   }  
   class MyInnerClassDemo {
       public void seeOuter () {
          System.out.println("Outer Value of x is :" + x);
       }
   } 	   
    public static void main(String args[]){
       InnerClassEg obj = new InnerClassEg();
       obj.innerInstance();
   }
} 