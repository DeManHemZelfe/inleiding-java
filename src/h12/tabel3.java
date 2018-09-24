package h12;

import java.applet.Applet;
import java.awt.*;
import java.applet.*;

    public class tabel3 extends Applet {
        boolean gevonden;
        double[] salaris = {100, 200, 500, 400, 300};
        double gezocht;

        public void init() {
            gezocht = 400;
            gevonden = false;
            int teller = 0;
            while (teller < salaris.length) {
                if (salaris[teller] == gezocht) {
                    gevonden = true;
                }
                teller++;
            }
        }

        public void paint(Graphics g) {
            if (gevonden == true) {
                g.drawString("De waarde is gevonden.", 20, 50);
            } else {
                g.drawString("De waarde is niet gevonden.", 20, 50);
            }
        }
    }

