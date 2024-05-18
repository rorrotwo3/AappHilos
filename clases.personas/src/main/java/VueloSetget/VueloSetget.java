/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VueloSetget;

/**
 *
 * @author axell
 */
public class VueloSetget {
    
    int no_vuelo;
    int cant_pasajeros;
    String origen, destino="";
    String aerolinea;
   
    public void setNo_vuelo (int no_vuelo){
            this.no_vuelo = no_vuelo;
    }
    public int getNo_vuelo()
    {return no_vuelo;
    }
    public void setCant_pasajeros(int cant_pasajeros){
        this.cant_pasajeros = cant_pasajeros;
    }
    public int getCant_pasajeros(){
        return cant_pasajeros;
    }
    public void setOrigen(String origen){
        this.origen = origen;
    }
    public String getOrigen(){
        return origen;
    }
    public void setDestino(String destino){
        this.destino = destino;
    }
    public String getDestino(){
        return destino;
    }
    public void setAerolinea(String aerolinea){
        this.aerolinea = aerolinea;
    }
    public String getAerolinea(){
        return aerolinea;
    }
    
    public void imprimir(){
        System.out.println("No_vuelo"+getNo_vuelo());
        System.out.println("Cant_pasajeros"+getCant_pasajeros());
        System.out.println("Origen"+getOrigen());
        System.out.println("Destino"+getDestino());
        System.out.println("Aerolinea"+getAerolinea());
    }
    
    public static void main(String[] args){
     VueloSetget vuelo1 = new VueloSetget();
     VueloSetget vuelo2 = new VueloSetget();
    vuelo1.setNo_vuelo(1);
    vuelo1.setCant_pasajeros(250);
    vuelo1.setOrigen("Durango");
    vuelo1.setDestino("Mexico");
    vuelo1.setAerolinea("Aeromexico");
    vuelo2.setNo_vuelo(2);
    vuelo2.setCant_pasajeros(300);
    vuelo2.setOrigen("Mexico");
    vuelo2.setDestino("Cancun");
    vuelo2.setAerolinea("Volaris");
    vuelo2.imprimir();
    vuelo1.imprimir();
    }
}
