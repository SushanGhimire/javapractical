
package PracticalJava7thSem.fileHandeling;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
public class Vowel {
    public static void main(String args[]) throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character you want");
        String s= input.nextLine();
        
        FileWriter vol= new FileWriter("Vowel.txt");
        FileWriter con= new FileWriter("consonant.txt");
        
        for(int i=0; i<s.length();i++){
            char c= s.charAt(i);
            if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                vol.write(c);
                vol.flush();
            }else{
                con.write(c);
                con.flush();
            }
        }
        vol.close();
        con.close();
    }
}
