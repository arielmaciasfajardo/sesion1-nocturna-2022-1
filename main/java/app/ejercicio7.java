
package app;


public class ejercicio7 {

    
    public static void main(String[] args) {
       // ENTRADA 
        String vehiculo="FORD F50";
             boolean licencia = false;
             boolean     efectivo = true;  
        // PROCESO
        if (licencia == true){
        if (efectivo == true){
            System.out.println(vehiculo + " se ejecuta la venta del vehiculo");
            
        }else {
            System.out.println(vehiculo + "  no se ejecuta la venta del vehiculo");
        }
    }else 
    {
        System.out.println(vehiculo + "  no se ejecuta la venta del vehiculo");
    }
    }
}
