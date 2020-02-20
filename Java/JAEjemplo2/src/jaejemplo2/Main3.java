/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaejemplo2;

/**
 *
 * @author erwin
 */
public class Main3 {
    //Uso del ciclo For o Para
    public static void main(String[] args) {
        
        for(int x=1;x<=10;x++){
            System.out.print(x + " ");
        }
        
        System.out.print("\n");
        for(int x=1;x<=10;x++){
            System.out.println("------------------------------");
            System.out.println("Tabla de Multiplicar del: " + x);
            System.out.println("------------------------------");
            for(int y=1;y<=10;y++){
                System.out.println(x + " * " + y + " = " + (x*y));
            }
        }
    }
}
