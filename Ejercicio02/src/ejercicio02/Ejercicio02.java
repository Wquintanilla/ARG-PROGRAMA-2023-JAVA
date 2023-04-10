/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;
/**
 *Escribir un programa que pida tu nombre, 
 * lo guarde en una variable 
 * y lo muestre por pantalla.
 * @author wquin
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.print("Me podes decir tu NOMBRE: ");
        nombre = leer.nextLine();
        System.out.println("Tu NOMBRE ES ... " + nombre);
        
    }
    
}
