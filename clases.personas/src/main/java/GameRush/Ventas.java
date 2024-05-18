/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameRush;

/**
 *
 * @author axell
 */
public class Ventas {
    
    int no_caja;
    String no_producto;
    float ingreso=0F;
    int fecha;
    int numero_de_barras;
    
    public void setNo_caja (int no_caja){
            this.no_caja = no_caja;
}
    public int getNo_caja()
    {return no_caja;
    }  
    public void setNo_producto (String no_producto){
        this.no_producto = no_producto;
    }
    public String getNo_producto(){
        return no_producto;
    }
    public void setIngreso (float ingreso){
        this.ingreso = ingreso;
    }
    public String getIngreso(){
        return ingreso;
    }
    public void setFecha (int fecha){
        this.fecha = fecha;
    }
    public String getFecha(){
        return fecha;
    }
    public void setNumero_de_barras (int numero_de_barras){
        this.numero_de_barras = numero_de_barras;
    }
    public String getNumero_de_barras(){
        return numero_de_barras;
    }

    public void mostrar(){
        System.out.println("Numero de caja: "+getNo_caja());
        System.out.println("Numero de producto: "+getNo_producto());
        System.out.println("Ingreso: "+getIngreso());
        System.out.println("Fecha: "+getFecha());
        System.out.println("Numero de barras: "+getNumero_de_barras());
    }
}
