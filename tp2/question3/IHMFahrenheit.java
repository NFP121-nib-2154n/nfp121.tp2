package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degré Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * méthode déclenchée lorsque le bouton de conversion est appuyé. 
   * remarquer que le champs de droite (les degrés Celsius) n'est pas éditable.
   * @param ae l'événement transmis
   */
  public void actionPerformed( ActionEvent ae ){
        DecimalFormat df = new DecimalFormat("###.#"); //One number after comma.
        String fahrentemp;
        int fahren;
        double cels = 0.0;
        String finalcels = "";
            
        try{
            fahrentemp = entree.getText();
            fahren = Integer.parseInt(fahrentemp);
            cels = fahrenheitEnCelsius(fahren);
            sortie.setText(df.format(cels));
        }
        
        catch (NumberFormatException e){
            System.out.println("error : " + e.getMessage());  // en cas d'erreur 
            finalcels = "error !";
            sortie.setText(finalcels);
        }
        
  }
  
  public static double fahrenheitEnCelsius( int f){
    double cel= (f - 32) / 1.8;
    if (cel < -273.1){
        cel = -273.1;
    }
    return cel;
  }
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
}
