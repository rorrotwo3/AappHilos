/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author axell
 */
public class Vehiculo {
    String marca;
    String modelo;
    int numero_de_chasis;
    int puertas;
    int ventanas;
    float peso_de_llantas;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumero_de_chasis() {
        return numero_de_chasis;
    }

    public void setNumero_de_chasis(int numero_de_chasis) {
        this.numero_de_chasis = numero_de_chasis;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public float getPeso_de_llantas() {
        return peso_de_llantas;
    }

    public void setPeso_de_llantas(float peso_de_llantas) {
        this.peso_de_llantas = peso_de_llantas;
    }

    public static void main(String[] args) {
        Vehiculo carro1 = new Vehiculo("Honda", "Acord", 176428, 4, 4, 128);
        carro1.setMarca("Honda");
        carro1.setModelo("Acord");
        carro1.setNumero_de_chasis(176428);
        carro1.setPuertas(4);
        carro1.setVentanas(4);
        carro1.setPeso_de_llantas(128);
        
        
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", numero_de_chasis=" + numero_de_chasis + ", puertas=" + puertas + ", ventanas=" + ventanas + ", peso_de_llantas=" + peso_de_llantas + '}';
    }
    

    public Vehiculo(String marca, String modelo, int numero_de_chasis, int puertas, int ventanas, float peso_de_llantas) {
        this.marca = marca;
        this.modelo = modelo;
        this.numero_de_chasis = numero_de_chasis;
        this.puertas = puertas;
        this.ventanas = ventanas;
        this.peso_de_llantas = peso_de_llantas;
    }
}
