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
        Scanner entrada = new Scanner (System.in);
        
        // Pido la fecha actual
        System.out.print("Introduce el año actual: ");
        int annoActual = entrada.nextInt();
        
        System.out.print("Introduce el mes actual: ");
        int mesActual = entrada.nextInt();
        
        System.out.print("Introduce el día actual: ");
        int diaActual = entrada.nextInt();
        
        System.out.print("Introduce el año de nacimiento: ");
        int annoNac = entrada.nextInt();
        
        System.out.print("Introduce el mes de nacimiento: ");
        int mesNac = entrada.nextInt();
        
        System.out.print("Introduce el día de de nacimiento: ");
        int diaNac = entrada.nextInt();
        
        // Calculo la diferencia entre las fechas.
        int annos = annoActual - annoNac;
        int meses = mesActual - mesNac;
        int dias = diaActual - diaNac;
        
        // Ajusto los dias si son negativos.
        if (dias < 0) {
            dias += 30;
            meses--;
        }

        // Ajusto los meses si son negativos.
        if (meses < 0) {
            meses += 12;
            annos--;
        }

        // La edad calculada.
        System.out.println("Su edad exacta es de " + annos +
                " años, " + meses + " meses y " + dias + " dias.");
        // TODO code application logic here
    }
    
}
