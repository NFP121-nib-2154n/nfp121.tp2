package question1;
import java.util.*;
import java.lang.*;
import java.text.*;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###.#"); //One number after comma.
        
    /*I created three arraylists here:
        tempFah (String): to save the Strings from the argument.
        fahrenheit (Integer): to save the Integer after converting the Strings in tempFah to int.
        celsius (Double): to save the converted number from fahrenheit to celsius.
    */    
        ArrayList<Integer> fahrenheit = new ArrayList<Integer>();
        ArrayList<Double> celsius = new ArrayList<Double>();
        ArrayList<String> tempFah = new ArrayList<String>();
        
        for (int i=0; i<args.length; i++){
         tempFah.add(args[i]);
         fahrenheit.add(Integer.parseInt(tempFah.get(i)));
         celsius.add(fahrenheitEnCelsius(fahrenheit.get(i)));
         System.out.println(fahrenheit.get(i) + "\u00B0F -> " + df.format(celsius.get(i)) + "\u00B0C");
        }
                                                                       
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static double fahrenheitEnCelsius(int f) {
        double cel= (f - 32) / 1.8;
        return cel;
    }

}
