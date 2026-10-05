/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        System.out.print("Por favor, introduzca un número de 4 cifras: ");
        int numero = teclado.nextInt();

        int primeraCifra = numero / 1000;
        int segundaCifra = (numero / 100) % 10;
        int terceraCifra = (numero / 10) % 10;
        int cuartaCifra = numero % 10;

        System.out.println("La primera cifra es: " + primeraCifra);
        System.out.println("La segunda cifra es: " + segundaCifra);
        System.out.println("La tercera cifra es: " + terceraCifra);
        System.out.println("La cuarta cifra es: " + cuartaCifra);
        
        // TODO code application logic here
    }
    
}
