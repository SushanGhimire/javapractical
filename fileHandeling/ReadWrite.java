
package PracticalJava7thSem.fileHandeling;
import java.io.*;
import java.io.IOException;

public class ReadWrite {
  public static void main(String args[]) throws IOException {
	File fr= new File("a.txt");
        char[] ch = new char[(int)fr.length()];
        FileReader f= new FileReader(fr);
        FileWriter out= new FileWriter("copy.txt");
        f.read(ch);
        for(char ch1:ch){
      out.write(ch1);
      out.flush();
  }
}
}
