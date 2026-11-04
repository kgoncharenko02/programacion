/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alumno
 */
public class Proyecto {

    static Scanner entrada = new Scanner(System.in);
    static Random aleatorio = new Random();
    
    // Aqui creo tres constantes que son el número minimo 1, el máximo 100 y el multiplo 3
    public static final int MINIMO = 1;
    public static final int MAXIMO = 100;
    public static final int MULTIPLO = 3;
    
    /**
     * Método que genera el ticket de envio
     */
    public static void enviar() {
        int numero = aleatorio.nextInt(MAXIMO) + MINIMO;

        System.out.println("Ticket de envío: E-" + numero);
    }
    
    /**
     * Método que genera el ticket de recogida
     */
    public static void recoger() {
        int numero = aleatorio.nextInt(MAXIMO) + MINIMO;

        System.out.println("Ticket de recogida: R-" + numero);
    }
    
    
    /**
     * Método que genera un lote de tickets
     */
    public static void generarLote() {

        int tipo;
        int cantidad;

        // Aqui creo el menu de generacion de lote 
        System.out.println("¿Qué tipo de tickets quieres generar?");
        System.out.println("1. Envío");
        System.out.println("2. Recogida");
        System.out.print("Elige una opción: ");

        // En el caso de introducir el numero mal sale error
        while (!entrada.hasNextInt()) {
            System.out.println("Error. Introduce un número.");
            entrada.next();
            System.out.print("Elige una opción: ");
        }

        tipo = entrada.nextInt();
        
        
        while (tipo != 1 && tipo != 2) {
            System.out.println("Opción incorrecta.");
            System.out.print("Elige 1 para envío o 2 para recogida: ");

            while (!entrada.hasNextInt()) {
                System.out.println("Error. Introduce un número.");
                entrada.next();
                System.out.print("Elige una opción: ");
            }

            tipo = entrada.nextInt();
        }

        System.out.print("Introduce la cantidad de tickets: ");

        while (true) {

            // Sale error al introducir algo que no sea numero
            while (!entrada.hasNextInt()) {
                System.out.println("Error. Introduce un número.");
                entrada.next();
                System.out.print("Introduce la cantidad de tickets: ");
            }

            cantidad = entrada.nextInt();

            // Compruebo si el número introducido es multiplo de 3
            if (cantidad > 0 && cantidad % MULTIPLO == 0) {
                break;
            } else {
                System.out.println("Error. La cantidad debe ser un multiplo de 3.");
                System.out.print("Introduce otra cantidad: ");
            }
        }

        // Genero los tickets
        for (int i = 1; i <= cantidad; i++) {

            int numero = aleatorio.nextInt(MAXIMO) + MINIMO;

            if (tipo == 1) {
                System.out.println("E-" + numero);
            } else {
                System.out.println("R-" + numero);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion;
        //Creo el menu con opciones
        do {
            System.out.println("OFICINA DE CORREOS");
            System.out.println("1. Enviar");
            System.out.println("2. Recoger");
            System.out.println("3. Generar lote de tickets");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            while (!entrada.hasNextInt()) {
                System.out.println("Error. Introduce un número.");
                entrada.next();
                System.out.print("Elige una opción: ");
            }

            opcion = entrada.nextInt();

            // Aqui pongo que 
            switch (opcion) {
                case 1: // En caso de pulsar 1 se realiza el metodo enviar
                    enviar();
                    break;
                case 2: // En el caso de pulsar 2 se realiza el metodo recoger
                    recoger();
                    break;
                case 3: // En el caso de pulsar 3 se realiza el metodo generarLote
                    generarLote();
                    break;
                case 4: // En el caso de pulsar 4 se termina el programa
                    System.out.println("Gracias. Hasta luego!");
                    break;
                default: // En otros casos sale error 
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 4);
    
    // TODO code application logic here
    }
    
}
