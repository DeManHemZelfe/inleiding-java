package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class HerhalingOpdr5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;
        int y = 0;
        int breedte = 40;
        int hoogte = 40;


        for (int i = 0; i < 5; i++) {

            x += breedte;
            y += hoogte;


            setBackground(Color.white);
            g.setColor(Color.black);
            g.drawRect(x, y, breedte, hoogte);
            //niet per se nodig.
            // g.drawRect(95, 95, 50, 50);
            //g.drawRect(140, 140, 50, 50);
            // g.drawRect( teller, teller, 50, 50);
            teller++;
        }

    }
}