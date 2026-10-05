/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        double primerNumero, segundoNumero, tercerNumero;

        System.out.print("Por favor, introduzca el primer número: ");
        primerNumero = teclado.nextDouble();

        System.out.print("Por favor, introduzca el segundo número: ");
        segundoNumero = teclado.nextDouble();

        System.out.print("Por favor, introduzca el tercer número: ");
        tercerNumero = teclado.nextDouble();

        double suma = primerNumero + segundoNumero + tercerNumero;
        double producto = primerNumero * segundoNumero * tercerNumero;

        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("El producto de los números introducidos es: " + producto);
        // TODO code application logic here
    }
    
}
