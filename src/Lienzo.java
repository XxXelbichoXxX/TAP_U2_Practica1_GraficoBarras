
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author black
 */
public class Lienzo extends Canvas{
    int x = 30;
    int y = 310;
    int textox = 50;
    int textoy = 350;
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Graficador.cBarra);
        for(int i = 0; i<Graficador.x.length; i++){
            int tam = (Graficador.vX[i]*300/Graficador.mayor);
            g.fillRect(x,y,40,-tam);
            g.drawString(Graficador.x[i], textox,textoy);
            x+=50;
            textox+=50;
        }
    }     
}

