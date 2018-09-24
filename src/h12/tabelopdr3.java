package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class tabelopdr3 extends Applet { ;
    String[] cijfers = {"teksvak", "Jeroen", "Sander", "Frank"};
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    String s;
    int x = 50;
    int y = 30;



    public void init() {


        tekstvak = new TextField(20);
        tekstvak2 = new TextField(20);
        label = new Label("");
        tekstvak.addActionListener(new TekstvakListener());
        add(label);
        add(tekstvak);
        add(tekstvak2);
        s = "";
        Arrays.sort(cijfers);



    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < cijfers.length; teller++) {
            g.drawString("" + cijfers[teller], 50, 20 * teller + 20);
        }
    }


        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = tekstvak.getText();

                repaint();
            }
        }

}