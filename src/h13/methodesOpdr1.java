package h13;


import java.*;
import java.awt.*;
import java.applet.*;


public class methodesOpdr1 extends Applet {

    double gem;
    int x1;


    public void init() {

        //Hier roep ik de methode (void) brekengemiddelde op, waardoor het zichtbaar is.


    }


    public void paint(Graphics g) {

        //Hier zet ik de som neer.

        TekenDriehoek(g, 20, 20, 100, 200, 20, 200);


    }

    void TekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        for (int i = 0; i <= 1; i++) {

            g.drawLine(x1, y1, 100, 200);
            g.drawLine(x2, y2, 20, 200);
            g.drawLine(x3, y3, 20, 20);


        }


    }
}

