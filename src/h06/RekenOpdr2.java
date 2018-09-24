import java.awt.*;
import java.applet.*;


public class RekenOpdr2 extends Applet {
    double a, b, c, uitkomst;


    public void init() {
        a = 60*60;
        b = 24;
        c = 365;

        uitkomst = (a * b) * c;

    }


    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawString("Seconden in een uur.: " + a, 20, 40);
        g.setColor(Color.white);
        g.drawString("Seconden in een dag.: " + a * b, 20, 80);
        g.setColor(Color.white);
        g.drawString("Seconden in een jaar.: " + uitkomst, 20, 120);
    }

}