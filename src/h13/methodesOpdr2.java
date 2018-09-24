package h13;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class methodesOpdr2 extends Applet {


    public void init() {


    }


    public void paint(Graphics g) {

        setBackground(Color.black);


        for (int i = 0; i < 11; i++) {
            g.setColor(Color.red);
            g.fillRect(10 + i * 70, 10, 60, 40);
        }
        for (int i = 0; i < 13; i++) {
            g.setColor(Color.red);
            g.fillRect(10 + i * 60, 60, 40, 40);


        }
        for (int i = 0; i < 11; i++) {
            g.setColor(Color.red);
            g.fillRect(10 + i * 70, 110, 60, 40);
        }
        for (int i = 0; i < 13; i++) {
            g.setColor(Color.red);
            g.fillRect(10 + i * 60, 160, 40, 40);
        }
        for (int i = 0; i < 11; i++) {
            g.setColor(Color.red);
            g.fillRect(10 + i * 70, 210, 60, 40);
        }
    }
}
