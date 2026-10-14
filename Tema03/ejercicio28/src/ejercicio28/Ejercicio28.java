/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

/**
 *
 * @author alumno
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Genero un número entre 1 y 100.
        int num = (int) (Math.random() * 100) + 1;

        // Muestro el número.
        System.out.println("Numero generado: " + num);

        // Compruebo si es par o impar.
        if (num % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }
        // TODO code application logic here
    
    
}
