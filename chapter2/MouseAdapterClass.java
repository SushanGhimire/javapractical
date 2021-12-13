
package PracticalJava7thSem.chapter2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseAdapterClass extends JPanel {
  public MouseAdapterClass() {

      addMouseListener(new MouseAdapter() { 
          public void mouseClicked(MouseEvent me) { 
            System.out.println(me); 
          } 
        }); 

  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new MouseAdapterClass());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.setSize(200, 200);
    frame.setVisible(true);
  }   
}
