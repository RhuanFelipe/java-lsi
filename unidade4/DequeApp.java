/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author rhuan.silva
 */
public class DequeApp {

    public static void main(String[] args) {
        Deque<String> lista = new ArrayDeque<>();
        lista.add("vermelho");
        lista.add("verde");
        lista.add("verde");
        lista.add("amarelo");
        System.out.println("lista antes de remover " + lista);
        lista.removeFirst();
        lista.removeLast();
        System.out.println("lista removida " + lista);
        lista.addFirst("Azul");
        lista.addLast("Preto");
        System.out.println("lista inserida " + lista);
        System.out.println("Primeiro " + lista.peekFirst());
        System.out.println("Ultimo " + lista.peekLast());
    }
}
