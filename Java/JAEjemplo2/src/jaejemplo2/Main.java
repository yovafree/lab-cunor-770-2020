/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaejemplo2;

/**
 * Programa para utilizar multiples condiciones y operadores lógicos.
 * @author erwin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1=3, num2=4, num3=11;
        
        if(num1>num2 && num1>num3){
            System.out.println("El mayor es: " + num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("El mayor es: " + num2);
        }else{
            System.out.println("El mayor es: " + num3);
        }
        
    }
    
}
