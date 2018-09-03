package h04;

import java.applet.Applet;
import java.awt.*;

public class Lijntjes extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.yellow);
        g.drawLine(130, 230, 130, 0);
        g.setColor(Color.red);
        g.fillRect(130, 82, 100, 50);
        g.setColor(Color.white);
        g.fillRect(130, 133, 100, 50);
        g.setColor(Color.blue);
        g.fillRect(130, 180, 100, 50);
    }
}