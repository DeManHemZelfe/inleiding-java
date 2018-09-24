package h11;

import java.awt.*;
import java.applet.*;


public class HerhalingOpdr1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;

        do {
            y += 20;
            g.drawLine( 100, 100, 100,200);
            g.drawString("" + teller, 100, 305 );
            teller++;
        } while (teller < 20);
    }
}