/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio12 {

    /**
     * Método que pide la contraseña al usuario.
     * @return 
     */
    public static String pedirContrasena() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca la contraseña: ");
        String contrasena = entrada.nextLine();

        return contrasena;
    }
    
    /**
     * Método que comprueba la contraseña.
     * @param contrasena
     * @return 
     */
    public static boolean comprobarContrasena(String contrasena) {
        return contrasena.equals("1234");
    }
    
    /**
     * Métofo que realiza la comprobación y muestra el resultado
     */
    public static void resultado() {
        int intentos = 0;
        boolean correcta = false;

        // Permito un máximo de tres intentos.
        while (intentos < 3 && !correcta) {
            String contrasena = pedirContrasena();

            correcta = comprobarContrasena(contrasena);

            if (correcta) {
                System.out.println("¡Enhorabuena! La contraseña es correcta.");
            } else {
                intentos++;
                if (intentos < 3) {
                    System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
                } else {
                    System.out.println("Error de acceso.");
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creo un objeto y llamo al método del resultado.
        resultado();
        
        // TODO code application logic here
    }
    
}
