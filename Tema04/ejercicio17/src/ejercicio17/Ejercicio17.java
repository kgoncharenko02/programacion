/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * Método que genera una letra aleatoria entre la a y la z.
     * @return 
     */
    public static char generarLetra() {
        char letra = (char) (Math.random() * 26 + 97);
        return letra;
    }

    /**
     * Método que pide una letra al usuario.
     * @return 
     */
    public static char pedirLetra() {
        System.out.print("Introduzca una letra minúscula: ");
        char letra = entrada.nextLine().charAt(0);
        return letra;
    }

    /**
     * Método que comprueba la letra introducida.
     * @param letra
     * @param letraSecreta
     * @return 
     */
    public static boolean comprobarLetra(char letra, char letraSecreta) {
        return letra == letraSecreta;
    }

    /**
     * Método que muestra si la letra está antes o después.
     * @param letra
     * @param letraSecreta 
     */
    public static void mostrarPista(char letra, char letraSecreta) {
        if (letra < letraSecreta) {
            System.out.println("La letra que buscas está después en el alfabeto.");
        } else if (letra > letraSecreta) {
            System.out.println("La letra que buscas está antes en el alfabeto.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letraSecreta = generarLetra();
        char letra;
        int intentos = 0;

        // Repito hasta que el usuario adivine la letra.
        do {
            letra = pedirLetra();
            intentos++;

            if (!comprobarLetra(letra, letraSecreta)) {
                mostrarPista(letra, letraSecreta);
            }

        } while (!comprobarLetra(letra, letraSecreta));

        System.out.println("¡Enhorabuena! Has adivinado la letra.");
        System.out.println("La letra era: " + letraSecreta);
        System.out.println("Número de intentos: " + intentos);
        // TODO code application logic here
    }
    
}
