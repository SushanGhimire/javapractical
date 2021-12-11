
package PracticalJava7thSem.fileHandeling;
import java.io.*;
import java.io.IOException;
public class ReadingCharOneByOne  {
   public static void main(String args[]) throws IOException {
        FileReader fr= new FileReader("a.txt");
        int i= fr.read();
        while(i != -1){
            System.out.println((char)i);
           i=fr.read();
        }
        fr.close();
   }
    
}
