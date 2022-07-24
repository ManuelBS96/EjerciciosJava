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
public class Ejercicio1 { // A contar lápices
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int NN=0;
        int KK = 0;
        int []lista;
        int contador =0;
        
        System.out.print("Ingrese un numero NN y luego ingrese un digito KK: ");
        NN = entrada.nextInt();
        KK = entrada.nextInt();
        
        
        System.out.println("\nIngrese una cantidad de números igual a NN ");
        lista = new int[NN];
        
        for (int i = 0; i < NN; i++) {
            System.out.print("Número "+(i+1)+": ");
            lista[i]=entrada.nextInt();
        }
        System.out.println("Los numero ingresados son: ");
        for (int i = 0; i < NN; i++) {
            System.out.print(lista[i]+", ");
            
        }
        System.out.println("\n");
        //Contar cuantas veces aparece el digito KK
        for (int i = 0; i < NN; i++) {
            if(KK == lista[i]){
                contador++;
                
            }
        }
        System.out.println("\nKK aparece "+ contador +" veces");
    }
}
