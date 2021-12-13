
package PracticalJava7thSem.chapter2;

import java.net.*;
import java.io.*;

public class UrlClass {
    public static void main(String args[]) throws Exception{
        URL url = new URL("https://www.geeksforgeeks.org/java/?ref=shm");
        URLConnection urlcon= url.openConnection();
        InputStream stream = urlcon.getInputStream();
        int i;
        while((i=stream.read())!= -1){
            System.out.println((char)i);
        }
    }
}
