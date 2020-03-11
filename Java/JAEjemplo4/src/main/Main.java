/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author erwin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fruta fruta1 = new Fruta();
        fruta1.setColor("Rojo");
        fruta1.setNombre("Manzana");
        fruta1.setSabor("Dulce");
        fruta1.setTamanio("10 cms");
        
        fruta1.info();
        
        
        Fruta fruta2 = new Fruta();
        fruta2.setColor("Amarillo");
        fruta2.setNombre("Banano");
        fruta2.setSabor("Dulce");
        fruta2.setTamanio("22 cms");
        
        fruta2.info();
    }
    
}
