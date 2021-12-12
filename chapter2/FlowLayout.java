
package PracticalJava7thSem.chapter2;

import java.awt.*;
public class FlowLayout extends Frame {
    Button b1,b2,b3;
    FlowLayout(){
        setSize(400,150);
        setTitle("Flowlayout Demo");
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        add(b1);
        add(b2);
        add(b3);
        setVisible(true);
    }
    public static void main(String args[]){
        new FlowLayout();
    }
}
