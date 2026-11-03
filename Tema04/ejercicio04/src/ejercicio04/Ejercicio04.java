/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Scanner;
import operaciones.Operaciones;
/**
 *
 * @author alumno
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        // Pido los tres números
        System.out.print("Introduce el primer número: ");
        int num1 = entrada.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = entrada.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num3 = entrada.nextInt();

        // Llamo al método que está en otra clase
        Operaciones.mostrarMenor(num1, num2, num3);

    
        // TODO code application logic here
    }
    
}
