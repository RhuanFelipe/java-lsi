/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rhuan.silva
 */
public class ScannerApp2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner entrada = new Scanner(new FileReader("C:/Java-estudos/Java-lsi/src/numeros.txt"));
        double soma = 0;
        String valor;
        
        while(entrada.hasNext()){
            valor = entrada.next();
            soma = soma + Double.parseDouble(valor);
        }
        entrada.close();
        JOptionPane.showMessageDialog(null, "A soma dos valores é : "+soma);
    }
}
