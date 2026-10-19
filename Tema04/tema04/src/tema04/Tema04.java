/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema04;

import java.util.Scanner;
import operaciones.Operaciones;
/**
 *
 * @author alumno
 */
public class Tema04 {
    /**
     * Método que imprime por pantalla "hola, mundo"
     */
    public static void saludar(){
        System.out.println("Hola, mundo");
    }
  
    /**
     * Método que pide al usuario un número entero
     * @return el número que escribe el usuario
     */
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        return entrada.nextInt();
        
    }

    /**
     * Método que multiplica dos números recibidos por parámetro
     * @param num1
     * @param num2
     * @return el resultado
     */
    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llamo al método saludar ()
        saludar();
        
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        
        int resultado = multiplicar(num1, num2);
        
        System.out.println("El resultado es: " + resultado);
        System.out.println(multiplicar(num1, num2));
        System.out.println("Multiplicar pasando método por parámetro: ");
        System.out.println(multiplicar(pedirNumero(),pedirNumero()));
        Operaciones.sumar(num1, num2);
        // TODO code application logic here
    }
    
}
