/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04poo;
import java.util.Scanner;
/**
 *
 * @author wquin
 */
public class Rectangulo {
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo() {
        
    }
    
    public void crearRectangulo(){
        Scanner ll = new Scanner(System.in);
        System.out.println("Ingrese El valor de la BASE");
        setBase(ll.nextFloat());
        System.out.println("Ingrese El valor de la ALTURA");
        setAltura(ll.nextFloat());
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float areaRectangulo(){
        return getAltura()*getBase();
    }
    
      public float perimetroRectangulo(){
        return (2*getBase())+(2*getAltura());
    }
    public void dibujar(){
        
        int b=(int) Math.round(getBase());
        int a=(int) Math.round(getAltura());
        if (b==0) {
            b=1;
        }
        for (int i = 0; i < b; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < a-2; i++) {
            System.out.print("*");
            for (int j = 0; j < b-2; j++) {
                System.out.print(i);
            }
            System.out.println("*");
        }
        if (a>1) {
            for (int i = 0; i < b; i++) {
            System.out.print("*");
        }
        }
        
        System.out.println("");
    }
}
