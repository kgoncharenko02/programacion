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
    
    static Scanner entrada = new Scanner(System.in);

    /**
     * Calculo la potencia de dos números
     * @param a
     * @param b 
     */
    public static void calcularPotencia(double a, double b) {

        try {

            // Comprobo si la base es 0 y el exponente negativo
            if (a == 0 && b < 0) {
                throw new ArithmeticException();
            }

            System.out.println("Resultado: " + Math.pow(a, b));

        } catch (ArithmeticException e) {

            System.out.println("Error: no se puede elevar 0 a un número negativo.");

        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Pido los dos números a usuario
        System.out.print("Introduce la base: ");
        double a = entrada.nextDouble();

        System.out.print("Introduce el exponente: ");
        double b = entrada.nextDouble();

        calcularPotencia(a, b);

    }
    
}
