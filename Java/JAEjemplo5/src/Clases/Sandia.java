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
public class Sandia extends Fruta{
    private String nivel_madurez;

    @Override
    public void getInfo(){
        System.out.println("Nombre: " + getNombre());
    }
    
    
    /**
     * @return the nivel_madurez
     */
    public String getNivel_madurez() {
        return nivel_madurez;
    }

    /**
     * @param nivel_madurez the nivel_madurez to set
     */
    public void setNivel_madurez(String nivel_madurez) {
        this.nivel_madurez = nivel_madurez;
    }
}
