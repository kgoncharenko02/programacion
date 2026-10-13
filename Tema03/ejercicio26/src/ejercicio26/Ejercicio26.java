/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializo la suma.
        int suma = 0;
        
        // For recorre los números del 111 al 222
        for (int i = 111; i <= 222; i++){
            // Compruebo si el numero es impar
            if (i % 2 != 0){
                // Sumamos los numeros impares.
                suma = suma + i;
            }
        }
        
        System.out.println("La suma total es: " + suma);
        // TODO code application logic here
    }
    
}
