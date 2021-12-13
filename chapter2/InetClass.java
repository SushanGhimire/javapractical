
package PracticalJava7thSem.chapter2;

import java.net.*;
public class InetClass {
    public static void main(String args[]) throws Exception{
        InetAddress ip;
        ip= InetAddress.getByName("www.facebook.com");
        System.out.println("Host Name: "+ ip.getHostName());
        System.out.println("IP Address: "+ip.getHostAddress());
    }
}
