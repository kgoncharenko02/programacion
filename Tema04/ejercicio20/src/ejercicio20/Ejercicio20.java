/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio20 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * Constantes con las respuestas correctas.
     */
    public static final String CAPITAL = "Madrid";
    public static final String DESCUBRIDOR = "Colón";

    /**
     * Método que realiza la primera pregunta.
     * @return 
     */
    public static boolean pregunta1() {
        System.out.print("¿Cuál es la capital de España?: ");
        String respuesta = entrada.nextLine();

        if (respuesta.equalsIgnoreCase(CAPITAL)) {
            System.out.println("Muy bien, respuesta correcta.");
            return true;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + CAPITAL);
            return false;
        }
    }

    /**
     * Método que realiza la segunda pregunta.
     * @return 
     */
    public static boolean pregunta2() {
        System.out.print("¿Quién descubrió América?: ");
        String respuesta = entrada.nextLine();

        if (respuesta.equalsIgnoreCase(DESCUBRIDOR)) {
            System.out.println("Muy bien, respuesta correcta.");
            return true;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + DESCUBRIDOR);
            return false;
        }
    }

    /**
     * Método que calcula y muestra la nota.
     * @param aciertos 
     */
    public static void mostrarNota(int aciertos) {
        int nota = aciertos * 5;
        System.out.println("NOTA DEL EXAMEN: " + nota);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         System.out.println("EXAMEN DE CULTURA GENERAL");

        int aciertos = 0;

        // Realizo las dos preguntas y cuento los aciertos.
        if (pregunta1()) {
            aciertos++;
        }

        if (pregunta2()) {
            aciertos++;
        }

        // Muestro la nota final.
        mostrarNota(aciertos);
        
        // TODO code application logic here
    }
    
}
