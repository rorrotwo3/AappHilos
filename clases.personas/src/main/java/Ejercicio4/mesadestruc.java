/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author axell
 */
public class mesadestruc {
    String tipo,modelo;
    int num_patas;
    float precio;

    public mesadestruc(String tipo, String modelo, int num_patas, float precio) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.num_patas = num_patas;
        this.precio = precio;
    }
    public mesadestruc()
    {
    }

    @Override
    public String toString() {
        return "mesa{" + "tipo=" + tipo + ", modelo=" + modelo + ", num_patas=" + num_patas + ", precio=" + precio + '}';
    }
    
    public void vender()
    {
        if(modelo.equals("Antiguo"))
        {
            precio=precio*.80f;
        }
        else
            System.out.println("No tiene descuento");
            System.out.println("El precio final es "+ precio);
    }
    
    @Override
    protected void finalize() //finalice es hecho por java, se recomienda para cuando se usa base de datos o con informacion muy importante
    {
        System.out.println("Permite ejecutar acciones antes de ser");
        System.out.println("totalmete eliminado el objeto");
    }
    
    public static void main(String[] args) {
        mesadestruc escritorio = new mesadestruc("Escritorio","moderno",2,400);
        mesadestruc mostrador = new mesadestruc("Mstrador","Antiguo",2,500);
        mesadestruc comedor = new mesadestruc("Comedor","Antiguo",4,1500);
        System.out.println(escritorio);
        escritorio.vender();
        escritorio=null; //Garbaje collector
        System.out.println(escritorio);
        mostrador=null;
        System.out.println(mostrador);
        mostrador.vender();
        System.out.println(comedor);
        comedor.vender();
    }
    
}
