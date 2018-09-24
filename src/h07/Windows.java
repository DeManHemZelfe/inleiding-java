import java.awt.*;
import java.applet.*;

public class Windows extends Applet {

    public void init() {
        setSize(400, 300);
    }

    public void paint(Graphics g) {
        g.drawString("Hey mensen", 50, 60 );
    }
}
