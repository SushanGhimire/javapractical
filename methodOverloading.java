
package PracticalJava7thSem;


public class methodOverloading {
    public void sum(int a,int b){
        int sum = a+b;
        System.out.println("Sum is : "+sum);
    }
    public void sum(int a,int b,int c){
        int sum = a+b+c;
        System.out.println("Sum is : "+sum);
    }
    public static void main(String args[]){
        methodOverloading m1= new methodOverloading();
        methodOverloading m2 = new methodOverloading();
        m1.sum(10, 20);
        m2.sum(10, 20, 30);
    }
}
