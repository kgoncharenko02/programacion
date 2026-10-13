/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num;
        
        do {
            // Pido un número mayor que 0.
            System.out.print("Introduce un número mayor que 0: ");
            num = entrada.nextInt();
            
            //Compruebo si es valido
            if (num <= 0){
                System.out.println("Error: El numero debe ser mayor que 0.");
            }
        } while (num <= 0);
        
        int total = 0;
        
        for (int i = 1; i <= num; i++){
            if (i % 3 == 0){
                System.out.println(i);
                total++;
            }
        }
        System.out.println("Total de numeros mostrados: " + total);
        // TODO code application logic here
    }
    
}
