/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class Main3 {
    
    static int cnt = -1;
    static int n = 100;
    static String[][] personas = new String[n][5];
    static Scanner leer;
    
    public static void main(String[] args) {
        inicializar();
        int op = 0;
        do{
            System.out.println("1) Agregar persona");
            System.out.println("2) Mostrar Personas");
            System.out.println("0) Salir");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    String nombre;
                    System.out.println("Ingrese el nombre de la persona: ");
                    nombre = leer.next();
                    agregar(nombre);
                    break;
                case 2:
                    mostrar();
                    break;
            }
        }while(op != 0);
    }
    
    public static void inicializar(){
        leer = new Scanner(System.in);
        
        agregar("David Leal");
        agregar("Danilo Ortega");
        agregar("Juan Pan");
        agregar("Manuel Saquil");
        agregar("Carlos Andrés");
        agregar("Manuel Gálvez");
    }
    
    public static void mostrar(){
        
        System.out.println("\n\n-------------------------");
        for(int x=0;x<=cnt;x++){
            System.out.println(personas[x][0] + " " + personas[x][1]);
        }
        System.out.println("-------------------------\n\n");
    }
    
    public static void agregar(String nombre){
        cnt++;
        personas[cnt][0] = "" + (cnt+1);
        personas[cnt][1] = nombre;
    }
    
}
