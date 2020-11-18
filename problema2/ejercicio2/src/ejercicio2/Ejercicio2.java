/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author JAVIER JACOME
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        
        int porcentaje=15;
        int articulos;
        double precioUnitario;
        double descuento;
        double costo;
        
        System.out.println ("Ingrese la cantidad que se requiere del artículo");
        articulos= teclado.nextInt();
        System.out.println ("Ingrese el precio unitario del articulo");
        precioUnitario= teclado.nextDouble();
        costo = precioUnitario * articulos;
        
        if (articulos >50 ){
            descuento = (costo *porcentaje)/100;
            costo  = costo  - descuento;
        }
        System.out.println ("El costo total del pedido del articulo es de: " 
                + costo);
    }
    
}
