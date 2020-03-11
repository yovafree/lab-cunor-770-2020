/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Arrays;

/**
 *
 * @author erwin
 */
public class Main4 {
    static int[] numeros = new int[5];
    
    public static void main(String[] args) {
        numeros[0] = 5;
        numeros[1] = 3;
        numeros[2] = 1;
        numeros[3] = 2;
        numeros[4] = 4;
        
        for (int x=0;x<4;x++){
            for (int y=0;y<4;y++){
                if (numeros[y] > numeros[y+1]){
                    int temp = numeros[y];
                    numeros[y] = numeros[y+1];
                    numeros[y+1] = temp;
                }
            }
        }
        
        
        for (int x=0;x<5;x++){
            System.out.print(numeros[x] + " ");
            
        }
        
        for (int x=0;x<4;x++){
            for (int y=0;y<4;y++){
                if (numeros[y] < numeros[y+1]){
                    int temp = numeros[y];
                    numeros[y] = numeros[y+1];
                    numeros[y+1] = temp;
                }
            }
        }
        
        System.out.println("\n");
        for (int x=0;x<5;x++){
            System.out.print(numeros[x] + " ");
            
        }
    }
}
