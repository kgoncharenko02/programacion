/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Por favor, introduzca un numero: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        int numero2 = entrada.nextInt();

        String operacion;
        int resultado;

        if (numero1 > 10) {
            operacion = "producto";
            resultado = numero1 * numero2;
        } else {
            operacion = "suma";
            resultado = numero1 + numero2;
        }

        System.out.println("La operación que se realizó es " + operacion + " y el resultado es " + resultado);
        // TODO code application logic here
    }
    
}
