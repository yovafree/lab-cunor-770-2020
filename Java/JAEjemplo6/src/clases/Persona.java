/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 * Clase que controla información de personas.
 * @author erwin
 */
public final class Persona {
    private String CUI;
    private String nombres;
    private String apellidos;
    private int edad;
    
    public Persona(){
        this.setCUI("");
        this.setNombres("");
        this.setApellidos("");
        this.setEdad(0);
    }
    
    /**
     * Constructor que permite inicializar información de una persona.
     * @param cui Se utilizará para almacenar el CUI de una persona
     * @param nombres Se utiliza para almacenar los nombres
     * @param apellidos Se utiliza para almacenar los apellidos
     * @param edad  Almacena la edad
     */
    public Persona(String cui, String nombres, String apellidos, int edad){
        this.setCUI(cui);
        this.setNombres(nombres);
        this.setApellidos(apellidos);
        this.setEdad(edad);
    }
    
    /**
     * 
     * @param cui
     * @param nombres
     * @param apellidos 
     */
    public Persona(String cui, String nombres, String apellidos){
        this.setCUI(cui);
        this.setNombres(nombres);
        this.setApellidos(apellidos);
    }
    
    
    public void getInfo(){
        System.out.println("CUI: " + this.getCUI());
        System.out.println("Nombres: " + this.getNombres());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("Edad: " + this.getEdad());
    }
    
    public void getInfo(int edad){
        System.out.println("CUI: " + this.getCUI());
        System.out.println("Nombres: " + this.getNombres());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("Edad: " + edad);
    }

    /**
     * @return the CUI
     */
    public String getCUI() {
        return CUI;
    }

    /**
     * @param CUI the CUI to set
     */
    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
