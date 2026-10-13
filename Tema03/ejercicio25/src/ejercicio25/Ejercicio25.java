/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Primero pongo que la suma es 0
        int suma = 0;
        
        // Busco los numeros del 17 al 139.
        for (int i = 17; i <= 139; i++){
            // Compruebo si el numero es par.
            if (i % 2 == 0){
                // Sumo los numeros pares.
                suma = suma + i;
            }
        }
        
        System.out.println("La suma total es: " + suma);
        // TODO code application logic here
    }
    
}
