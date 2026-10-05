/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Por favor, introduzca un número de segundos:");
        int dias,horas,minutos, segundos;
        int tiempo = entrada.nextInt();
        
        dias = tiempo/(24*60*60);
        horas = (tiempo%(24*60*60))/(60*60);
        minutos = (tiempo%(24*60*60)%(60*60))/60;
        segundos = tiempo % 60;
        
        System.out.println( tiempo + " segundos hacen un total de : " + dias + " días, " + horas + " horas, " + minutos + " minutos y\n" + segundos +
" segundos.");
        
        // TODO code application logic here
    }
    
}
