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
        int dinero = 130;
        int billetesCincuenta = dinero / 50;
        int billetesDiez = (dinero % 50) / 10;
        System.out.println(dinero + " euros hacen un total de: " + billetesCincuenta + " billetes de 50 euros y " + billetesDiez + " billetes de\n" +
"10 euros.");
        // TODO code application logic here
    }
    
}
