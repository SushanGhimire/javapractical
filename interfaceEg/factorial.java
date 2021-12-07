
package PracticalJava7thSem.interfaceEg;

public interface factorial {
    public void calculateFact(int a);
}
class Demo implements factorial{
    public void calculateFact(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact= fact*i;
        }
        System.out.println("Factorial of given number "+ a+" is "+fact);
    }
    public static void main(String[] args) {
        factorial f= new Demo();
        f.calculateFact(4);
    }
}
