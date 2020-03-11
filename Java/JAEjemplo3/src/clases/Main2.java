/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author erwin
 */
public class Main2 {
    public static void main(String[] args) {
        // Arreglos
//        int[] numeros = new int[10];
//
//        numeros[0] = 5;
//        numeros[1] = 6;
//        numeros[2] = 7;
//        numeros[3] = 3;
//        numeros[4] = 1;
//        
//        for(int x=0; x<numeros.length;x++){
//            System.out.println(numeros[x]);
//        }

        //Arreglos multidimensionales
        
        int[][] matriz = new int[10][10];        
        
        int cnt=0;
        for(int x=0; x<matriz.length;x++){
            for(int y=0; y<matriz.length;y++){
                if (cnt == 0){
                    cnt = 1;
                    matriz[x][y] = cnt;
                }else{
                    cnt = 0;
                    matriz[x][y] = cnt;
                }
            }
            
            if (cnt == 0){
                    cnt = 1;
            }else{
                cnt = 0;
            }
        }
        
        for(int x=0; x<matriz.length;x++){
            for(int y=0; y<matriz.length;y++){
                System.out.print(matriz[x][y] + " ");
            }
            System.out.print("\n");
        }
    
    
    }
}
