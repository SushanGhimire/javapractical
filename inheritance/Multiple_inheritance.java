
package PracticalJava7thSem.inheritance;

public interface Multiple_inheritance {
    default void show(){
        System.out.println("Multiple_inheritance");
    }
}
 interface Multiple_inheritance2{
default void show(){
        System.out.println("Multiple_inheritance2");
    }
 }
class testing implements Multiple_inheritance,Multiple_inheritance2{
    @Override
    public void show(){
        Multiple_inheritance.super.show();
        Multiple_inheritance2.super.show();
    }
    public static void main(String args[]){
        testing t= new testing();
        t.show();
    }
}