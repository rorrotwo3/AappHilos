/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import static Ejercicio4.Ejercicio5.factorial;

/**
 *
 * @author axell
 */
public class factorial {
     public static double fact(int n){
        double num = 1;
        for(int i=1; i<=n; i++){
            num = num*i;
            System.out.println("El factorial de :"+ num+"es: "+ num);
        }
    }
    public static void main(String[] args) {
        fact(4);
    }
    
    public static void facto (int n)
    {int temp=1;
        for(int i=n;i>=1;i--)
        {
            temp= temp*i;
        }
            System.out.println("El factorial de " + n+ "es "+ temp);
    }
    public static void main(String[] args) {
        facto(5);
    }
}
