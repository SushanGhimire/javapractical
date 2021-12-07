
package PracticalJava7thSem;
import java.util.Scanner;
public class ifElseIf {
    public static void main(String args[]){
        Scanner n1= new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int num1 = n1.nextInt();
          Scanner n2= new Scanner(System.in);
        System.out.println("Enter a second number: ");
        int num2 = n2.nextInt();
          Scanner n3= new Scanner(System.in);
        System.out.println("Enter a third number: ");
        int num3 = n3.nextInt();
        if(num1 > num2 && num1>num3){
            System.out.println("Largest number is :"+ num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("Largest number is :"+ num2);
        }else{
            System.out.println("Largest number is :"+ num3);
        }
    }
}
