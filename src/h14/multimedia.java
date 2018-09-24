package h14;


import java.applet.Applet;
import java.awt.*;





    public class multimedia extends Applet {

        double r;

        public void init() {
            r = Math.random();
        }

        public void paint(Graphics g) {
            g.drawString("" + r, 50, 60 );
        }
    }
