/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticalJava7thSem;

/**
 *
 * @author sushan
 */
public class ThreadPriority extends Thread {
    public static void main(String[] args) {
        Thread t1=new ThreadPriority();
        Thread t2=new ThreadPriority();
        Thread t3=new ThreadPriority();
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MAX_PRIORITY);
        System.out.println("Thread 1 Priority is " + t1.getPriority());
        System.out.println("Thread 2 Priority is " + t2.getPriority());
        System.out.println("Thread 3 Priority is " + t3.getPriority());
    }
}
