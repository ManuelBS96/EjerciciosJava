/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbs.holamundo;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Ejercicio3 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         int anio;
         
         while(true){
            
         System.out.println("Calcular si un año es bisiesto\n");
         System.out.println("Ingrese al año: ");
         anio = entrada.nextInt();
          
         if(anio >1600 && anio < 3000){ // Verifica que el año sea > 1600 y < 3000
         if ((anio % 4 == 0 || ((anio%100 != 0) && (anio % 400  == 0)))) { //Verifica que sea bisiesto
             System.out.println("\nOutput: S");
            
        }else{
             System.out.println("\nOutput: N");
         }
         break;
         }else{
             System.out.println("El año debe ser mayor a 1600 y menor a 3000, intente otra vez");
         }
         }
    }
}
