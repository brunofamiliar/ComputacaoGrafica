/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulacg;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author Edson Bruno
 */
public class DesenhaFormas extends Canvas {
    public static final long serialVersionUID = 1L;
    private Graphics context;
    
    public void paint(Graphics g){
        super.paint(g);
        context = g;
        setBackground(Color.WHITE);

        this.retangulo(10,10,200,100);
        this.linha("rigth",10,10,200,100);
        this.linha("left",200,10,200,100);
    }
    
    public void retangulo(int x, int y, int w, int h){
        Dimension d = getSize();
        context.setColor(Color.BLUE);
        int width = iX((int)w);
        int height = iY((int) h);
        System.out.println("w: " + width);
        System.out.println("h: " + height);
        
        context.drawRect(iX(x), iY(y), width,height);
    }
    
    public void linha(String tipo, int x, int y, int w, int h){
        Dimension d = getSize();
        w = iX((int)(d.width - w * 1.2));
        h = iY((int)(d.height - h*1.2));
        
        if(tipo.equals("rigth")){
            context.setColor(Color.RED);
            context.drawLine(iX(x), iY(y), w+10, h+10);
        }else{
            context.setColor(Color.GREEN);
            context.drawLine(iX(w+10),iY(y), iX(y), iY(h+10));
        }
              
    }
    
    private int iX(float x){return Math.round(x);}
    private float fX(int x){return (float)x;}
    
    private int iY(float y){Dimension d = getSize(); return d.height -  Math.round(y);}
    private float fY(int y){Dimension d = getSize(); return (float)(d.height - y);}
    
}
