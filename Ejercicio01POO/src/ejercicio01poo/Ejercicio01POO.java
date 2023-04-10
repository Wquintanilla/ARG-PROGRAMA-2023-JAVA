/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio01poo;

/**
 *
 * @author wquin
 */
public class Ejercicio01POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro l2=new Libro();
        l2.cargar();
        
        //Libro l1= new Libro("hjkjshsirugirhiuhiugf","la gesta del marrano","Marcos de AGUINIS",156 );
//        l1.setIsbn("hjkjshsirugirhiuhiugf");
//        l1.setTitulo("la gesta del marrano");
//        l1.setAutor("Marcos de AGUINIS");
//        l1.setNum_pag(1526);

        
        l2.mostrar();
    }
    
}
