/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaejemplo6;

import clases.Persona;
import java.util.ArrayList;

/**
 *
 * @author erwin
 */
public class Main {
    static ArrayList<Persona> lstPersonas;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lstPersonas = new ArrayList<>();
        agregar("5465464", "Juan", "Pan", 22);
        agregar("46488254", "Diego", "Pan", 23);
        agregar("132412", "Emanuel", "Pan", 21);
        agregar("4432", "Luis", "Pan", 20);
        agregar("12334", "Carlos", "Pan", 24);
        agregar("554321", "Angel", "Pan", 25);
        
        for(Persona persona:lstPersonas){
            persona.getInfo();
        }
        
        //Permite obtener un objeto de la lista.
        Persona busq = lstPersonas.get(3);
        busq.getInfo();
    }
    
    public static void agregar(String cui, String nombres, String apellidos, int edad){
        Persona nuevo = new Persona(cui, nombres, apellidos);
        lstPersonas.add(nuevo);
    }
    
}
