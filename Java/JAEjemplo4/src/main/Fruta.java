/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author erwin
 */
public class Fruta {
    private String color;
    private String tamanio;
    private String nombre;
    private String sabor;
    
    public void info(){
        System.out.println("\n------------------------");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Color: " + this.getColor());
        System.out.println("Tamaño: " + this.getTamanio());
        System.out.println("Sabor: " + this.getSabor());
        System.out.println("------------------------");
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param cl the color to set
     */
    public void setColor(String cl) {
        this.color = cl;
    }

    /**
     * @return the tamanio
     */
    public String getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
