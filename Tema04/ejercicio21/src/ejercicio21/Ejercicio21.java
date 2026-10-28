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

    static Scanner entrada = new Scanner(System.in);

    /**
     * Método que pide el primer número.
     * @return 
     */
    public static int pedirPrimerNumero() {
        System.out.print("Introduzca el primer número: ");
        int num1 = entrada.nextInt();

        return num1;
    }

    /**
     * Método que pide el segundo número y comprueba que sea mayor que el primero.
     * @param num1
     * @return 
     */
    public static int pedirSegundoNumero(int num1) {
        int num2;

        do {
            System.out.print("Introduzca un segundo número mayor que el primero: ");
            num2 = entrada.nextInt();

            if (num2 <= num1) {
                System.out.println("Error: el segundo número debe ser mayor que el primero.");
            }

        } while (num2 <= num1);

        return num2;
    }

    /**
     * Método que suma todos los números pares comprendidos entre los dos números.
     * @param num1
     * @param num2 
     */
    public static void mostrarResultado(int num1, int num2) {
        int suma = 0;

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
        }

        System.out.println("La suma de los números pares comprendidos entre " 
                + num1 + " y " + num2 + " es: " + suma);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Pido los dos números.
        int num1 = pedirPrimerNumero();
        int num2 = pedirSegundoNumero(num1);

        // Muestro la suma de los números pares.
        mostrarResultado(num1, num2);
        
        // TODO code application logic here
    }
    
}
