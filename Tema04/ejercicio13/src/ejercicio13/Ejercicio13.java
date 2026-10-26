/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * Método para pedir el número a usuario.
     * @return 
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca un número mayor que 1: ");
        int numero = entrada.nextInt();

        return numero;
    }
    
    /**
     * Método para comprobar si el número es mayor que 1.
     * @param numero
     * @return 
     */
    public static boolean comprobarNumero(int numero) {
        return numero > 1;
    }
    
    /**
     * Método que muestra el resultado
     * @param numero 
     */
    public static void mostrarResultado(int numero) {
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = pedirNumero();

        // Compruebo que el número sea mayor que 1.
        while (!comprobarNumero(numero)) {
            System.out.println("Error: el número debe ser mayor que 1!!!");
            numero = pedirNumero();
        }

        // Muestro el resultado.
        mostrarResultado(numero);
        
        // TODO code application logic here
    }
    
}
