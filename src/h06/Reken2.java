import java.awt.*;
import java.applet.*;


public class Reken2 extends Applet {
    int teller;

    public void init() {
        teller = 0;
    }

    public void paint(Graphics g) {
        teller++;
        g.drawString("Scherm is " + teller +
                " keer ververst.", 50, 60 );
    }
}