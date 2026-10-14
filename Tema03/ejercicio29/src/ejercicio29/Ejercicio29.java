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
        Scanner entrada = new Scanner (System.in);
        
        // Genero un número entre 1 y 100. Con (int) convierto el número decimal a entero
        int aleatorio = (int) (Math.random() * 100) + 1;

        int num;
        int intentos = 0;

        // Con do y while repito el juego hasta que el usuario adivina el número
     
        do {
            System.out.print("Adivina el numero: ");
            num = entrada.nextInt();
            // Sumo el número de intentos despues de cada intento.
            intentos++;
            
            // Con if indico si el numero es mayor que el introducido
            if (num < aleatorio) {
                System.out.println("El numero es mayor.");
            } else if (num > aleatorio) { // Con else if inndico si el numero es menor.
                System.out.println("El numero es menor.");
            } else { //Indico que el número esta acertado
                System.out.println("Has acertado!");
                System.out.println("Numero de intentos: " + intentos);
            }

        } while (num != aleatorio);
        // TODO code application logic here
    }
    
}
