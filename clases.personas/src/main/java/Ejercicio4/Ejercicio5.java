/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import static Ejercicio4.factorial.factorial;

/**
 *
 * @author axell
 */
public class Ejercicio5 {
   //determinar el factorial de un numero cualquiera y otro metodo
    //que genere una tabla de multiplicar de un numero, que utilice 
    //metodos estaticos y variables
    static  int factorial=4;
    static int tabla=5;
    
      
    public static void tabla()
    {
        int t=5 , r=0;
        for (int x=1; x<=10; x++)
        {r=t*x;
            System.out.println(t+"*"+x+"="+r);
        }
    }
    public static void main(String[] args) {
        tabla();
    }
    
    public static double factorial(int n){
        double num = 1;
        for(int i=2; i<=10; i++){
            num = num*i;
            System.out.println("El factorial de :"+ num+"es: "+ factorial(num*1));
        }
    }
    public static void main(String[] args) {
        factorial();
    }
}
 