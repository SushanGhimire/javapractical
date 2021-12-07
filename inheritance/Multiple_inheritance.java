/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PracticalJava7thSem.inheritance;

/**
 *
 * @author sushan
 */
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
    public void show(){
        Multiple_inheritance.super.show();
        Multiple_inheritance2.super.show();
    }
    public static void main(String args[]){
        testing t= new testing();
        t.show();
    }
}