package h14;

import java.awt.*;
import java.applet.*;

public class multimedia2 extends Applet {

    double r;
    int worp;

    public void init() {
        r = Math.random();
        worp = (int)(r * 6 + 1);
    }

    public void paint(Graphics g) {
        g.drawString("" + worp, 50, 60 );
    }
}