/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02poo;
import java.util.Scanner;
/**
 *
 * @author wquin
 */
public class Circunferencia {
    private float radio;

    public Circunferencia(int ra) {
        this.radio=ra;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    /**
     *
     */
    public void crearCircunferencia(){
        Scanner lee=new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia; ");
        setRadio(lee.nextFloat());
    }
    public float area(){
        return getRadio()*(float) Math.PI*getRadio();
    }
    public float perimetro(){
        return 2*(float) Math.PI*getRadio();
    }
}
