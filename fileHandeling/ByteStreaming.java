/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticalJava7thSem.fileHandeling;
import java.io.*;
import java.io.IOException;
public class ByteStreaming {
   public static void main(String[] args) {
      FileInputStream ins = null;
      FileOutputStream outs = null;
      try {
         File infile = new File("a.txt");
         File outfile = new File("copy.txt");
         ins = new FileInputStream(infile);
         outs = new FileOutputStream(outfile);
         byte[] buffer = new byte[1024];
         int length;
         
         while ((length = ins.read(buffer)) > 0) {
            outs.write(buffer, 0, length);
         } 
         ins.close();
         outs.close();
         System.out.println("File copied successfully!!");
      } catch(IOException ioe) {
         ioe.printStackTrace();
      } 
   }
}
