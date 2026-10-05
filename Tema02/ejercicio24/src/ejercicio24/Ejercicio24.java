/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double programacion, lenguajesMarcas, basesDatos, entornos, sistemas, fol;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Por favor, introduzca la nota de Programación: ");
        programacion = entrada.nextDouble();
        
        System.out.print("Introduzca la nota de Lenguajes de Marcas: ");
        lenguajesMarcas = entrada.nextDouble();
        
        System.out.print("Introduzca la nota de Bases de Datos: ");
        basesDatos = entrada.nextDouble();
        
        System.out.print("Introduzca la nota de Entornos de Desarrollo: ");
        entornos = entrada.nextDouble();
        
         System.out.print("Introduzca la nota de Sistemas Informáticos: ");
        sistemas = entrada.nextDouble();
        
        System.out.print("Por último, introduzca la nota de Formación y Orientación Laboral: ");
        fol = entrada.nextDouble();
        
        double notaMedia = (programacion + lenguajesMarcas + basesDatos + entornos + sistemas + fol) / 6;
        
        System.out.println("Su nota media del curso es de: " + notaMedia);
        // TODO code application logic here
    }
    
}
