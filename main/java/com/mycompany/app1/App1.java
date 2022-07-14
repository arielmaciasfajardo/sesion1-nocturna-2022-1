/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.app1;

import java.util.Scanner;

/**
 *
 * @author EDU
 */
public class App1 {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        double precioUnidad, cantidad, iva, precioSinIva, totalIva;

        System.out.print("Introduzca precio por unidad del producto: ");                                          
        precioUnidad = sc.nextDouble();

        System.out.print("Introduzca número de productos vendidos: ");
        cantidad = sc.nextDouble();

        System.out.print("Introduzca %IVA: ");
        iva = sc.nextDouble();

        precioSinIva = precioUnidad * cantidad;
        totalIva = precioSinIva * iva / 100;

        System.out.println("Precio de venta -> " + (precioSinIva + totalIva));                                    
    }
    
}
