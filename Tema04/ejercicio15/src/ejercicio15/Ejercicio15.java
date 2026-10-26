/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * Método que pide un número al usuario.
     * @param mensaje
     * @return 
     */
    public static double pedirNumero(String mensaje) {
        System.out.print(mensaje);
        return entrada.nextDouble();
    }

    /**
     * Método que muestra el menú.
     */
    public static void mostrarMenu() {
        System.out.println("\n MENÚ DE OPERACIONES");
        System.out.println("1. Sumar los números");
        System.out.println("2. Restar los números");
        System.out.println("3. Multiplicar los números");
        System.out.println("4. Dividir los números");
        System.out.println("5. Salir del programa");
        System.out.print("Introduzca una opción: ");
    }

    /**
     * Método que suma los dos números.
     * @param num1
     * @param num2 
     */
    public static void sumar(double num1, double num2) {
        System.out.println("El resultado de la suma es: " + (num1 + num2));
    }

    /**
     * Método que resta los dos números.
     * @param num1
     * @param num2 
     */
    public static void restar(double num1, double num2) {
        System.out.println("El resultado de la resta es: " + (num1 - num2));
    }

    /**
     * Método que multiplica los dos números.
     * @param num1
     * @param num2 
     */
    public static void multiplicar(double num1, double num2) {
        System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
    }

    /**
     * Método que divide los dos números.
     * @param num1
     * @param num2 
     */
    public static void dividir(double num1, double num2) {
        try {
            if (num2 == 0) {
                throw new ArithmeticException();
            }

            System.out.println("El resultado de la división es: " + (num1 / num2));

        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero.");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Pido los dos números al usuario.
        double num1 = pedirNumero("Introduzca el primer número: ");
        double num2 = pedirNumero("Introduzca el segundo número: ");

        int opcion;

        // Repito el menu hasta que el usuario elija salir.
        do {
            mostrarMenu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    sumar(num1, num2);
                    break;
                case 2:
                    restar(num1, num2);
                    break;
                case 3:
                    multiplicar(num1, num2);
                    break;
                case 4:
                    dividir(num1, num2);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Error: opción no válida.");
            }

        } while (opcion != 5);
        // TODO code application logic here
    }
    
}
