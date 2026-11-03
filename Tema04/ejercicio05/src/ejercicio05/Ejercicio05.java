/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;
import operaciones.Operaciones;

/**
 *
 * @author alumno
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pido un número
        System.out.print("Introduce un número: ");
        int numero = entrada.nextInt();

        // Llamo al método de otro paquete
        Operaciones.comprobarPar(numero);

        // TODO code application logic here
    }
    
}
