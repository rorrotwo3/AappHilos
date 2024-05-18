/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author axell
 */
public class Ejercicio4 {
    static final int diasLaborales=5;
    static final int diasNolaborales=2;
    static final double imp=0.13;
    static void Ejercicio4(){
        System.out.println("Dias no laborales" + diasNolaborales);
        System.out.println("Dias laborales" + diasLaborales);
    }
    static double impuesto (double monto){
        return monto*imp;
    }
    public static void main(String[] args) {
        Ejercicio4();
        System.out.println("El impuesto de 1000" + impuesto(1000));
                }            
}
