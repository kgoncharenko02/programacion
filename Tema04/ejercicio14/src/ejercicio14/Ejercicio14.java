/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * Método para pedir el número a usuario.
     * @return 
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca un número mayor que 0: ");
        int numero = entrada.nextInt();

        return numero;
    }
    
    /**
     * Método para comprobar si el número es mayor que 0.
     * @param numero
     * @return 
     */
    public static boolean comprobarNumero(int numero) {
        return numero > 0;
    }
    
    /**
     * Método que muestra el resultado
     * @param numero 
     */
    public static void mostrarResultado(int numero) {
        int contador = 0;

        // Recorro los números desde 1 hasta el número introducido.
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                contador++;
        }
    }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int numero = pedirNumero();

        // Compruebo que el número sea mayor que 0.
        while (!comprobarNumero(numero)) {
            System.out.println("Error: el número debe ser mayor que 0.");
            numero = pedirNumero();
        }

        // Muestro los múltiplos de 3.
        mostrarResultado(numero);
        // TODO code application logic here
    }
    
}
