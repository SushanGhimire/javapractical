
package socketprograming;
import java.net.Socket;
import java.io.*;
import java.util.*;
import java.io.IOException;
public class ClientSocket {
    public static void main(String args[]) throws Exception{
        Socket cs= new Socket("localhost",3000);
        
        Scanner ins= new Scanner(cs.getInputStream());
        PrintWriter outs1= new PrintWriter(cs.getOutputStream(),true);
        System.out.println("Client server is up and running..."); 
        outs1.println("Hello server from client");
        String s= ins.nextLine();
        System.out.println("From server:" + s);
        ins.close();
        outs1.close();
        cs.close();
        
    }
}
