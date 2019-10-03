/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4.com.lojavirtual;

import java.nio.file.Path;

/**
 *
 * @author rhuan.silva
 */
public class Curso {
    int codCurso;
    String nome;
    float valor;
    Path url;

    public Curso(int codCurso, String nome, float valor, Path url) {
        this.codCurso = codCurso;
        this.nome = nome;
        this.valor = valor;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + '}';
    }
    
    
}
