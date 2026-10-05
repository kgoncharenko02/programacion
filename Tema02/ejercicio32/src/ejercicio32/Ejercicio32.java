/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Por favor, indique una cantidad de dinero: ");
        int cantidadOriginal = teclado.nextInt();

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

        System.out.println(cantidadOriginal + " Euros se descomponen en " + 
                billetes50 + " billetes de 50, " + 
                billetes20 + " billetes de 20, " + 
                billetes10 + " billetes de 10, " + 
                billetes5 + " billetes de 5, " + 
                monedas2 + " monedas de 2 euros y " + 
                monedas1 + " monedas de 1 euro.");

        // TODO code application logic here
    }
    
}
