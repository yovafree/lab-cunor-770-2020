/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class Main2 {
    public static void main(String[] args) {
        int num1=3,num2=5;
        
        //Condicionales, IF
        
        if(num1>num2){
            System.out.println("El mayor es " + num1);
        }else if(num1==num2){
            System.out.println("Ambos son iguales");
        }
        else{
            System.out.println("El mayor es " + num2);
        }
        
        //Switch
        Scanner sc = new Scanner(System.in);
        int op=sc.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Eligió opción 1");
                break;
            case 2:
                System.out.println("Eligió opción 2");
                break;
            case 3:
                System.out.println("Eligió opción 3");
                break;
            default:
                System.out.println("No se encontró ninguna anterior.");
                break;
        }
    }
}
