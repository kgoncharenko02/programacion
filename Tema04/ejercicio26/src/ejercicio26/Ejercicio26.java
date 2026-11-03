/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * Compruebo si un número es primo
     * @param numero
     * @return 
     */
    public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }
        // Compruebo si tiene algún divisor
        for (int i = 2; i < numero; i++) {

            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Pido un número
        System.out.print("Introduce un número: ");
        int numero = entrada.nextInt();

        // Muestro si es primo o no
        if (esPrimo(numero)) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }
        // TODO code application logic here
    }
    
}
