/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Por favor, introduzca un número por teclado: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número introducido es par");
        } else {
            System.out.println("El número introducido es impar");
        }
        // TODO code application logic here
    }
    
}
