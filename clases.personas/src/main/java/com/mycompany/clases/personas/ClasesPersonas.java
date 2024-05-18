/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clases.personas;

/**
 *
 * @author axell
 */
public class ClasesPersonas{
    String curp;
    String nombre;
    int edad;
    float estatura=0;
    String nacionalidad;
    String genero;
    public void mostrar()
    {
        System.out.println("Curp de la persona"+curp);
        System.out.println("NOmbre"+nombre);
        System.out.println("edad"+edad);
        System.out.println("estatura"+estatura);
        System.out.println("Nacionalidad"+nacionalidad);
        System.out.println("  Genero " + genero);
    }        
}