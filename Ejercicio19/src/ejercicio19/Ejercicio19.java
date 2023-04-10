/*
Realice un programa que compruebe si una matriz dada es anti simétrica. 
Se dice que una matriz A es anti simétrica 
cuando ésta es igual a su propia traspuesta, pero cambiada de signo. 
Es decir, A es anti simétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT 
y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicio19;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author wquin
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        
        int tamano=4;
        int matriz[][]= new int[tamano][tamano];
        //int matriz[][] = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        rellenarMatriz(matriz);
        
        mostarMatriz(matriz);
        int matriztranspuesta[][] = new int[matriz[0].length][matriz[0].length];
        transpuestaMatriz(matriz, matriztranspuesta);
        mostarMatriz(matriztranspuesta);
        if (verantisimetrica(matriz)) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz NO ES antisimetrica");
        }
        
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
    public static Boolean verantisimetrica (int mat[][]){
        Boolean bandera=Boolean.TRUE;
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[1].length; j++) {
                if (!(mat[i][j]==-(mat[j][i]))) {
                    bandera=Boolean.FALSE;
                    break;
                } 
                
             }
        }     
        
        return bandera;
        
    }
}
    

