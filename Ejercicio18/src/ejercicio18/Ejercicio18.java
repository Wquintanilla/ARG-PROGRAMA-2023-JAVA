/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y 
se obtiene cambiando sus filas por columnas (o viceversa)

 * @author wquin
 */
package ejercicio18;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        
        int tamano=4;
        int[][] matriz = new int[tamano][tamano];
        rellenarMatriz(matriz);
        mostarMatriz(matriz);
        int matriztranspuesta[][] = new int[tamano][tamano];
        transpuestaMatriz(matriz, matriztranspuesta);
        mostarMatriz(matriztranspuesta);
    }
    public static void rellenarMatriz(int[][] mat){
        Random aleatorio = new Random();
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[1].length; j++) {
                mat[i][j]=aleatorio.nextInt(0, (mat[0].length*mat[1].length));
                
            }
        }
    }
    
    public static void mostarMatriz(int[][] mat){
        Random aleatorio = new Random();
        for (int i = 0; i < mat[0].length; i++) {
            System.out.println("");
            for (int j = 0; j < mat[1].length; j++) {
                System.out.print(mat[i][j]+" ");
                
                
            }
        }
        System.out.println("");
    }
    
    public static void transpuestaMatriz(int[][] mat,int[][] matt){
        
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[1].length; j++) {
                matt[i][j]=mat[j][i];
                
            }
        }
    }
    
}
