
package PracticalJava7thSem;

import java.util.Scanner;

public class SwitchControl {
void days(int score) {
    
      String grade = null;
	switch(score/10) {
        case 10:
        case 9:
           grade = "A";
           break;
        case 8:
           grade = "B";
           break;
        case 7:
           grade = "C";
           break;
        case 6:
           grade = "D";
           break;
        case 5:
           grade = "E";
           break;
        default:
           grade = "F";
           break;
      }
      System.out.println("Grade = " + grade);
	
}
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the marks between 0-100: ");
	int number= input.nextInt();	
	SwitchControl c= new SwitchControl();
	c.days(number);
	input.close();
}
}