/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Random;
/**
 *
 * @author wquin
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println(codigoRS232());
        String mensaje=mensajeRS232();
        System.out.println(mensaje);
        System.out.println("Cantidad Mensajes " + (mensaje.length()/5));
     
        int contadorBuenos=0,contadorMalos=0;
        for (int i = 0; i < mensaje.length(); i+=5) {
            
            
            
            if ((mensaje.charAt(i)=='X') && (mensaje.charAt(i+4)=='O')  ) {
                contadorBuenos=contadorBuenos+1;
            } else {
                contadorMalos+=1;
            }
            
            
        }
        System.out.println("Mensajes CORRECTOS: "+contadorBuenos);
        System.out.println("Mensajes MALOS "+contadorMalos);
    }
    
    public static String codigoRS232() {
        String codigo,letras;
        codigo="";
        Random aleatorio = new Random();
        letras="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        letras=letras+"";
        int proba= letras.length();
        for (int i = 0; i < proba; i++) {
            letras=letras+"X";
            letras=letras+"O";
        }
        
        for (int i = 0; i < proba*2; i++) {
            letras=letras+"&";
        }
        
        for (int i = 0; i < 5 ; i++) {
            codigo=codigo + letras.charAt(aleatorio.nextInt(letras.length()));
                
        }
//        System.out.println(letras.length());
        return codigo;
        }
    
    public static String mensajeRS232() {
        String codig="",mensa="",fin="&&&&&";
        
        
//        for (int i = 0; i < 100; i++) {
//            codig=codigoRS232();
//            mensa=mensa+codig;
//            
//        }
        
        while (!(codig.equals(fin))) {     
            codig=codigoRS232();
            mensa=mensa+codig;
        }
        
        return mensa;
        }
    
        
}
