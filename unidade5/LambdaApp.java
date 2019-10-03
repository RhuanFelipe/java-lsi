/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade5;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rhuan.silva
 */
public class LambdaApp {
    //static int numero = 0;
    //int somatorio;

    public static void main(String[] args) {
        //int numero = 10;
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        //LambdaApp app = new LambdaApp();
        
        integers.forEach((Integer x) -> {
            x += 10;
            System.out.println(x);
        });
        /* 
          integers.forEach(x->{
            int y = x/2;
            System.out.println(y);
        });
        integers.forEach(x -> {
            numero = 10;
            x += numero;
            app.somatorio += x;
            System.out.println(app.somatorio);
        });
        
        integers.forEach(x -> {
            x += numero;
            System.out.println(x);
        });
        System.out.println(integers);
        for (Integer inteiro : integers) {
            inteiro += 10;
            System.out.println(inteiro);
        }
        integers.forEach(x->System.out.println(x));
        integers.forEach(x -> {
            x += 10;
            System.out.println(x);
        });*/
    }
}
