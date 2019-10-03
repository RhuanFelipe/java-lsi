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
public class UsoGenerico2 {
    public static void main(String[] args) {
        ExemploGenerics2<Integer, String> generic1 = new ExemploGenerics2<>(25,"Rhuan Felipe");
        generic1.showType();
    }
}
