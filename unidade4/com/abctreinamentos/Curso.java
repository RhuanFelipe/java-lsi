/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4.com.abctreinamentos;

/**
 *
 * @author rhuan.silva
 */
public class Curso {
    String nome;

    public Curso(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + '}';
    }
    
}
