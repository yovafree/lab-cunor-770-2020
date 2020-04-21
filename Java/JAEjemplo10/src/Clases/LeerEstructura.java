/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Modelo.Jugador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author erwin
 */
public class LeerEstructura {
    static ArrayList<Jugador> lstJugadores;
    
    public static void main(String[] args){
        lstJugadores = new ArrayList<>();
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File(DirectorioActual()+"/archivo.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
             String[] ln = linea.split(",");
             
             Jugador nuevo = new Jugador();
             nuevo.setCodigo(Integer.parseInt(ln[0]));
             nuevo.setNombre(ln[1]);
             nuevo.setPunteo(Integer.parseInt(ln[2]));
             
             lstJugadores.add(nuevo);
         }
         
         
         lstJugadores.forEach((item) -> {
             System.out.println(item.getCodigo() + " " + item.getNombre() + " " + item.getPunteo());
            });
         
         Jugador nuevo1 = new Jugador();
         nuevo1.setCodigo(5);
         nuevo1.setNombre("Nuevo jugador");
         nuevo1.setPunteo(8000);
         
         lstJugadores.add(nuevo1);
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
   }
    
    
    
    public static String DirectorioActual(){
        String directorio = System.getProperty("java.class.path");
        File dir = new File(directorio);
        String directorioPadre = dir.getParent();
        return directorioPadre;
    }
}
