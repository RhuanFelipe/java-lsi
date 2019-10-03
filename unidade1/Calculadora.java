/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade1;

import java.util.Scanner;

/**
 *
 * @author rhuan
 */
public class Calculadora {

    public static void dividir(int n1, int n2) throws ArithmeticException {
        System.out.println(n1 / n2);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite primeiro valor");
        int n1 = entrada.nextInt();
        System.out.println("Digite segundo valor");
        int n2 = entrada.nextInt();
        
        try {
            dividir(n1, n2);
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão por zero!");
        }
    }
}
