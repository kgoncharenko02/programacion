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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nota;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca la nota del alumno: ");
        nota = entrada.nextInt();
        
        if (nota < 0 || nota > 10){
            System.out.println("Error: La nota tiene que ser entre 0 y 10");
        } else if (nota > 8) {
            System.out.println("Sobresaliente");
        } else if (nota > 6) {
            System.out.println("Notable");
        } else if (nota > 4){
            System.out.println("Bien");
        } else {
            System.out.println("Suspenso");
        }
    }
        // TODO code application logic here
    
    
}
