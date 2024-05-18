/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Laptop;

/**
 *
 * @author axell
 */
public class laptop {
    String fabricante,sistema,procesador;
    boolean entrada_tactil= true;
    int tipo_sistema,precio;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public boolean isEntrada_tactil() {
        return entrada_tactil;
    }

    public void setEntrada_tactil(boolean entrada_tactil) {
        this.entrada_tactil = entrada_tactil;
    }

    public int getTipo_sistema() {
        return tipo_sistema;
    }

    public void setTipo_sistema(int tipo_sistema) {
        this.tipo_sistema = tipo_sistema;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int venta(int sistema, boolean entrada_tactil)
    {
        int precio_venta = 0;
        
        if(sistema == 64 && entrada_tactil){
            precio_venta = 15000;
        } else if (sistema == 64 && !entrada_tactil){
            precio_venta = precio-3000;
        }
        else {
            if(fabricante.equalsIgnoreCase("Mac")){
                precio_venta = entrada_tactil ? 25000 : 20000;
            }
            else{
                precio_venta = 10000;
            }
            
            if(("Mac".equals(sistema)) && (entrada_tactil == false)){
                precio = 20000;
            }
            if(("Mac".equals(sistema)) && (entrada_tactil == true)){
                precio = 25000;
            }
            
        }
        
        datos();
        return precio;
    }
    
    public void datos()
    {
        
    }
    
    @Override
    public String toString() {
        return "laptop{" + "fabricante=" + fabricante + ", sistema=" + sistema + ", procesador=" + procesador + ", entrada_tactil=" + entrada_tactil + ", tipo_sistema=" + tipo_sistema + ", precio=" + precio + '}';
    }
    
    public laptop(String fabricante, String sistema, String procesador, boolean entarda_tactil, int tipo_sistema, int precio) {
        this.fabricante = fabricante;
        this.sistema = sistema;
        this.procesador = procesador;
        this.tipo_sistema = tipo_sistema;
        this.precio = precio;    
    }
    public static void main(String[] args) {
        laptop lap1 = new laptop("Microsoft", "Windows", "Core i3", true, 64, 30000);
        laptop lap2 = new laptop("Mac", "Msc", "Core i9", false, 32, 40000);
        laptop lap3 = new laptop("Mac", "Mac", "ios 9", true, 64, 30000);
        laptop lap4 = new laptop("Nvidia", "Windows", "Core i8", false, 32,  30000);
        
        System.out.println(lap1);
        lap1.venta(64, true);
        
        System.out.println(lap2);
        lap2.venta(32, false);
        
        System.out.println(lap3);
        lap3.venta(64, true);
        
        System.out.println(lap4);
        lap4.venta(32, false);
        
        }
    
}
