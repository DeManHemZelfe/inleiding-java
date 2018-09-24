import java.awt.*;
import java.applet.*;


public class Beslissingen extends Applet {

    public void init() {}


    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawString("" + 8 + " is groter dan " + 5 + ": " + (8 > 5), 50, 60 );
        g.drawString("" + 8 + " is kleiner dan " + 5 + ": " + (8 < 5), 50, 80 );
        setBackground(Color.black);
    }
}