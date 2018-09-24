import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KnopOpdr3 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop5;
    String schermtekst;
    double uitkomst;
    double getal;
    double geheel;
    double btw;

        public void init() {
            tekstvak = new TextField("", 20);
            label = new Label("Type een getal");
            tekstvak.addActionListener(new TekstvakListener());
            add(label);
            add(tekstvak);
            schermtekst = "Doet deze knopwel iets?";
            knop5 = new Button("BTW 21%");
            Knop5Listener kl = new Knop5Listener();
            knop5.addActionListener(kl);
            add(knop5);


        }

        public void paint(Graphics g) {
            g.drawString("De btw is " + uitkomst, 50, 60);
            g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        }

        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                tekstvak.setText("");
                //String s = tekstvak.getText();

                //tekstvak.setText("");
                //uitkomst = Double.parseDouble(s);
                getal = Double.parseDouble(tekstvak.getText());
                tekstvak.setText("");
                setLayout(null);

                geheel = 100;
                btw = 121;
                uitkomst= (getal / geheel) * btw;
                //Je kan deze regels ook samenvoegen
                //getal = Double.parseDouble(tekstvak.getText());
                repaint();


            }
        }

        class Knop5Listener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                schermtekst = "";
                repaint();
            }
        }

    }
