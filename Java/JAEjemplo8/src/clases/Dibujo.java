/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author erwin
 */
public class Dibujo extends Canvas {
    private int tam = 25;
    private int tamX = 5;
    private int tamY = 10;
    private int[][] mat;
    
    public Dibujo(int[][] mat){
        setBackground(Color.WHITE);
        this.mat = mat;
    }
    
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(400,400);
    }
    
    @Override
    public void paint(Graphics g){
        
        //g.setColor(Color.BLUE);
        //g.fillRect(0, 0, 20, 20);
        
        //g.setColor(Color.YELLOW);
        //g.fillArc(25, 0, 75, 75, 45, 245);
        
        for (int x=0; x<getTamX();x++){
            for (int y=0;y<getTamY();y++){
                switch (mat[x][y]) {
                    case 0:
                        g.setColor(Color.black);
                        g.drawRect(125 + (getTam()*x), 25 + (getTam()*y), getTam(), getTam());
                        break;
                    case 1:
                        g.setColor(Color.blue);
                        g.fillRect(125 + (getTam()*x), 25 + (getTam()*y), getTam(), getTam());
                        g.setColor(Color.black);
                        g.drawRect(125 + (getTam()*x), 25 + (getTam()*y), getTam(), getTam());
                        break;
                    case 2:
                        g.setColor(Color.GREEN);
                        g.fillRect(125 + (getTam()*x), 25 + (getTam()*y), getTam(), getTam());
                        g.setColor(Color.black);
                        g.drawRect(125 + (getTam()*x), 25 + (getTam()*y), getTam(), getTam());
                        break;
                    default:
                        break;
                }
                
            }
        }
        
        
        g.setColor(Color.black);
        g.drawLine(100, 0, 100, 400);
        
        g.setColor(Color.black);
        g.drawString("Puntaje",25,100);
    }

    /**
     * @return the tam
     */
    public int getTam() {
        return tam;
    }

    /**
     * @param tam the tam to set
     */
    public void setTam(int tam) {
        this.tam = tam;
    }

    /**
     * @return the tamX
     */
    public int getTamX() {
        return tamX;
    }

    /**
     * @param tamX the tamX to set
     */
    public void setTamX(int tamX) {
        this.tamX = tamX;
    }

    /**
     * @return the tamY
     */
    public int getTamY() {
        return tamY;
    }

    /**
     * @param tamY the tamY to set
     */
    public void setTamY(int tamY) {
        this.tamY = tamY;
    }
}
