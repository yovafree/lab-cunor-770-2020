/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaejemplo5;

import Clases.*;


/**
 *
 * @author erwin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fruta fruta1 = new Fruta();
        fruta1.setNombre("Manzana");
        fruta1.setColor("Rojo");
        fruta1.setSabor("Dulce");
        fruta1.setTamanio("10cm");
        fruta1.aroma = "";
        
        Sandia sandia1 = new Sandia();
        
        sandia1.setNombre("Sandia");
        sandia1.setNivel_madurez("Madura");
        
//        fruta1.cambiarNombre(0, "Angel Reyes");
        
//        for (int x=0; x<fruta1.nombres.length;x++){
//            System.out.println("Nombre " + x + ": " + fruta1.nombres[x]);
//        }
        
        fruta1.getInfo();
        sandia1.getInfo();
    }
    
}
