/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06 {

    /**
     * Muestro la calificación según la nota
     * @param nota 
     */
    public static void mostrarCalificacion(int nota) {

        if (nota < 0 || nota > 10) {
            System.out.println("Error: la nota debe estar entre 0 y 10.");
        } else if (nota <= 4) {
            System.out.println("Suspenso.");
        } else if (nota <= 6) {
            System.out.println("Bien.");
        } else if (nota <= 8) {
            System.out.println("Notable.");
        } else {
            System.out.println("Sobresaliente.");
        }
     }   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner entrada = new Scanner(System.in);

        // Pido la nota
        System.out.print("Introduce la nota del alumno: ");
        int nota = entrada.nextInt();

        // Llamo al método
        mostrarCalificacion(nota);
   
        // TODO code application logic here
    }
    
}
