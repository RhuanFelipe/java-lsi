/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade2;

import java.util.Scanner;
import java.util.Formatter;

/**
 *
 * @author rhuan.silva
 */
public class ScannerApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Formatter saida = new Formatter(System.out);
        
        System.out.println("Informe a nota 1");
        float n1 = entrada.nextFloat();        
        System.out.println("Informe a nota 2");
        float n2 = entrada.nextFloat();        
        System.out.println("Informe a nota 3");
        float n3 = entrada.nextFloat();        
        System.out.println("Informe a nota 4");
        float n4 = entrada.nextFloat();
        float media = (n1+n2+n3+n4) / 4;
        saida.format("Media = %.2f", media);
        entrada.close();
        saida.close();
    }
}
