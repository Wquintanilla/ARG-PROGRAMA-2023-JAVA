/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package ejercicio21;

import java.util.Arrays;

/**
 *
 * @author wquin
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matrizM[][] = {{1,26,36,47,5,6,72,81,95,10},
                  {11,12,13,21,41,22,67,20,10,61},
                  {56,78,87,90,9,90,17,12,87,67},
                  {41,87,24,56,97,74,87,42,64,35},
                  {32,76,79,1,36,5,67,96,12,11},
                  {99,13,54,88,89,90,75,12,41,76},
                  {67,78,87,45,14,22,26,42,56,78},
                  {98,45,34,23,32,56,74,16,19,18},
                  {24,67,97,46,87,13,67,89,93,24},
                  {21,68,78,98,90,67,12,41,65,12}};
        int matrizP[][]={{36,5,67},
                {89,90,75},
                {14,22,26}};
        int pose[][]=matizPcontenidaenA(matrizM, matrizP);
        //System.out.println(pose[0][0]+" "+matrizM.length);
        if (pose[0][0]==matrizM.length+1) {
            System.out.println("La Matriz P NO ESTA CONTENIDA EN la Matriz A");
        } else {
            System.out.println("La Matriz P esta contenida en A \nEN la POSICION DE LA MATRIZ A");
            System.out.println("Fila: "+matizPcontenidaenA(matrizM, matrizP)[0][0]+" Columna: "+matizPcontenidaenA(matrizM, matrizP)[0][1]);
        }
    }
    public static int[][] matizPcontenidaenA (int MatA[][],int MatP[][]){
        
        int posicion[][]={{MatA.length+1,MatA.length+1}};
        
        for (int i = 0; i < MatA[0].length-MatP[0].length; i++) {
            for (int j = 0; j < MatA[0].length-MatP[0].length; j++) {
                int vector[][]={{MatA[i][j],MatA[i][j+1],MatA[i][j+2]},
                {MatA[i+1][j],MatA[i+1][j+1],MatA[i+1][j+2]},
                {MatA[i+2][j],MatA[i+2][j+1],MatA[i+2][j+2]}};
                if (Arrays.deepEquals(vector, MatP)) {
                    
                    posicion[0][0]=i;
                    posicion[0][1]=j;
                    break;
                }
                
            }
        }
        return posicion;
        
    }
    public static void mostarMatriz(int[][] mat){
        
        for (int i = 0; i < mat[0].length; i++) {
            System.out.println("");
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
        }
        System.out.println("");
    }
    
}
