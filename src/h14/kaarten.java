package h14;

import com.sun.org.apache.xpath.internal.operations.Variable;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.*;
import java.awt.color.*;
import java.util.Random.*;

public class kaarten extends Applet {

    Button button;
    String schermtekst;


    double r;
    int worp;
    String[]deck = { "klaver", "schoppen","harten","ruiten"};
    String randomdeck;
    int randomdeckvormen;
    double random;
    double random2;
    String[]deckgetallen = {"2","3","4","5","6","7","8","9","10","A","boer"};
    String randomdeck2;
    int randomdeckgetallen;
    TextField tekstvak;

     public void init() {


         schermtekst = "";
         button = new Button();
         button.setLabel("deel kaart");
         add(button);
         ButtonListener bl = new ButtonListener();
         button.addActionListener( bl );
         Deck();


        // worp = (int)(r * deck);


    }

    private void Deck(){

        random = Math.random();
        randomdeckvormen = (int)(random * 4);
        randomdeck = deck[randomdeckvormen];
        random2 = Math.random();
        randomdeckgetallen = (int)(random * 10);
        randomdeck2 = deckgetallen[randomdeckgetallen];






    }
    public void paint(Graphics g) {

        g.drawString(schermtekst, 50, 100 );
        g.drawString(randomdeck , 50, 60 );
        g.drawString(randomdeck2, 110, 60);

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {

            schermtekst = "";
            random = Math.random();
            randomdeckvormen = (int)(random * 4);
            randomdeck = deck[randomdeckvormen];
            random2 = Math.random();
            randomdeckgetallen = (int)(random * 10);
            randomdeck2 = deckgetallen[randomdeckgetallen];
            repaint();

        }

    }
}