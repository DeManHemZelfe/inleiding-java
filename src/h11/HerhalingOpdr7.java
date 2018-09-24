import java.awt.*;
import java.applet.*;

public class HerhalingOpdr7 extends Applet {
    int teller;
    int x;
    int y;
    int width;
    int height;

    public void init() {
    }

    public void paint(Graphics g) {
        int x = 195;
        int y = 195;
        int width = 10;
        int height = 10;
        for (int i = 0; i < 50; i++) {
            setBackground(Color.blue);
            g.setColor(Color.yellow);
            g.drawOval(x, y, width, height);
            x -=5;
            y -=5;
            width += 10;
            height += 10;
        }

    }
}