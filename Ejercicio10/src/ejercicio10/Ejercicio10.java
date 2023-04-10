/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;
import java.util.Scanner;
/**
 *Escriba un programa en el cual se ingrese un valor límite positivo,
 * y a continuación solicite números al usuario 
 * hasta que la suma de los números introducidos supere el límite inicial
 * @author wquin
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        Float vallim;
        System.out.print("Ingrese el valor limite: ");
        vallim = lector.nextFloat();
        Float num;
        Float sumita = 0F;
        do {            
            System.out.print("Ingrese UN MUMERO: ");
            num = lector.nextFloat();
            sumita = sumita + num ;
        } while (vallim >= sumita);
        
    }
    
}
