package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class tabelopdr1 extends Applet {

    Double totaal;
    int aantal = 0;
    Double cijfer;
    TextField tekstvak;
    Label label;
    String tekst;
    Button knop;
    String foutmMelding;


    public void init() {
        tekstvak = new TextField("", 10);
        tekstvak.addActionListener( new VakListener() );
        tekst = "";
        label = new Label("cijfers." );
        add( label );
        add( tekstvak );
        knop = new Button();
        knop.setLabel("Gemiddelde");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45 );
        g.drawString( "hier komt het cijfer", 50, 80);
        g.drawString(foutmMelding, 50, 100);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            System.out.println("hallo");
            double gemiddelde = totaal / aantal;
            System.out.println(gemiddelde);
            String str = "" + gemiddelde;
            getGraphics().drawString(str, 200, 200);
            if ( totaal >= 5.5 && totaal <=10) {
                tekst = "Deze leerling heeft een voldoende behaald, de leerling is geslaagd.";
            }
            else {
                tekst = "Deze leerling heeft een onvoldonde behaald, en is gezakt.";
            }

        }
    }
    class VakListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {



            foutmMelding = "";
            System.err.println(foutmMelding);

            String s = tekstvak.getText();
            tekstvak.setText("");

            if (totaal != null) {
                totaal = totaal + Double.parseDouble(s);
                aantal++;
            } else {
                totaal = Double.parseDouble(s);
                aantal++;
            }

            System.out.println("Totaal is " + totaal + " en aantal is " + aantal);

            if (Double.parseDouble(s) >= 5.5 && Double.parseDouble(s) <= 10) {
                tekst = "Deze leerling heeft een voldoende behaald.";
            } else {
                tekst = "Deze leerling heeft een onvoldonde behaald.";
            }
            repaint();
        }



    }
}
