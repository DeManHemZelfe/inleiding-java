package h13;


import java.*;
import java.awt.*;
import java.applet.*;


public class methodes extends Applet{

double gem;


public void init (){

   //Hier roep ik de methode (void) brekengemiddelde op, waardoor het zichtbaar is.
    berekengemiddelde();

}




public void paint(Graphics g) {

    //Hier zet ik de som neer.
    g.drawString("Het gemiddelde is: " + gem, 50, 60);

}

void berekengemiddelde(){

   //Hier bereken ik het gemiddelde.
    double som;
    double a = 5, b = 6;

    som = a + b;
    gem = som / 2;

}


}