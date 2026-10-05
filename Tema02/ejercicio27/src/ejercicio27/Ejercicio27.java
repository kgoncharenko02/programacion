/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.print("Por favor, introduzca un número: ");
        int numero = teclado.nextInt();

        int doble = numero * 2;
        int cubo = numero * numero * numero;

        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("El cubo de " + numero + " es: " + cubo);
        // TODO code application logic here
    }
    
}
