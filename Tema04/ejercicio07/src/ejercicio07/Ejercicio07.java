/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07 {

    /**
     * Método para ordenar los números de menor a mayor
     * @param num1
     * @param num2
     * @param num3
     * @param num4 
     */
    public static void ordenarNumeros(int num1, int num2, int num3, int num4) {

        int[] numeros = {num1, num2, num3, num4};
        int aux;

        for (int i = 0; i < numeros.length - 1; i++) {

            for (int j = 0; j < numeros.length - 1; j++) {

                if (numeros[j] > numeros[j + 1]) {

                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;

                }

            }

        }

        // Muestro los números ordenados
        System.out.print("El orden de los números es: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);

            if (i < numeros.length - 1) {
                System.out.print(" - ");
            }
        }

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

        // Pedimos los cuatro números
        System.out.print("Introduce el primer número: ");
        int num1 = entrada.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = entrada.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num3 = entrada.nextInt();

        System.out.print("Introduce el cuarto número: ");
        int num4 = entrada.nextInt();

        // Llamamos al método
        ordenarNumeros(num1, num2, num3, num4);
    
        // TODO code application logic here
    }
    
}
