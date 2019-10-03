/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade3.persistencia;

import java.lsi.unidade1.br.abctreinamentos.rh.Administrativo;
import java.lsi.unidade1.br.abctreinamentos.rh.Diretor;

/**
 *
 * @author rhuan.silva
 */
public class PersistenciaApp {
    public static void main(String[] args) {
        GenericDAO<Administrativo> admin = new GenericDAO<>();
        admin.create(new Administrativo());
        
        GenericDAO<Diretor> diretor = new GenericDAO<>();
        diretor.create(new Diretor());
    }
}
