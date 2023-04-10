/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;
/**
 *Realizar un programa que pida dos números enteros positivos
 * por teclado y muestre por pantalla el siguiente menú:
 *MENU
 *1. Sumar
 *2. Restar
 *3. Multiplicar
 *4. Dividir
 *5. Salir
 *Elija opción:
 * El usuario deberá elegir una opción y el programa 
 * deberá mostrar el resultado por pantalla y luego volver al menú. 
 * El programa deberá ejecutarse hasta que se elija la opción 5.
 * Tener en cuenta que, si el usuario selecciona la opción 5, 
 * en vez de salir del programa directamente, 
 * se debe mostrar el siguiente mensaje de confirmación: 
 * ¿Está seguro que desea salir del programa (S/N)? 
 * Si el usuario selecciona el carácter ‘S’ se sale del programa,
 * caso contrario se vuelve a mostrar el menú.
 * @author wquin
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int num1,num2;
        System.out.print("Ingrese el PRIMER NUMERO ENTERO POSITIVO: ");
        num1 = lector.nextInt();
        System.out.print("Ingrese el SEGUNDO NUMERO ENTERO POSITIVO: ");
        num2 = lector.nextInt();
        menu(num1,num2);
        
        
    }
    
    public static int sumar (int n1, int n2)  {
        
    return (n1 + n2);
    }
    
    public static int restar (int n1, int n2)  {
        
    return (n1 - n2);
    }
    
    public static int multiplicar (int n1, int n2)  {
        
    return (n1 * n2);
    }
    
    public static int dividir (int n1, int n2)  {
        
    return (n1 / n2);
    }
    
    public static void menu (int n,int m) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        Boolean me=Boolean.TRUE;
        while (me) {     
            
            System.out.println("MENU");
            System.out.println("""
                               1. Sumar
                               2. Restar
                               3. Multiplicar
                               4. Dividir
                               5. Salir""");
            System.out.print("Elija OPCION: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("La opción es 1. Sumar: "+ sumar(n,m));
                case 2 -> System.out.println("La opción es 2. Restar: "+ restar(n,m));
                case 3 -> System.out.println("La opción es 3. Multiplicar: "+multiplicar(n,m));
                case 4 -> System.out.println("La opción es 4. Dividir: "+ dividir(n,m));
                case 5 -> {
                    String sal;
                    Scanner lee = new Scanner(System.in);
                    System.out.println("La opción es 5. Salir");
                    
                    System.out.println(" ¿Está seguro que desea salir del programa (S/N)?");
                    sal=lee.nextLine();
                    sal=sal.toLowerCase();
              
                    switch (sal) {
                        case "s" -> me=Boolean.FALSE;
                        case "n" -> System.out.println("VUELVE AL MENU PRINCIPAL");
                        default -> System.out.println("La opción no es válida");
                          
                    }
                
                  
                }

                    
                
            
            
        }
        
        
        
        
                
}
        
    }
}


