/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31;

/**
 *
 * @author alumno
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        int cantidad = 0; // Cuenta todos numeros generados
        int impares = 0; // Cuenta cuantos numeros impares ha encontrado
        
        //Genero numeros hasta obtener 3 impares
        while (impares < 3){ // Repite hasta encontrar 3 numeros impares
            num = (int) (Math.random() * 100) + 1; // Genera número entre 1 y 100.
            cantidad++; // Aumenta intentos cada vez que intenta generar un numero.
            
            //Compruebo si el número es impar.
            if (num % 2 != 0){
                System.out.println("Numero impar: " + num);
                impares++; // Aumenta hasta llegar a 3 numeros impares.
            }
        }
        System.out.println("Cantidad de numeros generados: " + cantidad);
        // TODO code application logic here
    }
    
}
