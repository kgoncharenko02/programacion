/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        int numero3;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el primer numero: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el segundo numero: ");
        numero2 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el tercer numero: ");
        numero3 = entrada.nextInt();
        
        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("El menor es: " + numero1);
        } else if (numero2 < numero3) {
            System.out.println("El menor es: " + numero2);
        } else {
            System.out.println("El menor es: " + numero3);
        }
        
        // TODO code application logic here
    }
    
}
