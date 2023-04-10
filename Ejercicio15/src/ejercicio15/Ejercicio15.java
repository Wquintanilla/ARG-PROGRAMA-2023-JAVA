/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros
y los muestre por pantalla en orden descendente.
 
 */
package ejercicio15;

/**
 *
 * @author wquin
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=vector.length-i;
            System.out.print(vector[i]+" ");
                    
        }
        
    }
    
}
