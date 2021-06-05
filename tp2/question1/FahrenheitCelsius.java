package question1;
import java.util.*;
import java.lang.*;
import java.text.*;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter
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
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static double fahrenheitEnCelsius(int f) {
        double cel= (f - 32) / 1.8;
        return cel;
    }

}
