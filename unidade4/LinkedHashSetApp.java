/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4;

import java.util.LinkedHashSet;

/**
 *
 * @author rhuan.silva
 */
public class LinkedHashSetApp {

    public static void main(String[] args) {
        LinkedHashSet<String> lista = new LinkedHashSet<>();
        lista.add("vermelho");
        lista.add("verde");
        lista.add("verde");
        lista.add("amarelo");
        System.out.println(lista);
    }
}