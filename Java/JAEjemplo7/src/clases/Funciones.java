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
public class Funciones {
    
    /***
     * Método que permite convertir de decimal a binario.
     * @param dec
     * @return 
     */
    public String DecABin(String dec){
        int num = Integer.parseInt(dec);
        String conv = "";
        int a = num;
        int b = 0;
        do{
            a = num/2;
            b = num%2;
            conv = b + conv;
            num = a;
        }while (num > 0);
        return conv;
    }
    
    /***
     * 
     * @param bin
     * @return 
     */
    public String BinADec(String bin){
        int pos = 0;
        int sum = 0;
        for(int x = bin.length()-1; x>=0;x--){
            int num = Integer.parseInt(""+bin.charAt(x));
            sum += (int) (Math.pow(2, pos)*num);
            pos++;
        }
        return ""+sum;
    }
}
