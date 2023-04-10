/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;
import java.util.Scanner;
/**
 *Dada una cantidad de grados centígrados 
 * se debe mostrar su equivalente en grados Fahrenheit.
 * La fórmula correspondiente es: 
 * F = 32 + (9 * C / 5).
 * @author wquin
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresador = new Scanner(System.in);
        Float temperatura;
        System.out.println("Ingrese los grados Centigrados");
        temperatura = ingresador.nextFloat();
        System.out.println(temperatura + " grados Centigrados son " + (32 + (9 * temperatura / 5))+ " grados Fahrenheit");
    }
    
}
