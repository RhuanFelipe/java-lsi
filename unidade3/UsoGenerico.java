/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade3;

/**
 *
 * @author rhuan.silva
 */
public class UsoGenerico {
    public static void main(String[] args) {
        ExemploGenerics<Integer> generico = new ExemploGenerics<>(88);
        generico.showType();
        
        ExemploGenerics<String> generico2 = new ExemploGenerics<>("Rhuan Felipe");
        generico2.showType();
    }
 
}
