/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercico17;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author wquin
 */
public class Ejercico17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese el Tamaño del vector");
        int tamano = lee.nextInt();
        int[] vector = new int[tamano];
        int[] digito = new int[tamano];
        vectorAleatorio(vector);
        //mostrarVec(vector);
        contadorDigitos(vector, digito);
       
        //mostrarVec(digito);
        contabilizador(digito);
                
    }
    public static void vectorAleatorio (int[] vect) {
        Random ale = new Random();
        for (int i = 0; i < vect.length; i++) {
            vect[i]= ale.nextInt(0,99999);
        }
    }
    public static void contadorDigitos(int[] vector, int[] contador){
        int contar;
        
        for (int i = 0; i < vector.length; i++) {
            contar=0;
            
            while ((vector[i])>0) { 
                vector[i]=vector[i]/10;
                contar+=1;                
            }
            contador[i]=contar;
        }
    }
    
    public static void mostrarVec(int[] vector) {
        System.out.print("\n[ ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.print(" ]\n");
    }
    public static void contabilizador (int[] vector){
        int[] cantidad = new int[5];
        for (int i = 0; i < vector.length; i++) {
            switch (vector[i]) {
                case 1 -> cantidad[0]+=1;
                case 2 -> cantidad[1]+=1;
                case 3 -> cantidad[2]+=1;
                case 4 -> cantidad[3]+=1;
                case 5 -> cantidad[4]+=1;
                
               
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Cantidad de valores con "+(i+1)+" digitos es "+cantidad[i]);
        }
    }
}
