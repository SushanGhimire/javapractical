
package PracticalJava7thSem.inheritance;

public class Multilevel_inheritance {
     void Parent(){
        System.out.println("I am from top parent class");
    }
}
 class childA extends Multilevel_inheritance{
      void ChildA(){
        System.out.println("I am from child class A");
    }
}
class childB extends childA{
    void ChildB(){
        System.out.println("I am from child class B");
    }
}

class testing{
    public static void main(String args[]){
        childB c= new childB();
        c.ChildB();
        c.ChildA();
//since the childB class only extends childA class i can only access to ChildA
// and ChildB method
    }
}