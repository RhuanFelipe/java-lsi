/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4;

import java.util.LinkedHashMap;

/**
 *
 * @author rhuan.silva
 */
public class LinkedHashMapApp {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> mapa = new LinkedHashMap<>();
        mapa.put(4, "Bruno");
        mapa.put(2, "Umberto");
        mapa.put(3, "Fernando");
        mapa.put(3, "Caetano");
        mapa.put(1, "Umberto");
        System.out.println(mapa);
    }
}
