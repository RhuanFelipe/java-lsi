/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade5;

/**
 *
 * @author rhuan.silva
 */
public class Calculadorav2 {

    public static void main(String[] args) {
        Calculadorav2 objeto = new Calculadorav2();
        IMath somar = (a, b) -> a + b;
        IMath subtracao = (a, b) -> a - b;
        IMath multiplicacao = (a, b) -> a * b;
        IMath divisao = (a, b) -> a / b;
        IMath exponeciacao = (a, b) -> Math.pow(a, b);
        IMath radiciacao = (a, b) -> Math.pow(a, 1 / b);

        System.out.println(objeto.execOperacao(5, 5, somar));
        System.out.println(objeto.execOperacao(6, 4, subtracao));
        System.out.println(objeto.execOperacao(3, 4, multiplicacao));
        System.out.println(objeto.execOperacao(10, 2, divisao));
        System.out.println(objeto.execOperacao(5, 3, exponeciacao));
        System.out.println(objeto.execOperacao(5, 3, radiciacao));
    }

    public double execOperacao(double a, double b, IMath op) {
        return op.operacao(a, b);
    }
}
