/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;
import java.util.Scanner;
/**
 *Crear un programa que dado un numero determine si es par o impar
 * @author wquin
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        Float num;
        System.out.print("Ingrese un Numero: ");
        num = lector.nextFloat();
        if (num%2==0) {
            System.out.println("El numero es Par");
            
        }
        else {
            System.out.println("El numero es IMPAR");
        }
    }
    
}
