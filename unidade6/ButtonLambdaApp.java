/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author rhuan
 */
public class ButtonLambdaApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Primeira aplicação!");
        frame.setSize(350, 250);
        Container cont = frame.getContentPane();
        cont.setLayout(new FlowLayout());
        JButton botao = new JButton("Isto é um botão");
        botao.addActionListener(ev -> {
            JOptionPane.showMessageDialog(null, ev.getActionCommand().toString());
        });
        cont.add(botao);
        frame.setVisible(true);
    }

}
