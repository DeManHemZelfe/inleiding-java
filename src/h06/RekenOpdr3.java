import java.awt.*;
import java.applet.*;


public class RekenOpdr3 extends Applet {
    int a, b, c, uitkomst;


    public void init() {
        a = 2147483647;
        b = 10000;
        c = 0;

        uitkomst = (a + b);
    }

    public void paint(Graphics g) {
        g.drawString("uitkomst.: " + uitkomst, 20, 20);
    }
}