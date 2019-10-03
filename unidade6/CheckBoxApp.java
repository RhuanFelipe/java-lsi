/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author rhuan
 */
public class CheckBoxApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Celsius Convert");
        frame.setSize(350, 250);
        Container cont = frame.getContentPane();
        cont.setLayout(new FlowLayout());
        cont.add(new JCheckBox("1-Sim"));
        cont.add(new JCheckBox("1-Não"));
        frame.setVisible(true);
    }
}
