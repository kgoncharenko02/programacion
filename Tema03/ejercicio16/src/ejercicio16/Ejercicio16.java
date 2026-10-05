/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int contadorImpares = 0;
        
        System.out.print("Los números impares existentes entre el número 20 y el 160 son: ");
        
        // Bucle del 20 al 160
        for (int i = 20; i <= 160; i++) {
            // Un número es impar si el residuo de dividirlo entre 2 es diferente de 0
            if (i % 2 != 0) {
                System.out.print(i + " - ");
                contadorImpares++; // Sumamos 1 al contador
            }
        }
        
        // Impresión del resultado final
        System.out.println("La cantidad de números impares impresos han sido: " + contadorImpares);
        
        // TODO code application logic here
    }
    
}
