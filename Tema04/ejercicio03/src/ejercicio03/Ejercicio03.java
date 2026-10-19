/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Scanner;
import operaciones.Operaciones;
/**
 *
 * @author alumno
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Pido tres números al usuario.
        System.out.print("Por favor, introduzca el primer número: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Por favor, introduzca un segundo número: ");
        int num2 = entrada.nextInt();
        
        System.out.print("Por favor, introduzca un tercer número: ");
        int num3 = entrada.nextInt();
        
        Operaciones objeto = new Operaciones();

        // Llamo al método que muestra el número mayor.
        objeto.mostrarMayor(num1, num2, num3);
       
        // TODO code application logic here
    }
    
}
