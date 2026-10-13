/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num;
        
        do {
            // Pido un numero mayor que 1.
            System.out.print("Introduce un numero mayor que 1: ");
            num = entrada.nextInt();
            
            // Compruebo que el numero sea valido.
            if (num <= 1) {
                System.out.println("Error: El numero debe ser mayor que 1.");
            }

        } while (num <= 1);
        
        // Mostramos los numeros desde 1 hasta el numero introducido.
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        // TODO code application logic here
    }
    
}
