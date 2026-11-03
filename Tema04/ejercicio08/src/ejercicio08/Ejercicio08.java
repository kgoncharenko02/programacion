/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio08 {

    /**
     * Método que calcula los billetes y monedas necesarios
     * @param dinero 
     */
    public static void calcularDinero(int dinero) {

        int billetes50 = dinero / 50;
        dinero = dinero % 50;

        int billetes20 = dinero / 20;
        dinero = dinero % 20;

        int billetes10 = dinero / 10;
        dinero = dinero % 10;

        int billetes5 = dinero / 5;
        dinero = dinero % 5;

        int monedas2 = dinero / 2;
        dinero = dinero % 2;

        int monedas1 = dinero;

        // Muestro solamente los billetes y monedas que se utilizan
        System.out.println("La cantidad se descompone en:");

        if (billetes50 > 0) {
            System.out.println("Billetes de 50: " + billetes50);
        }

        if (billetes20 > 0) {
            System.out.println("Billetes de 20: " + billetes20);
        }

        if (billetes10 > 0) {
            System.out.println("Billetes de 10: " + billetes10);
        }

        if (billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        }

        if (monedas2 > 0) {
            System.out.println("Monedas de 2 euros: " + monedas2);
        }

        if (monedas1 > 0) {
            System.out.println("Monedas de 1 euro: " + monedas1);
        }

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        // Pido la cantidad de dinero
        System.out.print("Por favor, indica una cantidad de dinero: ");
        int dinero = entrada.nextInt();

        // Llamo al método
        calcularDinero(dinero);
        
        // TODO code application logic here
    }
    
}
