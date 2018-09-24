import java.awt.*;
import java.applet.*;


public class RekenOpdr1 extends Applet {
    double a, b, c, uitkomst;


    public void init() {
        a = 130;
        b = 0;
        c = 4;

        uitkomst = (a + b) / c;
    }

        public void paint(Graphics g) {
        g.drawString("Geld wat iedereen krijgt.: ", 20, 20);
        g.drawString("Jan: " + uitkomst, 20, 40);
        g.drawString("Ali: " + uitkomst, 20, 60);
        g.drawString("Jeannette: " + uitkomst, 20, 80);
        g.drawString("Niels: " + uitkomst, 20, 100);
    }
}