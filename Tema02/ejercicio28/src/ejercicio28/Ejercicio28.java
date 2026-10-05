/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Por favor, introduzca el tamaño del archivo en MB: ");
        double tamanoMB = teclado.nextDouble();

        System.out.print("Introduzca la velocidad de su ADSL en Megabits (Mbps): ");
        double velocidadMbps = teclado.nextDouble();

        double tamanoMegabits = tamanoMB * 8;

        double tiempoSegundos = tamanoMegabits / velocidadMbps;

        double tiempoMinutos = tiempoSegundos / 60;

        double tiempoMinutosRedondeado = Math.round(tiempoMinutos * 100.0) / 100.0;

        System.out.println("El tiempo estimado de descarga es de: " + tiempoMinutosRedondeado + " minutos");
        // TODO code application logic here
    }
    
}
