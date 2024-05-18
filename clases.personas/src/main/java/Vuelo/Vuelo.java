/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vuelo;

/**
 *
 * @author axell
 */
public class Vuelo {
    int no_vuelo;
    int cant_pasajeros;
    String origen,destino;
    String aerolinea;
    
public void Despegue(){
    System.out.println("El vuelo "+origen+" con destino a "+destino);
    System.out.println("+Despegara a las 7am");
}    
    public static void main(String[] args) {
        //para declarar un objeto se pone clase objeto=new clase()
        Vuelo vuelo1 = new Vuelo();
        vuelo1.no_vuelo=1;
        vuelo1.cant_pasajeros=250;
        vuelo1.aerolinea="Aeromexico";
        vuelo1.origen="Durango";
        vuelo1.destino="Mexico";
        //vuelo1.despegar();
        System.out.print(vuelo1);
        
        Vuelo vuelo2 = new Vuelo();
        vuelo2.no_vuelo=2;
        vuelo2.cant_pasajeros=300;
        vuelo2.aerolinea="Volaris";
        vuelo2.origen="Mexico";
        vuelo2.destino="Cancun";
        
        System.out.println("no_vuelo"+vuelo1.no_vuelo);
        System.out.println("cant_pasajeros"+vuelo1.cant_pasajeros);
        System.out.println("aerolinea"+vuelo1.aerolinea);
        System.out.println("origen"+vuelo1.origen);
        System.out.println("destino"+vuelo1.destino);
        vuelo1.despegue();
        
        System.out.println("no_vuelo"+vuelo2.no_vuelo);
        System.out.println("cant_pasajeros"+vuelo2.cant_pasajeros);
        System.out.println("aerolinea"+vuelo2.aerolinea);
        System.out.println("origen"+vuelo2.origen);
        System.out.println("destino:"+vuelo2.destino);
        vuelo2.despegue();  
    }

    @Override
    public String toString() {
        return "Vuelo{" + "no_vuelo=" + no_vuelo + ", cant_pasajeros=" + cant_pasajeros +
                ", origen=" + origen + ", destino=" + destino + ", aerolinea=" + aerolinea + '}';
    }
    
}
