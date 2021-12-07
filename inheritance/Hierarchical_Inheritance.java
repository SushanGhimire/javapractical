
package PracticalJava7thSem.inheritance;

public class Hierarchical_Inheritance {
  void Parent(){
        System.out.println("I am from top parent class");
    }
}
 class childA extends Hierarchical_Inheritance{
      void ChildA(){
        System.out.println("I am from child class A");
    }
}
class childB extends Hierarchical_Inheritance{
    void ChildB(){
        System.out.println("I am from child class B");
    }
}

class testing{
    public static void main(String args[]){
        childB c= new childB();
        c.ChildB();
        c.Parent();
    }
}
