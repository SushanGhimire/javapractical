
package PracticalJava7thSem.fileHandeling;
import java.io.*;
import java.io.IOException;
public class ReadingAllCharAtOnce {
    public static void main(String args[]) throws IOException{
        File f= new File("a.txt");
        char[] ch= new char[(int)f.length()];
        FileReader fr= new FileReader(f);
        fr.read(ch);
        for(char ch1:ch){
            System.out.println(ch1);
        }
        fr.close();
    }
}
