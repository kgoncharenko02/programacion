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
        Scanner entrada = new Scanner(System.in);

        // Pido los dos numeros.
        System.out.print("Introduce el primer numero: ");
        double num1 = entrada.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = entrada.nextDouble();

        int opcion = 0;

        // Muestro el menu hasta elegir salir.
        while (opcion != 5) {
            System.out.println("\n1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();

            // Ejecuto la operacion elegida.
            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case 4:
                    try {
                        System.out.println("Resultado: " + (num1 / num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }

                    if (num2 == 0) {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }

        // TODO code application logic here
    }
    
}
