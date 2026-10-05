/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author alumno
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 11; 
        
        System.out.println("Números pares entre 11 y 133:");
        
        do {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
            
            numero++; 
            
        } while (numero <= 133); 
        
        // TODO code application logic here
    }
    
}
