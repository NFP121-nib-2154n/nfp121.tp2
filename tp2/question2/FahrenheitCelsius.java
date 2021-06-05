package question2;
import java.util.*;
import java.lang.*;
import java.text.*;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("###.#"); //One number after comma.
        ArrayList<Integer> fahrenheit = new ArrayList<Integer>();
        ArrayList<Double> celsius = new ArrayList<Double>();
        ArrayList<String> tempFah = new ArrayList<String>();
        
       try{
           
        for (int i=0; i<args.length; i++){
         tempFah.add(args[i]);
         fahrenheit.add(Integer.parseInt(tempFah.get(i)));
         celsius.add(fahrenheitEnCelsius(fahrenheit.get(i)));
         System.out.println(fahrenheit.get(i) + "\u00B0F -> " + df.format(celsius.get(i)) + "\u00B0C");
        }
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static double fahrenheitEnCelsius( int f){
        double cel= (f - 32) / 1.8;
        return cel;
     }
     
     public static double testingFahrenheit(String num){
            DecimalFormat df = new DecimalFormat("###.#"); //One number after comma.
            int fahren = 0;
            double cels;
            
        try{
            fahren = Integer.parseInt(num);
            cels = fahrenheitEnCelsius(fahren);
            df.format(cels);
        }
        
        catch (NumberFormatException e){
            System.out.println("error : " + e.getMessage());  // en cas d'erreur 
            cels=0.0;
        }
        
        return cels;
    }

}
