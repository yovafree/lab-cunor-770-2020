/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author erwin
 */
public class TryCatch {
     public static void main(String[ ] args) {
        int[] myNumbers = {1, 2, 3};
        try{
            //int num = 5/0;
            
            int num2 = Integer.parseInt("");
            System.out.println(myNumbers[10]); // error!
        }catch(ArithmeticException ex){
            System.out.println("Se dividió dentro de cero");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Fuera de índice");
        }
        catch(Exception ex){
            System.out.println("Excepción genérica");
        }
        
        
        System.out.println("Hola cómo están?");
    }
    
}
