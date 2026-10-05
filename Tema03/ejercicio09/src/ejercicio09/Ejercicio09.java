/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Por favor, introduzca el primer numero: ");
        int a = entrada.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        int b = entrada.nextInt();

        System.out.print("Introduzca el tercer numero: ");
        int c = entrada.nextInt();

        System.out.print("Por último, introduzca un cuarto numero: ");
        int d = entrada.nextInt();

        int aux;

        if (a > b) { aux = a; a = b; b = aux; }
        if (b > c) { aux = b; b = c; c = aux; }
        if (c > d) { aux = c; c = d; d = aux; }
        
        if (a > b) { aux = a; a = b; b = aux; }
        if (b > c) { aux = b; b = c; c = aux; }
        
        if (a > b) { aux = a; a = b; b = aux; }

        System.out.println("El orden de los números introducidos es el " + a + " - " + b + " - " + c + " - " + d);

        // TODO code application logic here
    }
    
}
