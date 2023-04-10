/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04poo;

/**
 *
 * @author wquin
 */
public class Ejercicio04POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo r1 = new Rectangulo(0.1f,1.2f);
        r1.dibujar();
        System.out.println("Area "+r1.areaRectangulo());
        System.out.println("Perimetro "+r1.perimetroRectangulo());
    }
    
}
