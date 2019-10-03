/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4;

import java.util.ArrayList;

/**
 *
 * @author rhuan.silva
 */
public class Notebook {

    static ArrayList<String> anotacoes;

    public static void main(String[] args) {
        anotacoes = new ArrayList<>();
        anotacoes.add("Comprar pão");
        anotacoes.add("Vender Carro");
        anotacoes.add("Reunião 11 e 30");

        long t1 = System.currentTimeMillis();

        for (int i = 3; i < 10004; i++) {
            anotacoes.add("texto_" + i);
        }
        long t2 = System.currentTimeMillis();
        System.out.println((t2 - t1));
        //System.out.println(anotacoes);
        
    }
}
