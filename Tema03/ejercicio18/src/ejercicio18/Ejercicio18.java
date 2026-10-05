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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int contrasenaCorrecta = 123456;
        int contrasena;
        int intentos = 0;

        do {
            System.out.print("Introduce la contraseña: ");
            contrasena = entrada.nextInt();
            intentos++;

            if (contrasena == contrasenaCorrecta) {
                System.out.println("¡Enhorabuena! Contraseña correcta.");
            } else {
                System.out.println("Contraseña incorrecta.");
            }

        } while (contrasena != contrasenaCorrecta && intentos < 3);

        if (contrasena != contrasenaCorrecta) {
            System.out.println("Error de acceso. Has superado los 3 intentos.");
        }
        // TODO code application logic here
    }
    
}
