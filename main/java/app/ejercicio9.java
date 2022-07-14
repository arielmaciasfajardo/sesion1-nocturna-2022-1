
package app;

import javax.swing.JOptionPane;


public class ejercicio9 {

    
    public static void main(String[] args) {
       // ENTRADA 
        String Nombre="ariel ";
             boolean lugar = true;
             boolean     edad = true; 
             boolean mesa = true;
        // PROCESO
        if (lugar == true){
           System.out.println(Nombre + " se valida el lugar ");
        if (edad == false){
            System.out.println(Nombre + " se valida la edad ");
            if( mesa == false){
           
            System.out.println(Nombre + " se valida la mesa ");
             
        }else {
              System.out.println(Nombre + "  no se valida la mesa para votar  "); 
             
            }
    }else 
            System.out.println(Nombre + "  no se valida la edad  para realizar el proceso de votacion");
        
    {
       
        
    
        }
        
}else 
System.out.println(Nombre + "  no se valida la votacion ");
       JOptionPane.showInputDialog(null, "Nombre" );
        
    }
}
