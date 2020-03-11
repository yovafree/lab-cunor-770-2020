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
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mensaje();
        int valor = suma(5,6);
        int valor1 = resta(5,6);
        int valor2 = multi(5,6);
        float valor3 = div(3,6);
        System.out.println(valor);
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
    }
    
    public static void mensaje(){
        System.out.println("Hola mundo en un método");
    }
    
    public static int suma(int num1, int num2){
        return num1+num2;
    }
    
    public static int resta(int num1, int num2){
        return num1-num2;
    }
    
    public static int multi(int num1, int num2){
        return num1*num2;
    }
    
    public static float div(float num1, float num2){
        return num1/num2;
    }
}
