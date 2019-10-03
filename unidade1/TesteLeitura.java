/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rhuan.silva
 */
public class TesteLeitura {

    public static void main(String[] args) {
        byte[] bytes = new byte[10];
        System.out.println("Digite algo...");
        try {
            System.in.read(bytes);
        } catch (IOException ex) {
            Logger.getLogger(TesteLeitura.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("/Eco:"+new String(bytes));
    }

}
