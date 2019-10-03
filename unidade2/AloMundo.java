/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade2;
import java.awt.*;
import java.io.Serializable;
import javax.swing.JApplet;

/**
 *
 * @author rhuan.silva
 */
public class AloMundo extends JApplet{

   public static final long serialVersionUID = 1L;
   @Override
    public void paint(Graphics g) {
        g.drawRect(0, 0, 150, 150);
        this.setBackground(Color.GREEN);
        g.setColor(Color.BLUE);
        this.setSize(400,100);
        g.setFont(new Font("times new Roman", Font.BOLD, 30));
        g.drawString("Versão JVM:"+System.getProperty("java.version"), 20, 20);
        g.drawString("Versão S.O:"+System.getProperty("os.name"), 50, 50);
    }

    @Override
    public void init() {
        System.out.println("Inicializando ...");
    }

    @Override
    public void start() {
        System.out.println("Executando ...");
    }
    @Override
    public void stop() {
        System.out.println("Parando ...");
    }

    @Override
    public void destroy() {
        System.out.println("Eliminando ...");
    }
}
