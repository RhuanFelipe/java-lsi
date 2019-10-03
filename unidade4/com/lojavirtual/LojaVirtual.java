/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade4.com.lojavirtual;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rhuan.silva
 */
public class LojaVirtual {

    static Map<Cliente, List<Curso>> pagamentos = new HashMap<>();

    public static void main(String[] args) {
        //Criar cursos disponiveis do site
        Curso java8 = new Curso(1, "Java 8", 2000, Paths.get("/java8"));
        Curso oracle12c = new Curso(2, "oracle 12c", 2500, Paths.get("/oracle12c"));
        Curso php7 = new Curso(3, "php7", 1500, Paths.get("/php7"));

        //cadastrar cliente
        Cliente rhuan = new Cliente("000.000.00-00", "Rhuan Felipe da silva", "rhuan@gmail.com");
        // criar lista de cursos
        List<Curso> cursosDoRhuan = new LinkedList<>();
        //fazer um checkout dos cursos escolhidos
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("Qual curso deseja adquirir: [1 - JAVA 8], [2 - ORACLE12C],[3 - PHP7],[4 - FINALIZAR COMPRA]");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                cursosDoRhuan.add(java8);
            } else if (opcao == 2) {
                cursosDoRhuan.add(oracle12c);
            } else if (opcao == 3) {
                cursosDoRhuan.add(php7);
            } else {
                opcao = 4;
            }

        }
        entrada.close();
        pagamentos.put(rhuan, cursosDoRhuan);
        System.out.println(pagamentos);
    }
}
