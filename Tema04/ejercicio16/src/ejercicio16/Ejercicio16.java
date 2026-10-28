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
     * Método que calcula la raíz cuadrada de 64.
     */
    public static void raizCuadrada() {
        System.out.println("Raíz cuadrada de 64: " + Math.sqrt(64));
    }

    /**
     * Método que calcula 8 elevado al cubo.
     */
    public static void potencia() {
        System.out.println("8 elevado al cubo: " + Math.pow(8, 3));
    }

    /**
     * Método que calcula la exponencial de 2.
     */
    public static void exponencial() {
        System.out.println("Exponencial de 2: " + Math.exp(2));
    }

    /**
     * Método que calcula el logaritmo de 2,71828.
     */
    public static void logaritmo() {
        System.out.println("Logaritmo de 2,71828: " + Math.log(2.71828));
    }

    /**
     * Método que calcula el menor valor entre 2 y 3.
     */
    public static void menorValor() {
        System.out.println("Menor valor entre 2 y 3: " + Math.min(2, 3));
    }

    /**
     * Método que calcula el valor absoluto de -4,5.
     */
    public static void valorAbsoluto() {
        System.out.println("Valor absoluto de -4,5: " + Math.abs(-4.5));
    }

    /**
     * Método que redondea -4,5 utilizando ROUND.
     */
    public static void redondeo() {
        System.out.println("Redondeo de -4,5: " + Math.round(-4.5));
    }

    /**
     * Método que calcula el seno de 45 grados.
     */
    public static void seno() {
        System.out.println("Seno de 45 grados: " + Math.sin(Math.toRadians(45)));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        raizCuadrada();
        potencia();
        exponencial();
        logaritmo();
        menorValor();
        valorAbsoluto();
        redondeo();
        seno();
        
        // TODO code application logic here
    }
    
}
