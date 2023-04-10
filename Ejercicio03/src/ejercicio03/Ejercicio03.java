/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;
import java.util.Scanner;
/**
 *Escribir un programa que pida una frase y 
 * la muestre toda en mayúsculas 
 * y después toda en minúsculas. 
 * Nota: investigar la función toUpperCase() 
 * y toLowerCase() en Java.
 * @author wquin
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        String frase;
        System.out.println("Por favor escriba una frase");
        frase = lector.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
                
    }
    
}
