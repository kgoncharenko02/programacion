/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio18 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * Método que pide el nombre al usuario.
     * @return 
     */
    public static String pedirNombre() {
        System.out.print("Introduzca su nombre: ");
        String nombre = entrada.nextLine();

        return nombre;
    }

    /**
     * Método que muestra el nombre cinco veces.
     * @param nombre 
     */
    public static void mostrarNombre(String nombre) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nombre);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Pido el nombre y lo muestro cinco veces.
        String nombre = pedirNombre();
        mostrarNombre(nombre);
        
        // TODO code application logic here
    }
    
}
