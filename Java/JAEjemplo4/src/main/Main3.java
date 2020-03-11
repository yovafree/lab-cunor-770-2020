/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class Main3 {
    static ArrayList<Fruta> frutas = new ArrayList<Fruta>();
    
    public static void main(String[] args) {
        nuevo("Manzana", "Rojo", "15 cms", "Dulce");
        nuevo("Banano", "Amarillo", "22 cms", "Dulce");
        nuevo("Papaya", "Amarillo", "30 cms", "Dulce");
        nuevo("Sandía", "Verde", "35 cms", "Dulce");
        nuevo("Kiwi", "Verde", "12 cms", "Dulce");
        
        agregar();
        
        
        for (int x=0;x<frutas.size();x++){
            frutas.get(x).info();
        }
        
        //For each        
        for(Fruta item : frutas){
            item.info();
        }
    }
    
    public static void agregar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la fruta");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese el color de la fruta");
        String color = sc.nextLine();
        
        System.out.println("Ingrese el tamaño de la fruta");
        String tamanio  = sc.nextLine();
        
        System.out.println("Ingrese el sabor de la fruta");
        String sabor = sc.nextLine();
        
        nuevo(nombre,color,tamanio,sabor);
    }
    
    public static void nuevo(String nombre, String color, String tamanio, String sabor){
        Fruta nuevo = new Fruta();
        nuevo.setNombre(nombre);
        nuevo.setColor(color);
        nuevo.setTamanio(tamanio);
        nuevo.setSabor(sabor);
        
        frutas.add(nuevo);
        
    }
}
