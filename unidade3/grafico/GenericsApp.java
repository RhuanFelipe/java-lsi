/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade3.grafico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rhuan.silva
 */
public class GenericsApp {
    public static void main(String[] args) {
        List<Shape> lista = new ArrayList<>();
        lista.add(new Circle());
        lista.add(new Rectangle());
        
    }
}
