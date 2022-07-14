
package app;

import javax.swing.JOptionPane;


public class ejercicio16 {

    
    public static void main(String[] args) {
        // ENTRADA
       String palabra ="" ;
       int longitud= 0;
       int indice=0;
       // proceso
       palabra= JOptionPane.showInputDialog(" Ingrese una pálabra ");
       longitud = palabra.length();
       do{
           JOptionPane.showMessageDialog(null,palabra.charAt(indice));
           indice++;
       }while (indice < longitud);
       }
    }
    

