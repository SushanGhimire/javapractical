
package PracticalJava7thSem;

public class Final_Keyword {
    final int age=24; //we cannot able to change this value final means constant
   public void changeAge(){
       age=20; //error occurs here
   }
   public static void main(String args[]){
       Final_Keyword f= new Final_Keyword();
       f.changeAge();
   }
}
