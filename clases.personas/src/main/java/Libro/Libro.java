/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author axell
 */
public class Libro {
    
    int clavelibro;
    String nombre;
    String autores;
    String editorial;
    int paginas;
    
    public void setClavelibro (int clavelibro){
            this.clavelibro = clavelibro;
}
    public int getClavelibro()
    {return clavelibro;
    }  
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setAutores (String autores){
        this.autores = autores;
    }
    public String getAutores(){
        return autores;
    }
    public void setEditorial (String editorial){
        this.editorial = editorial;
    }
    public String getEditorial(){
        return editorial;
    }
    public void setPaginas (int paginas){
        this.paginas = paginas;
    }    
    public int getPaginas(){
        return paginas;
    }
    
    public void imprimir(){
        System.out.println("Clave libro: "+getClavelibro());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Autores: "+getAutores());
        System.out.println("Editorial: "+getEditorial());
        System.out.println("Paginas: "+getPaginas());
    }
    
    public static void main(String[] args){
     Libro libro1 = new Libro();
     Libro libro2 = new Libro();
     Libro libro3 = new Libro();
    libro1.setClavelibro(35678);
    libro1.setNombre("Principito");
    libro1.setAutores("Antoine de Saint-Exupéry");
    libro1.setEditorial("Patito");
    libro1.setPaginas(120);
    System.out.print(libro1);
    libro2.setClavelibro(72713);
    libro2.setNombre("Harry Poter y el pricionero de azkaban");
    libro2.setAutores(" J.K. Rowling");
    libro2.setEditorial("Patito");
    libro2.setPaginas(384);
    System.out.print(libro2);
    libro3.setClavelibro(13873);
    libro3.setNombre("El sabueso de los Baskerville");
    libro3.setAutores("Arthur Conan Doyle");
    libro3.setEditorial("Patito");
    libro3.setPaginas(352);
    System.out.print(libro3);
    libro3.imprimir();
    libro2.imprimir();
    libro1.imprimir();
    }

    @Override
    public String toString() {
        return "Libro{" + "clavelibro=" + clavelibro + 
                ", nombre=" + nombre + ", autores=" + autores + 
                ", editorial=" + editorial + ", paginas=" + paginas + '}';
    }

}
