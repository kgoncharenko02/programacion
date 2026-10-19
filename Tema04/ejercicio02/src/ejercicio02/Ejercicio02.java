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
     * Método que multiplica el número 1 y el 2.
     * @param num1
     * @param num2 
     */
    public void multiplicar(int num1, int num2){
        int resultado = num1 * num2;
        
        System.out.println("La operación que se realizó es producto y el resultado es " + resultado);
    }
    /**
     * Método que suma el número 1 y el 2.
     * @param num1
     * @param num2 
     */
    public void sumar(int num1, int num2){
        int resultado = num1 + num2;
        
        System.out.println("La operación que se realizó es suma y el resultado es " + resultado);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Pido dos números al usuario.
        System.out.print("Por favor, introduzca un número: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Por favor, introduzca otro número: ");
        int num2 = entrada.nextInt();
        
        Ejercicio02 resultado = new Ejercicio02();
        //Compruebo si el primer número es mayor que 10.
        if (num1 > 10){
            resultado.multiplicar(num1, num2); //Si es mayor que 10 multiplicar los dos números
        } else {
            resultado.sumar(num1, num2); //En otro caso sumar los dos números.
        }
        // TODO code application logic here
    }
    
}
