/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio10 {
    
/**
 * Método que pide un número al usuario.
 * @return 
 */
public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca un numero para calcular su tabla de multiplicar: ");
        int numero = entrada.nextInt();

        return numero;
    }
/**
 * Método que muestra la tabla de multiplicar.
 * @param numero 
 */
public static void mostrarTabla(int numero) {

        // Recorro los números del 0 al 10.
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Pido el número y muestro su tabla.
        int numero = pedirNumero();
        mostrarTabla(numero);
    }
        // TODO code application logic here
    
    
}
