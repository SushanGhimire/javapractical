
package PracticalJava7thSem.chapter2;

import java.awt.*;
public class BorderLayoutDemo extends Frame {
    Button b1,b2,b3,b4,b5;
    BorderLayoutDemo(){
         setSize(500,200);
        setTitle("BorderLayout Demo");
        setLayout(new BorderLayout());
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
        setVisible(true);
    }
    public static void main(String args[]){
        new BorderLayoutDemo();
    }
}
