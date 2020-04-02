/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.sun.javafx.iio.ImageLoader;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

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
        Image sky = getToolkit().getImage("img/asset2/world/sky.png");
        g.drawImage(sky, 0, 0, this);
        g.drawImage(sky, 100, 0, this);
        g.drawImage(sky, 200, 0, this);
        g.drawImage(sky, 300, 0, this);
        g.drawImage(sky, 400, 0, this);
        
        Image background = getToolkit().getImage("img/asset2/world/clouds.png");
        g.drawImage(background, 0, 220, this);
        
        Image fbackground = getToolkit().getImage("img/asset2/world/far-grounds.png");
        g.drawImage(fbackground, 0, 350, this);
        
        Image tileset = getToolkit().getImage("img/asset2/world/tileset.png");
        
        
        g.drawImage(tileset, 100, 100, 192, 175, 36, 22, 145, 97, this);
        
        
        int posX=1;
        int posY=100;
        
        for (int x=1;x<5;x++){
            g.drawImage(tileset, posX*(x), posY, (posX*(x))+48, posY+39, 191, 185, 239, 224, this);
        }
        
        
        
        
        //g.setColor(Color.BLUE);
        //g.fillRect(0, 0, 20, 20);
        
        //g.setColor(Color.YELLOW);
        //g.fillArc(25, 0, 75, 75, 45, 245);
        
//        for (int x=0; x<getTamX();x++){
//            for (int y=0;y<getTamY();y++){
//                switch (mat[x][y]) {
//                    case 0:
//                        g.setColor(Color.black);
//                        g.drawRect(125 + (getTam()*x), 25 + (getTam()*y), getTam(), getTam());
//                        break;
//                    case 1:
//                        g.setColor(Color.blue);
//                        g.fillRect(125 + (getTam()*x), 25 + (getTam()*y), getTam(), getTam());
//                        g.setColor(Color.black);
//                        g.drawRect(125 + (getTam()*x), 25 + (getTam()*y), getTam(), getTam());
//                        break;
//                    case 2:
//                        g.setColor(Color.GREEN);
//                        g.fillRect(125 + (getTam()*x), 25 + (getTam()*y), getTam(), getTam());
//                        g.setColor(Color.black);
//                        g.drawRect(125 + (getTam()*x), 25 + (getTam()*y), getTam(), getTam());
//                        break;
//                    default:
//                        break;
//                }
//                
//            }
//        }
        
        
//        g.setColor(Color.black);
//        g.drawLine(100, 0, 100, 400);
        
//        g.setColor(Color.black);
//        g.drawString("Puntaje",25,100);
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
