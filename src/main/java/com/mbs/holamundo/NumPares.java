/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbs.holamundo;

/**
 *
 * @author Manuel
 */
public class NumPares {
    public static void main(String[] args) {
        int []vector = {1,2,3,4,5};
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        
        int temp2 [] = new int[vector.length];
        int x=0,y = vector.length - 1;
        int posn = vector.length - 1;
        int marcador = 0;
        
        for (int i = 0; i < vector.length; i++) {
            if(marcador==0){
                temp2[x] = vector[posn];
                x++;
                posn--;
                marcador=1;
                //continue;
            }
            else if(marcador==1){
                temp2[y] = vector[posn];
                y--;
                posn--;
                marcador =0;
            }
        }
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(temp2[i]+" ");
        }
        
    }
    
    
}