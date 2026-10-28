/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * Método que pide el día de la semana.
     * @return 
     */
    public static String pedirDia() {
        System.out.print("Por favor, introduzca un día de la semana: ");
        String dia = entrada.nextLine();

        return dia;
    }

    /**
     * Método que muestra la posición del día en la semana.
     * @param dia 
     */
    public static void mostrarPosicion(String dia) {

        switch (dia.toLowerCase()) {
            case "lunes":
                System.out.println("El lunes es el primer día de la semana.");
                break;
            case "martes":
                System.out.println("El martes es el segundo día de la semana.");
                break;
            case "miércoles":
                System.out.println("El miércoles es el tercer día de la semana.");
                break;
            case "jueves":
                System.out.println("El jueves es el cuarto día de la semana.");
                break;
            case "viernes":
                System.out.println("El viernes es el quinto día de la semana.");
                break;
            case "sábado":
                System.out.println("El sábado es el sexto día de la semana.");
                break;
            case "domingo":
                System.out.println("El domingo es el séptimo día de la semana.");
                break;
            default:
                System.out.println("Error: el día introducido no es válido.");
        }
        
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Pido el día y muestro su posición.
        String dia = pedirDia();
        mostrarPosicion(dia);
        
        // TODO code application logic here
    }
    
}
