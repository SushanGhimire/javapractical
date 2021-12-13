   
package PracticalJava7thSem.chapter2;
import java.net.*;
public class UrlContent {
    public static void main(String args[]) throws Exception{
        URL url=new URL("https://www.geeksforgeeks.org/java/?ref=shm");
        System.out.println("Protocol: "+url.getProtocol());
        System.out.println("Protocol: "+url.getHost());
        System.out.println("Protocol: "+url.getPort());
        System.out.println("Protocol: "+url.getFile());
    }
}
