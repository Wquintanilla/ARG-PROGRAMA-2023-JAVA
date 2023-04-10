/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Scanner;
/**
 *Escribir un programa que pida dos números enteros por teclado
 * y calcule la suma de los dos. 
 * El programa deberá después 
 * mostrar el resultado de la suma
 * @author wquin
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int num1,num2;
        
        System.out.print("Ingrese el PRIMER NUMERO ENTERO: ");
        num1 = leer.nextInt();
        
        System.out.print("Ingrese el SEGUNDO NUMERO ENTERO: ");
        num2 = leer.nextInt();
        
        System.out.println("La SUMA de " + num1 + " y de " + num2 + " es: " + (num1+num2));
    }
    
}
