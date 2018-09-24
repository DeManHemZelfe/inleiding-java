import java.awt.*;
import java.applet.*;

public class HerhalingOpdr6 extends Applet {
    int teller;
    int x = 172;
    int y = 128;
    int width = 5;
    int height = -5;

    public void init() {
    }

    public void paint(Graphics g) {

        for (int i = 0; i < 50; i++) {

            x -=5;
            y -=5;
            width += 10;
            height += 10;

            setBackground(Color.blue);
            g.setColor(Color.yellow);
            g.drawOval(150,100,50,50);
            g.drawOval(x, y, width, height);
            teller++;

        }

    }
}