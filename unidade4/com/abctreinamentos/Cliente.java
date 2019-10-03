/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4.com.abctreinamentos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rhuan.silva
 */
public class Cliente {

    Set<Curso> cursos;

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public static void main(String[] args) {
        Curso java8 = new Curso("Java 8");
        Curso oracle12c = new Curso("Oracle12c");

        Set<Curso> cursoA = new HashSet<>();
        Set<Curso> cursoB = new HashSet<>();
        cursoA.add(java8);
        cursoA.add(oracle12c);
        cursoB.add(java8);
        Cliente A = new Cliente();
        A.setCursos(cursoA);
        Cliente B = new Cliente();
        A.setCursos(cursoB);
        //System.out.println(cursoA);
        //System.out.println(cursoB);

        //cursoA.retainAll(cursoB);
        //System.out.println("interseção curso A e B : " + cursoA);
        //cursoA.removeAll(cursoB);
        //System.out.println("remoção do que tem no A e B : " + cursoA);
        System.out.println(A);
        System.out.println(B);
    }
}
 