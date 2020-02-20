/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaejemplo1;

/**
 *
 * @author erwin
 */
public class Main2 {
    public static void main(String[] args) {
        int num1 = 88;
        int num2 = 16;
        int num3 = 33;
        
        if (num1>num2){
            if (num1>num3){
                System.out.println("El mayor es: " + num1);
            }else{
                System.out.println("El mayor es: " + num3);
            }
        }else{
            if (num2>num3){
                System.out.println("El mayor es: " + num2);
            }else{
                System.out.println("El mayor es: " + num3);
            }
        }
        
        
        if (num1<num2){
            if (num1<num3){
                System.out.println("El menor es: " + num1);
            }else{
                System.out.println("El menor es: " + num3);
            }
        }else{
            if (num2<num3){
                System.out.println("El menor es: " + num2);
            }else{
                System.out.println("El menor es: " + num3);
            }
        }
    }
}
