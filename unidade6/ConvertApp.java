/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author rhuan
 */
public class ConvertApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Celsius Convert");
        frame.setSize(350, 250);
        Container cont = frame.getContentPane();
        cont.setLayout(new GridLayout(2,2));
        //cont.setLayout(new FlowLayout());
        //cont.setLayout(new BorderLayout());
        cont.add(new JTextField("0"));
        cont.add(new JLabel("Celsius"));
        cont.add(new JButton("Convert"));
        cont.add(new JLabel("30 fahrenheit"));
        frame.setVisible(true);
        
    }
}
