import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KnopOpdr2 extends Applet{

    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    TextField tekstvak;
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    int teller;
    int teller1;
    int teller2;
    int teller3;
    String man, vrouw, student, studente;

    public void init() {

        tekstvak = new TextField("Man ", 50);
        tekstvak1 = new TextField("Vrouw ", 50);
        tekstvak2 = new TextField("Student ", 50);
        tekstvak3 = new TextField("Studente ", 50);
        knop = new Button("Man");
        knop.addActionListener( new KnopListener() );
        knop2 = new Button("Vrouw");
        knop2.addActionListener( new Knop2Listener() );
        knop3 = new Button("Student");
        knop3.addActionListener( new Knop3Listener() );
        knop4 = new Button("Studente");
        knop4.addActionListener( new Knop4Listener() );
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);
        man ="";
        vrouw = "";
        student = "";
        studente = "";
        teller=0;
        teller1=0;
        teller2=0;
        teller3=0;
    }

    public void paint(Graphics g) {
        g.drawString("man" +teller, 50,60);
        g.drawString("vrouw" +teller1, 50,80);
        g.drawString("student" +teller2, 50,100);
        g.drawString("studente" +teller3, 50,120);
    }

    class KnopListener implements ActionListener {

        public void actionPerformed( ActionEvent e ) {
            teller++;
            man = tekstvak1.getText();
            repaint();
        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            teller1++;
            vrouw = tekstvak.getText();
            repaint();
        }
    }

    class Knop3Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            teller2++;
            student = tekstvak2.getText();
            repaint();
        }
    }

    class Knop4Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            teller3++;
            studente = tekstvak3.getText();
            repaint();
        }
    }
}