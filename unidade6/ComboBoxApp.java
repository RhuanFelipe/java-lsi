/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author rhuan
 */
public class ComboBoxApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Celsius Convert");
        frame.setSize(350, 250);
        Container cont = frame.getContentPane();
        cont.setLayout(new FlowLayout());
        String[] init = {"BRASIL","EUA","CHILE"};
        JComboBox<String> combo = new JComboBox<>(init);
        cont.add(combo);
        frame.setVisible(true);
    }
}
