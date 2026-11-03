/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * Clase con las tres constantes
     */
    public class Constantes {

    public final static double VELOCIDADLUZ = 299792458;
    public final static double CONSTANTEUNIVERSALGRAVITACION = 6.67430E-11;
    public final static double CONSTANTEPLANCK = 6.62607015E-34;

    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Muestro los valores de las constantes 
        System.out.println("Velocidad de la luz: " + Constantes.VELOCIDADLUZ);
        System.out.println("Constante universal de gravitación: " + Constantes.CONSTANTEUNIVERSALGRAVITACION);
        System.out.println("Constante de Planck: " + Constantes.CONSTANTEPLANCK);
        
        // TODO code application logic here
    }
    
}
