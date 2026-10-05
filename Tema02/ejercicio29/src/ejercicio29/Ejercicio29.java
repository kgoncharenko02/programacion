/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Por favor, introduzca la longitud del primer cateto: ");
        double cateto1 = teclado.nextDouble();

        System.out.print("Introduzca la longitud del segundo cateto: ");
        double cateto2 = teclado.nextDouble();

        double sumaCuadrados = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        
        double hipotenusa = Math.sqrt(sumaCuadrados);

        double hipotenusaRedondeada = Math.round(hipotenusa * 100.0) / 100.0;

        System.out.println("La longitud de la hipotenusa es: " + hipotenusaRedondeada);
        // TODO code application logic here
    }
    
}
