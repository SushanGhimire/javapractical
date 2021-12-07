/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticalJava7thSem.constructor;

/**
 *
 * @author sushan
 */
public class Sum {
  Sum(){
     System.out.println("I am default constructor");
 }   
  Sum(int a,int b){
      int sum= a+b;
      System.out.println("Sum is: "+sum);
  }
  public static void main(String[] args) {
    Sum s1= new Sum();
    Sum s2= new Sum(2,3);
  }
}
