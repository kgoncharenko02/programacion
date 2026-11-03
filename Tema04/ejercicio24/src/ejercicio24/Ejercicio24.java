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

    static Scanner entrada = new Scanner(System.in);

    /**
     * Pido el nombre al usuario
     * @return 
     */
    public static String pedirNombre() {
        System.out.print("Introduce tu nombre: ");
        return entrada.nextLine();
    }

    /**
     * Pido la edad al usuario
     * @return 
     */
    public static int pedirEdad() {
        System.out.print("Introduce tu edad: ");
        return entrada.nextInt();
    }

    /**
     * Compruebo que el usuario es mayor de edad
     * @param edad
     * @param nombre 
     */
    public static void mayorDeEdad(int edad, String nombre) {

        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Pido los métodos que creé antes
        String nombre = pedirNombre();
        int edad = pedirEdad();

        mayorDeEdad(edad, nombre);

    }
}
    

