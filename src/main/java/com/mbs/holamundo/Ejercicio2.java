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
public class Ejercicio2 { //Lectura y escritura
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int minutos=-1;
        int segundos=-1;
        boolean flag= true;
        
        while(flag){
        System.out.println("Ingrese los minutos, este valor debe estar entre 0 y 100: ");
        minutos = entrada.nextInt();
            if (minutos < 0 || minutos > 100 ) { // Verifica que el valor este entre 0 y 100
                System.out.println("Ingrese un valor entre 0 y 100");
            }else{
                flag = false;
                
            }
        }
        segundos = minutos * 60;
        System.out.println(minutos+" minutos equivale a " + segundos +" segundos");
        
    }
    
}
