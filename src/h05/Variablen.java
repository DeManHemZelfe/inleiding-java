package h05;

import java.applet.Applet;
import java.awt.*;

public class Variablen {
    public class Show extends Applet {
        //declaratie.
        Color opvulkleur;
        Color lijnkleur;
        int breedte;
        int hoogte;

        public void init() {
            //initialisatie.
            opvulkleur = Color.magenta;
            lijnkleur = Color.black;
            breedte = 200;
            hoogte = 100;
        }

        public void paint(Graphics g) {
            //teken rechthoek
            g.drawRect(100, 100, 200, 200);
            //teken afgeronde rechthoek
            g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
            //teken gevulde rechthoek
            g.setColor(opvulkleur);
            g.fillRect(315, 100, breedte, hoogte);
            //teken ovaal
            g.setColor(lijnkleur);
            g.drawOval(315, 100, breedte, hoogte);
            //teken gevulde ovaal
            g.setColor(opvulkleur);
            g.fillOval(315, 225, breedte, hoogte);

        }
    }
}
