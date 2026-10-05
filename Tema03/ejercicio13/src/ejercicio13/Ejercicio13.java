/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 11; 
        
        System.out.println("Números pares entre 11 y 133 (con bucle while):");
        
        while (numero <= 133) {
            
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
            
            numero++;
        }
        // TODO code application logic here
    }
    
}
