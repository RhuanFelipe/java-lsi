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
public class JTFApp2 extends JFrame implements ActionListener{

    public static void main(String[] args) {
        JTFApp2 frame = new JTFApp2();
        frame.setTitle("Primeira aplicação!");
        frame.setSize(350, 250);
        Container cont = frame.getContentPane();
        JTextField tf = new JTextField("digite aqui");
        tf.addActionListener(frame);
        cont.add(tf,BorderLayout.NORTH);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        JOptionPane.showMessageDialog(null, ev.getActionCommand().toString());
    }
}
