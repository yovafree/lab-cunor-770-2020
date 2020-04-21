/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author erwin
 */
public class EscribirArchivo {
    public static void main(String[] args)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(DirectorioActual()+"/archivo.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++)
                pw.append("Linea " + i); //Reemplaza
            
            //pw.append(""); // Agrega

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
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
