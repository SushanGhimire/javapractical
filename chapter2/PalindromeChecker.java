
package PracticalJava7thSem.chapter2;
import java.awt.event.*;
import javax.swing.*;

public class PalindromeChecker extends JFrame implements ActionListener {
    JTextField t1,r;
    JLabel l1,l2;
    JButton b;
     PalindromeChecker(){
        t1= new JTextField();
        r= new JTextField();
        l1= new JLabel("Enter the Text");
        l2= new JLabel("Results");
        b= new JButton("Check Palindrome");
        setLayout(null);
       l1.setBounds(100,200,200,50);
       t1.setBounds(100,250,200,50);
       b.setBounds(100,300,200,50);
       l2.setBounds(100,350,200,50);
       r.setBounds(100,400,200,50);
       add(l1);add(t1);add(b);add(l2);add(r);
       b.addActionListener(this);
       setSize(500,550);
       setVisible(true);      
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     public void actionPerformed(ActionEvent ae){
         String original= t1.getText();
         String reverse="";
         int length= original.length();
         System.out.println(length);
         for(int i=length-1; i>=0;i--){
             reverse= reverse+ original.charAt(i);
              System.out.println(reverse);
         }
         if(original.equals(reverse)){
         r.setText(original+ " is palindrome");    
         }else{
              r.setText(original+ " is not palindrome");   
         }
         
     }
     public static void main(String args[]){
         new PalindromeChecker();
     }
    
}
