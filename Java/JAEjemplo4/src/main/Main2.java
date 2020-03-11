/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Uso de arreglos con clases
 * @author erwin
 */
public class Main2 {
    static Fruta[] frutas = new Fruta[10];
    static int cnt = 0;
    public static void main(String[] args) {
        nuevo("Manzana", "Rojo", "15 cms", "Dulce");
        nuevo("Banano", "Amarillo", "22 cms", "Dulce");
        nuevo("Papaya", "Amarillo", "30 cms", "Dulce");
        nuevo("Sandía", "Verde", "35 cms", "Dulce");
        nuevo("Kiwi", "Verde", "12 cms", "Dulce");
        
        for (int x = 0; x<cnt;x++){
            frutas[x].info();
        }
    }
    
    public static void nuevo(String nombre, String color, String tamanio, String sabor){
        frutas[cnt] = new Fruta();
        frutas[cnt].setNombre(nombre);
        frutas[cnt].setColor(color);
        frutas[cnt].setTamanio(tamanio);
        frutas[cnt].setSabor(sabor);
        cnt++;
    }
}
