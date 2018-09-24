package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class tabelopdr2 extends Applet {
    Button knop;
    double[] salaris;
    double[] kopie;



    public void init() {
        //schermtekst = "Doet deze knop wel iets?";
        knop = new Button("ruben staat op miijn knop");
        //KnopListener kl = new KnopListener();
       // knop.addActionListener( kl );
        add(knop);

        salaris = new double[5];
        kopie = new double[5];

        for (int teller = 0; teller < salaris.length; teller++) {
            salaris[teller] = 100 * teller + 100;
        }
        for (int teller = 0; teller < salaris.length; teller++) {
            kopie[teller] = salaris[teller];
        }
        kopie[3] = 1000;  //salaris[3] wordt nu niet gewijzigd!
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller++) {
            g.drawString("" + kopie[teller], 50, 20 * teller + 20);
            g.drawString("" + salaris[teller], 100, 20 * teller + 20);
            g.drawString("" + kopie[teller], 150, 20 * teller + 20);
            g.drawString("" + salaris[teller], 200, 20 * teller + 20);
        }
        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
              //  schermtekst = "Ja, deze knop doet wel iets";

            }
        }
    }
}