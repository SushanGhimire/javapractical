
package PracticalJava7thSem;

public class methodOverriding {
    private int a=10;
    private int b=20;
    private int sum;
    public void calculate(){
        sum= a+b;
    }
    public void display(){
         System.out.println("Sum is "+sum);
    }
}
class childClass extends methodOverriding{
    private int a=20;
    private int b=30;
    private int sum;
    
    @Override
    public void calculate(){
        sum= a+b;
    }
    
     @Override
    public void display(){
         System.out.println("Sum is "+sum);
    }
   }
class testing{
    public static void main(String args[]){
    methodOverriding c1= new methodOverriding();
    childClass c2= new childClass();
    
    c1.calculate();
    c1.display();
    
    c2.calculate();
    c2.display();
        }
}