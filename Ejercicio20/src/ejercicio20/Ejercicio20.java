/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado 
y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, 
es decir, están entre el 1 y el 9.
 */
package ejercicio20;
import java.util.Scanner;
//import java.util.Random;
/**
 *
 * @author wquin
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         TODO code application logic here
        //int matriz[][]=  
        int tamano=3;
        int matriz[][]=new int[tamano][tamano];
        completarPorTeclado(matriz);
        //int matriz[][]={{1,1,2},{1,1,1},{1,1,1}};
        
        if (esMagica(matriz)) {
            System.out.println("La matriz ES MAGICA");
        } else {
            System.out.println("La matriz NO ES MAGICA");
        }
        
    }
    public static void completarPorTeclado (int mat[][]){
        Scanner leer = new Scanner(System.in);
        int valor;
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.println("Ingrese el valor entre [1 y 9] fila "+(i+1)+" y columna "+(j+1));
                valor = leer.nextInt();
                while (valor<1 || valor>9) {                    
                    System.out.println("Ingreso un valor erroneo, favor de ingresar un valor entre 1 y 9");
                    System.out.println("el valor correspondera fila "+(i+1)+" y columna "+(j+1));
                    valor = leer.nextInt();
                }
                mat[i][j]=valor;//FALTAVA ESTA LINEA QUE GRABABA SOBRE LA MATRIZ
            }
        }
    }
    public static Boolean esMagica(int mat[][]){
        mostarMatriz(mat);
        int comparadorp=0;//comparador de ladiagonal principal
        int comparadorcp=0;
        Boolean magica=Boolean.TRUE;
        //obtengo la suma de lago dianal principal
        for (int i = 0; i < mat.length; i++) {
            comparadorp=comparadorp+mat[i][i];
            comparadorcp=comparadorcp+mat[i][(mat.length-1)-i];
            }
        //System.out.println(comparadorp+"  "+comparadorcp);
        if (comparadorp!=comparadorcp) {
            magica=Boolean.FALSE;
        } else {
            //compruebo las filas y Columnas
             
             for (int i = 0; i < mat.length; i++) {
                  int sumaf=0;
                    int sumac=0;    
                for (int j = 0; j < mat.length; j++) {
                    sumaf=sumaf+mat[i][j];
                    sumac=sumac+mat[j][i];
                    
                 }
                
                 //System.out.println(sumaf + " " );
                 //System.out.println(sumac);
                 if (!(sumaf==comparadorp && sumac==comparadorp)) {
                     magica=Boolean.FALSE;
                     break;
                 } 
                   
            }
        }
        
        //compruebo las columnas
        
        return magica;
        
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

}
