/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import com.sun.source.tree.ContinueTree;
import java.util.Scanner;

/**
 *
 * @author wquin
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.print("INGRESE EL LADO DEL CUADRADO: ");
        num = leer.nextInt();
        rectangulo(num);
        
    }
    
    public static void rectangulo(int numero) {
        if (numero>1) {
            for (int i = 0; i < numero; i++) {
                System.out.print("*");
            }
            System.out.println("");
            for (int i = 1; i < numero-1; i++) {
                System.out.print("*");
                for (int j = 1; j < numero-1; j++) {
                    System.out.print(" ");
                }
                 System.out.print("*");
                System.out.println("");
                
            }
            
            for (int i = 0; i < numero; i++) {
                System.out.print("*");
            }
            System.out.println("");
          
           
            
        } else { 
            System.out.println("*");
            
        }
             
    }
    
}
