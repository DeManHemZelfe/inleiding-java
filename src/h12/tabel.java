package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class tabel extends Applet {
    double salaris[];
    double[] kopie;

    public void init() {
        salaris = new double [5];
        kopie = new double[5];


        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;
        }
        kopie = salaris;
        kopie[3] = 1000;  //salaris[3] wordt veranderd!

    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
        }
    }
}