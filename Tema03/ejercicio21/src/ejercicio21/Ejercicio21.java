/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Pido los dos numeros al usuario.
        System.out.print("Introduce el primer número: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = entrada.nextInt();
        
        // Intento realizar la division.
        try {
            int resultado = num1 / num2;
            System.out.println("El resultado es " + resultado);  // Pongo el error si el divisor es cero.
        } catch (ArithmeticException e){
            System.out.println("Error: No se puede dividir entre cero.");
        }
        // TODO code application logic here
    }
    
}
