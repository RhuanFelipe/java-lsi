/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade6;

import javax.swing.JOptionPane;

/**
 *
 * @author rhuan.silva
 */
public class DialogApp {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Iniciando instalação!", "Instalando Concluida...", JOptionPane.INFORMATION_MESSAGE);
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        int resposta = JOptionPane.showConfirmDialog(null, " O nome digitado foi "+nome+" confirmar nome?");
        JOptionPane.showMessageDialog(null, resposta);
    }
  
}
