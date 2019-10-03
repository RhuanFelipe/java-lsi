/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade5.lojavirtual;

import java.nio.file.Path;

/**
 *
 * @author rhuan.silva
 */
public class Curso {
    private int codCurso;
    private String nome;
    private float valor;
    private Path url;

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Path getUrl() {
        return url;
    }

    public void setUrl(Path url) {
        this.url = url;
    }
    
    
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
