/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author JAVIER JACOME
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado= new Scanner(System.in);
           
            int kilovatiosConsumidos; 
            int edadCliente;
            int porcentaje=10;
            double costoTotal; 
            double descuento;
            double costoHora;
            System.out.println ("Ingrese el valor de costo por kilovatio/hora:");
            costoHora= teclado.nextInt();
            System.out.println ("Ingrese el número de kilovatios consumidos en el mes:");
            kilovatiosConsumidos= teclado.nextInt();
            System.out.println ("Cual es la edad del cliente?:");
            edadCliente= teclado.nextInt();
            costoTotal = costoHora * kilovatiosConsumidos;
            if (edadCliente>65){
                descuento = (costoTotal*porcentaje)/100;
                costoTotal = costoTotal - descuento;
            }
            System.out.println ("El costo total es: " + costoTotal);
    }
    
}
