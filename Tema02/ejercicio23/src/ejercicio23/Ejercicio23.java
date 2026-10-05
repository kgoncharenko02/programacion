/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double precio;
        double cantidad;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        System.out.println("Precio: ");
        precio = entrada.nextDouble();
        
        System.out.println("¿Cuántas unidades quiere llevarse? ");
        System.out.println("Cantidad: ");
        cantidad = entrada.nextDouble();
        
        System.out.println("El precio total de su compra es de: " + (cantidad * precio) + " Euros.");
        // TODO code application logic here
    }
    
}
