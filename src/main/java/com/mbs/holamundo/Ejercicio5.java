/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbs.holamundo;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Manuel
 */
public class Ejercicio5 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);        
      int EE;
      char id;
      String nombre;
      int valor;
      ArrayList<Lista> lista = new ArrayList<>();
      
        System.out.print("Ingrese EE:");
        EE = entrada.nextInt();
        
        System.out.println("");
        
        
        for (int i = 0; i < EE; i++) {
            
             id = entrada.next().charAt(0);
             nombre = entrada.next();
             valor = entrada.nextInt();
             lista.add(new Lista(id, nombre, valor));
             
            
         }
        System.out.println("");
        for (Lista l : lista){
            System.out.println(l.id +" "+ l.nombre +" "+ l.valor);
        }
        
    
    }
    
}

class Lista{
    
    public char id;
    public String nombre;
    public int valor;

    public Lista(char id, String nombre, int valor) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
    }
    public int getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    } 
    public int getValor(){
        return this.valor;
    }
    
}