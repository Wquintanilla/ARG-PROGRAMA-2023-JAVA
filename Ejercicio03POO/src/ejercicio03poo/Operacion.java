/*
 Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. 

 */
package ejercicio03poo;
import java.util.Scanner;
/**
 *
 * @author wquin
 */
public class Operacion {
    private float numero1;
    private float numero2;
    public Operacion(float num1,float num2){
        this.numero1=num1;
        this.numero1=num2;
    }
    public Operacion(){
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }
    public void crearOperacion(){
        Scanner ll=new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        setNumero1(ll.nextInt());
        System.out.println("Ingrese el segundo numero");
        setNumero2(ll.nextInt());
    }
    public float sumar(float n1,float n2){
        return n1+n2;
    }
    public float restar(float n1,float n2){
        return n1-n2;
    }
    public float multiplicar(float n1,float n2){
        float multi;
        if (n1==0 || n2==0) {
            System.out.println("TENES UN ERROR, VALOR INGRESADO 0");
            multi=0;
        } else {
            multi=n1*n2;
        }
        return multi;
    }
    public float dividir(float n1,float n2){
        float multi;
        if (n2==0) {
            System.out.println("TENES UN ERROR, VALOR INGRESADO 0");
            System.out.println("LA DIVISION POR CERO NO ESTA DEFINIDA");
            multi=0;
        } else {
            multi=n1/n2;
        }
        return multi;
    }
    
}
