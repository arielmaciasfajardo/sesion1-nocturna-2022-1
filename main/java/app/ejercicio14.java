
package app;

import javax.swing.JOptionPane;


public class ejercicio14 {

    
    public static void main(String[] args) {
        // entrada
        String palabra = " ";
        int longitud = 0;
                int cantidadVocales=0;
              
                     int cantidadConsonante=0;
                     // proceso 
                     palabra = JOptionPane.showInputDialog(null," Ingrese la palabra ");
                     // proceso: obtenemos la longitud de la palabra
                     longitud = palabra.length();
                     //proceso : Recorrer
                     for(int indice=0; indice<longitud; indice++){
                         //validacion de vocales 
                         if(palabra.charAt(indice)=='a'|| palabra.charAt(indice)=='e'|| palabra.charAt(indice)=='i'|| palabra.charAt(indice)=='o' ||palabra.charAt(indice)=='u'){
                         cantidadVocales++;
                         }else {
                             cantidadConsonante++;
                         }
                             


                     }
    
                //salida
                JOptionPane.showInputDialog(null," La cantidad de vocales es : "+ cantidadVocales);
                JOptionPane.showInputDialog(null," La cantidad de Consonantes es : " + cantidadConsonante);
                     
    }
    
}
