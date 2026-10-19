/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01 {
    /**
     * Método que comprueba si el número es positivo o negativo.
     * @param numero 
     */

    public static void comprobarNumero (int numero){
        if (numero > 0){ //Compruebo si el número es mayor que 0.
            System.out.println("El número es positivo.");
        } else if (numero < 0){ //Compruebo si el número es menor que 0.
           System.out.println("El número es negativo."); 
        } else {
            System.out.println("El número es cero.");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Pido un número a usuario
        System.out.print("Por favor, introduzca un número: ");
        int numero = entrada.nextInt();
        
        comprobarNumero(numero);
        // TODO code application logic here
    }
    
}
