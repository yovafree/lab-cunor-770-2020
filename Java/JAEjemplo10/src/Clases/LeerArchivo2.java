/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.LeerArchivo.DirectorioActual;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author erwin
 */
public class LeerArchivo2 {
    static File archivo = null;
    static FileReader fr = null;
    static BufferedReader br = null;
    static String[][] mat;
    
    public static void main(String[] args){
      System.out.println(DirectorioActual());
      mat = new String[8][8];
      
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File(DirectorioActual()+"/archivo2.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         int y = 0;
         while((linea=br.readLine())!=null){
             String[] ln = linea.split(",");
             for(int x= 0;x<8;x++){
                 mat[x][y] = ln[x];
             }
             y++;
         }
         
         for(int j=0;j<8;j++){
             for(int k=0;k<8;k++){
                 System.out.print(mat[j][k] + " ");
             }
             System.out.print("\n");
         }
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
