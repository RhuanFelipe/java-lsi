/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author rhuan
 */
public class JTFALambdaApp{

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Primeira aplicação!");
        frame.setSize(350, 250);
        Container cont = frame.getContentPane();
        JTextField tf = new JTextField("digite aqui");
        tf.addActionListener(ev->{
            JOptionPane.showMessageDialog(null, ev.getActionCommand().toString());
        });
        cont.add(tf,BorderLayout.NORTH);
        frame.setVisible(true);
    }

  
}
