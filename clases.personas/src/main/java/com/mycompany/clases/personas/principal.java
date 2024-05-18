/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clases.personas;

/**
 *
 * @author axell
 */
public class principal {
    
    
    public static void main(String[] args) {
        ClasesPersonas hugo=new ClasesPersonas();
        ClasesPersonas maria=new ClasesPersonas();
        hugo.curp="HSED34545";
        hugo.nombre="Hugo Alberto Terrones";
        hugo.edad=30;
        hugo.estatura=1.76F;
        hugo.nacionalidad="Hondureña";
        hugo.genero="Maculino";
        hugo.mostrar();
          maria.curp="MAER56666";
          hugo.nombre="Maria Jimenex Soto";
        maria.edad=20;
        maria.estatura=1.60F;
        maria.nacionalidad="Mexicana";
        maria.genero="Femenino";
        maria.mostrar();
    }
}



