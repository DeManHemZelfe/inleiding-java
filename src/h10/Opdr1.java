package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdr1 extends Applet {
    TextField tekstvak,tekstvak2;
    Label label;
    String  tekst;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Typ een nummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekstvak2 = new TextField("", 20);
        tekstvak2.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        add(new Label("waarde2"));
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        if (tekst!=null)
        g.drawString(tekst, 50, 250 );

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int waarde1= Integer.parseInt( s);
            String s2 = tekstvak2.getText();
            int waarde2= Integer.parseInt( s2);
            int uitkomst;
            if (waarde1>waarde2)
                uitkomst=waarde1;
            else
                uitkomst=waarde2;
            tekst="de grootste waarde is: "+ uitkomst;
            repaint();
            }

        }

}