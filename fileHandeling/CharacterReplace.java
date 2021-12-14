
package PracticalJava7thSem.fileHandeling;

import java.io.*;
import java.io.IOException;
public class CharacterReplace {
    public static void main(String args[]) throws IOException{
        FileReader fr= new FileReader("abc.txt");
        FileWriter out= new FileWriter("copy.txt");
        int i= fr.read();
        while(i != -1){
            char c= (char) i;
            if(c== 'a'){
                out.write("b");
                out.flush();
            }else{
                 out.write((char)i);
            out.flush();
            }
           
           i=fr.read();
        }
        fr.close();
    }
}
