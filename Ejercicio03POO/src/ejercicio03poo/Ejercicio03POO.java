
package ejercicio03poo;

/**
 *
 * @author wquin
 */
public class Ejercicio03POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Operacion nume=new Operacion();
    nume.crearOperacion();
    System.out.println(nume.sumar(nume.getNumero1(),nume.getNumero2()));
    System.out.println(nume.restar(nume.getNumero1(),nume.getNumero2()));
        
        // TODO code application logic here
    }
    
    
}
