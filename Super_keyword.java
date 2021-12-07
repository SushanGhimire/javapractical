
package PracticalJava7thSem;

public class Super_keyword {
    Super_keyword(){
        System.out.println("I am called from parent class");
    }
}
class childClass extends Super_keyword{
    childClass(){
        super();
        System.out.println("I am called from child class");
    }
}
class testing{
    public static void main(String args[]){
        childClass c= new childClass();
        
    }
}