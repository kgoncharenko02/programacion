/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio34;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        // Pido los datos de salida.
        System.out.print("Introduzca el día de salida: ");
        int diaSalida = entrada.nextInt();

        System.out.print("Introduzca la hora de salida: ");
        int horaSalida = entrada.nextInt();

        System.out.print("Introduzca el minuto de salida: ");
        int minutoSalida = entrada.nextInt();

        // Pido los datos de llegada.
        System.out.print("Introduzca el día de llegada: ");
        int diaLlegada = entrada.nextInt();

        System.out.print("Introduzca la hora de llegada: ");
        int horaLlegada = entrada.nextInt();

        System.out.print("Introduzca el minuto de llegada: ");
        int minutoLlegada = entrada.nextInt();

        // Convierto todo a minutos.
        int salida = diaSalida * 1440 + horaSalida * 60 + minutoSalida;
        int llegada = diaLlegada * 1440 + horaLlegada * 60 + minutoLlegada;

        // Comprobamos que la llegada no sea anterior a la salida.
        while (llegada < salida) {
            System.out.println("Error: La llegada no puede ser anterior a la salida.");

            System.out.print("Introduzca el día de llegada: ");
            diaLlegada = entrada.nextInt();

            System.out.print("Introduzca la hora de llegada: ");
            horaLlegada = entrada.nextInt();

            System.out.print("Introduzca el minuto de llegada: ");
            minutoLlegada = entrada.nextInt();

            llegada = diaLlegada * 1440 + horaLlegada * 60 + minutoLlegada;
        }

        // Calculo la duracion del viaje.
        int duracion = llegada - salida;
        int horas = duracion / 60;
        int minutos = duracion % 60;

        // El resultado.
        System.out.println("El tren tarda " + horas + " horas y " + minutos + " minutos.");
        // TODO code application logic here
    }
    
}
