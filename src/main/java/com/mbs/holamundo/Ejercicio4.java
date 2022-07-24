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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);   
        int N;
        int matriz[][];
        
        System.out.println("Ingrese el tamaño N de la matriz, N debe ser mayor o igual a 1 y menor o igual a 100:  ");
        N = entrada.nextInt();
        matriz = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }
        int num = matriz[0][0]; //Tomamos el valor de 0,0 y lo compramos con el resto de la diagonal
        boolean esDiagonal = false; //Un bolean para saber si es TRUE = Diagonal o FALSE= No es diagonal
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i==j){ //condicion para tomar solo los valores de la diagonal
                    if(num == matriz[i][j]){ //comparamos los valores de la diagonal
                       esDiagonal = true; //si son iguales colocamos TRUE
                    }else{ // si no son iguales colocamos FALSE y terminamos el ciclo con break;
                        esDiagonal =false;
                        break;
                    }
                }
                
            }
            
        }
        
        if(esDiagonal){ //Revizamos si es diagonal
            System.out.println("SI");
        }else{
            System.out.println("N0");
        }
    }
    
}
