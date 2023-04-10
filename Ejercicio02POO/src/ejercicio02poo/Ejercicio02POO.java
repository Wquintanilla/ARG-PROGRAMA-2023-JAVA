
package ejercicio02poo;


public class Ejercicio02POO {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia c1 = new Circunferencia(0);
        c1.crearCircunferencia();
        System.out.println(c1.getRadio());
        System.out.println("el AREA: "+c1.area()+"\nEl PERIMETRO: "+c1.perimetro());
        
    }
    
}
