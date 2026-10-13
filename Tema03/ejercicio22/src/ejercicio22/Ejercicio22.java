/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
            
        try {
            // Pido los dos numeros al usuario.
            System.out.print("Introduce el primer numero: ");
            int num1 = entrada.nextInt();

            System.out.print("Introduce el segundo numero: ");
            int num2 = entrada.nextInt();

            // Sumo los dos numeros.
            int resultado = num1 + num2;

            System.out.println("La suma es: " + resultado);
            
            // Pongo el error si introduce una letra.
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir numeros.");
        }
        // TODO code application logic here
    }
    
}
