/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;
import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero por teclado
 * y muestre por pantalla 
 * el doble
 * , el triple 
 * y la raíz cuadrada de ese número. 
 * Nota: investigar la función Math.sqrt().
 * @author wquin
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.print("Ingrese el NUMERO ENTERO: ");
        num = leer.nextInt();
        System.out.println("EL DOBLE DE " + num + " es: " + (num*2));
        System.out.println("El TRIPLE DE " + num + " es: " + (num*3));
        System.out.println("La RAIZ CUADRADA DE " + num + " es: " + (Math.sqrt(num)));
    }
    
}
