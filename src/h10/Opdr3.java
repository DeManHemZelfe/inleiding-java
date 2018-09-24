package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdr3 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    Label Label2;
    String s, tekst;
    String s2, tekst2;
    String foutMelding = "";
    int maand;
    int jaartal;

    public void init() {
        setLayout(null);
        tekstvak = new TextField("", 50);
        tekstvak.setBounds(50, 40, 150, 30);
        tekstvak2 = new TextField("", 50);
        tekstvak2.setBounds(50,150, 150, 30);
        label = new Label("Type een maand nummer en druk op enter");
        label.setBounds(20, 10, 400, 30);
        Label2 = new Label("Typ een jaartaal en kijk of het een schrikkeljaar is");
        Label2.setBounds(20, 80, 400, 30);
        tekstvak.addActionListener(new TekstvakListener());
        tekstvak2.addActionListener(new TekstvakListener());
        tekst = "";
        tekst2 = "";
        add(label);
        add(Label2);
        add(tekstvak);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 80);
        g.drawString(tekst2, 200, 250);
        g.drawString(foutMelding, 20, 210);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            foutMelding = "";
            s = tekstvak.getText();
            s2 = tekstvak2.getText();
            tekstvak.setText("");
            tekstvak2.setText("");
            try {
                maand = Integer.parseInt(s);
                jaartal = Integer.parseInt(s2);
                switch (maand) {
                    case 1:
                        tekst = "Januari, Januari heeft 31 dagen";
                        break;
                    case 2:
                        tekst = "Februari, Februari heeft 28 dagen";
                        break;
                    case 3:
                        tekst = "Maart, Maart heeft 31 dagen";
                        break;
                    case 4:
                        tekst = "April, April heeft 30 dagen";
                        break;
                    case 5:
                        tekst = "Mei, Mei heeft 31 dagen";
                        break;
                    case 6:
                        tekst = "Juni, Juni heeft 30 dagen";
                        break;
                    case 7:
                        tekst = "Juli, Juli heeft 31 dagen";
                        break;
                    case 8:
                        tekst = "Augustus, Augustus heeft 31 dagen";
                        break;
                    case 9:
                        tekst = "September, September heeft 30 dagen";
                        break;
                    case 10:
                        tekst = "Oktober, Oktober heeft 31 dagen";
                        break;
                    case 11:
                        tekst = "November, November heeft 30 dagen";
                        break;
                    case 12:
                        tekst = "December, December heeft 31 dagen";
                        break;
                    default:
                        tekst = "Deze maand bestaat niet!";
                        break;
                }

                if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                        jaartal % 400 == 0) {
                    tekst2 = "" + jaartal + " is een schrikkeljaar";
                } else {
                    tekst2 = "" + jaartal + " is geen schrikkeljaar";

                }
            }
            catch (Exception e1){
                foutMelding = "beide tekstvakken zijn niet ingevuld";
                System.err.println(foutMelding);

            }

            repaint();

        }



        }
    }
