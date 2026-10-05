/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double numero;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca un numero: ");
        numero = entrada.nextDouble();
        
        if (numero >= 0){
            System.out.println("El número introducido es positivo");
        } else {
            System.out.println("El número introducido es negativo");
        }
        
        // TODO code application logic here
    }
    
}
