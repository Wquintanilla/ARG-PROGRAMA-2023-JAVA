/*

Crea una aplicación que a través de una función nos 
convierta una cantidad de euros introducida por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
la cantidad de euros y la moneda a converir que será una cadena,
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejercicio14;
import java.util.Scanner;
import java.util.Formatter;
/**
 *
 * @author wquin
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero = 1234.56789;
        System.out.printf("El número formateado es: %.2f \n", numero);
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la CAntidad de euros a convertir");
        Double euro = leer.nextDouble();
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese la MONEDA a  convertir ");
        System.out.println("L Libras D Dolares Y Yenes"); 
        String moneda = lee.nextLine();
        
        
        
        moneda=moneda.toLowerCase();
        cambioDivisas (euro,moneda);
        
        // TODO code application logic here
    }
//[acceso][modificador][tipo] nombreFuncion([tipo] nombreArgumento, …….){
//
//Bloque de instrucciones
//
//return valor;
//}
    public static void cambioDivisas (Double euros,String moneda){
        System.out.println("El cambio de divisas es:");
        switch (moneda) {
            case "l":
                System.out.println(euros+" EUROS son "+(euros*0.86)+" libras");
                break;
            case "d":
                System.out.println(euros+" EUROS son "+(euros*1.28611)+" DOLARES");
                break;
            case "y":
                System.out.println(euros+" EUROS son "+(euros*129.852)+" YENES");
                break;
            
        }
                          
    }
}

