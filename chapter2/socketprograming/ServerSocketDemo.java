
package PracticalJava7thSem.chapter2.socketprograming;
import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;
public class ServerSocketDemo {
    public static void main(String args[]) throws IOException
    {
         ServerSocket ss= new ServerSocket(3000);
         Socket s= ss.accept();
         Scanner ins= new Scanner(s.getInputStream());
         PrintWriter outs= new PrintWriter(s.getOutputStream());
         System.out.println("Server is up and running...");
         String s1= ins.nextLine();
         System.out.println("From client:"+ s1);
         outs.println("hello from client");
        ins.close();
        outs.close();
        s.close();
    }
}
