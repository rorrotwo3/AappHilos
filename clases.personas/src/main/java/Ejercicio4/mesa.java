/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author axell
 */
public class mesa {
    String tipo,modelo;
    int num_patas;
    float precio;

    public mesa(String tipo, String modelo, int num_patas, float precio) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.num_patas = num_patas;
        this.precio = precio;
    }
    public mesa()
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
    
    
    public static void main(String[] args) {
        mesa escritorio = new mesa("Escritorio","moderno",2,400);
        mesa mostrador = new mesa("Mstrador","Antiguo",2,500);
        mesa comedor = new mesa("Comedor","Antiguo",4,1500);
        System.out.println(escritorio);
        escritorio.vender();
        System.out.println(mostrador);
        mostrador.vender();
        System.out.println(comedor);
        comedor.vender();
    }
    
}
