/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author anibal
 */
public class Semafaro  extends JPanel  {
    
       private Color vermelho = Color.RED;
    private Color amarelo = Color.YELLOW;
    private Color verde = Color.GREEN;
    private Color preta = Color.BLACK;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Desenha o fundo
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Desenha o retângulo preto
        g.setColor(Color.BLACK);
       //por dentro // g.fillRect(50, 50, 100, 300);
         g.drawRect(50, 50, 100, 300);

        // Desenha as cores dos semáforos
        g.setColor(vermelho);
        g.fillOval(60, 60, 80, 80);

        g.setColor(amarelo);
        g.fillOval(60, 160, 80, 80);

        g.setColor(verde);
        g.fillOval(60, 260, 80, 80);
        
        
        // Desenha o retângulo preto
        g.setColor(Color.BLACK);
       //por dentro // g.fillRect(50, 50, 100, 300);
         g.drawRect(150, 150, 100, 200);
        
             g.setColor(preta);
        g.fillOval(160, 160, 80, 80);

        
        
       g.setColor(preta);
        g.drawOval(160, 260, 80, 80);
        
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Semáforo");
        Semafaro semafaro = new Semafaro();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.getContentPane().add(semafaro);
        frame.setVisible(true);
    }
    
}
