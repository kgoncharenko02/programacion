/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double numero;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce un número en segundos: ");
        System.out.println("Número: ");
        numero = entrada.nextDouble();
        System.out.println( numero + " segundos hacen un total de:\n" + (numero / 86400) + 
                " días, " + ((numero % 86400) / 3600) + " horas, " + ((numero % 3600) / 60) + 
                " minutos, " + (numero  % 60) + " segundos.");
        // TODO code application logic here
    }
    
}
