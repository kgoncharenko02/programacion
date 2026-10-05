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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Por favor, indique una cantidad de dinero: ");
        int cantidadOriginal = entrada.nextInt();

        int restante = cantidadOriginal;

        int billetes50 = restante / 50;
        restante = restante % 50;

        int billetes20 = restante / 20;
        restante = restante % 20;

        int billetes10 = restante / 10;
        restante = restante % 10;

        int billetes5 = restante / 5;
        restante = restante % 5;

        int monedas2 = restante / 2;
        restante = restante % 2;

        int monedas1 = restante;

        System.out.println(cantidadOriginal + " Euros se descomponen en:");

        
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
        // TODO code application logic here
    }
    
}
