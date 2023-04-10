
package ejercicio01poo;
import java.util.Scanner;

public class Libro {
    private String isbn;
    private String titulo;
    private String  autor;
    private int num_pag;
    
    public void mostrar(){
        System.out.println("El ISBN:" + isbn + "\nEl TITULO es: " + titulo );
        System.out.println("El AUTOR:" + autor + "\nEl Numero de paginas es: " + num_pag );
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNum_pag() {
        return num_pag;
    }

    public void setNum_pag(int num_pag) {
        if (num_pag>0) {
            this.num_pag = num_pag;
        } else {
            System.out.println("Ingreso un valor no valido");
        }
        
    }
//Constructor con parametros
    public Libro(String isbn, String titulo, String autor, int num_pag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.num_pag = num_pag;
    }
//constructor vacio  
    public Libro(){
        
    }
// Cargar los datos    
    public void cargar(){
        Scanner lee=new Scanner(System.in);
        System.out.println("Ingrese el ISBN");
        setIsbn(lee.nextLine());
        System.out.println("Ingrese el TITULO");
        setTitulo(lee.nextLine());
        System.out.println("Ingrese el AUTOR");
        setAutor(lee.nextLine());
        System.out.println("Ingrese el Numero de PAGINAS");
        setNum_pag(lee.nextInt());
        
    }
    
}
