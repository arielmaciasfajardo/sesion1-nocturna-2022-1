package app;

import javax.swing.JOptionPane;

public class ejercicio15 {

    public static void main(String[] args) {
        // entrada
        int numeroIngresado = 0;

        //proceso
        numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        int entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "****MENU DE COVERCIONES****" + "\n"
                + "1. PRESENTA FRECUENCIA ASCENDENTE" + "\n"
                + "2. PRESENTA FRECUENCIA DESCENDENTE" + "\n"
                + "3. SALIR"));

        //evaluar los dos escenarios con switch
        switch (entrada) {
            case 1:
                numeroIngresado++;
                //generamos la secuencia ascendente
                while (numeroIngresado < 11) {
                    JOptionPane.showInputDialog(null, numeroIngresado);
                    numeroIngresado++;

                }
                break;
            case 2:
                numeroIngresado--;
                //generamos la secuencia descendente
                while (numeroIngresado > 0) {
                    
                    JOptionPane.showInputDialog(null, numeroIngresado);
                   numeroIngresado--;

                }
        }

    }
}
