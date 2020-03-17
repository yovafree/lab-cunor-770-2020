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
public class Fruta extends Verdura {
    private String color;
    private String sabor;
    private String nombre;
    private String tamanio;
    private String[] nombres = new String[10];
    
    public Fruta(){
        nombres[0] = "Juan Pan";
        nombres[1] = "Diego Pan";
        nombres[2] = "Luis Pan";
        nombres[3] = "José Pan";
        nombres[4] = "Carlos Pan";
        
        aroma = "";
    }
    
    
    
    public void cambiarNombre(int pos, String nombre){
        getNombres()[pos]=nombre;
    }
    
    public void getInfo(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Color: " + getColor());
        System.out.println("Sabor: " + getSabor());
        System.out.println("Tamaño: " + getTamanio());
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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
     * @return the nombres
     */
    public String[] getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }
}
