/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author alumno
 */
public class Operaciones {
    public static void mayor(int num1, int num2, int num3){
        
        int mayor = num1;
        
        //Compruebo si el segundo número es mayor
        
        if (num2 > mayor){
            mayor = num2;
        }
        
        if (num3 > mayor){
            mayor = num3;
        }
        
        System.out.println("El número mayor es " + mayor);
    }
}
