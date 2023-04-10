/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios
y le pida al usuario un numero a buscar en el vector. 
El programa mostrará donde se encuentra el numero y si se encuentra repetido
 */
package ejercicio16;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author wquin
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Tamaño del vector");
        int tamanoVector=leer.nextInt();
        
        int[] vect = new int[tamanoVector];
        Random aleatorio = new Random();
        System.out.print("[ ");
        for (int i = 0; i < tamanoVector; i++) {
            vect[i]=aleatorio.nextInt(0,tamanoVector);
            System.out.print(vect[i]+" ");
        }
        System.out.print(" ]\n");
        
        int max=0;
        int con=0;
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea buscar entre 0 y "+tamanoVector);
        int valor = lee.nextInt();
        int indice;
        while (con<2 && max<=tamanoVector-1) {
            if (valor==vect[max]) {
                con=con+1;
                System.out.println(vect[max]+" y se encuentra en la posicion "+max);
            }
            max=1+max;
            //System.out.println(max +"  "+con);
         }
        
       
        if (con==0) {
            
            System.out.println(valor+" No se encuentra dentro del vector");
        } else {
            System.out.println("Se repite mas de una ves");
        }
        
    }
    
}
