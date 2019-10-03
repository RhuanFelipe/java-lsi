/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidade2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rhuan.silva
 */
public class StreamApp {

    public static void byteStream() throws FileNotFoundException, IOException {
        FileInputStream entrada = new FileInputStream("C:/Java-estudos/Java-lsi/src/dados.txt");
        int contator = 0;

        while (entrada.read() != -1) {
            contator++;
        }
        System.out.println("Quantidade de caracters : " + contator);
        entrada.close();
    }

    public static void streamCaracter(char letra) throws FileNotFoundException, IOException{
        FileInputStream entrada = new FileInputStream("C:/Java-estudos/Java-lsi/src/dados.txt");
        int contator = 0;
        int c;
        
        while ((c = entrada.read()) != -1) {
            if(c == letra){
                contator++;
            }
        }
        System.out.println("Numero de vezes que a letra foi encontrada: " + contator);
        entrada.close();
    }

    public static void main(String[] args) {
        try {
            System.out.println("Informe a letra");
            char letra = (char) System.in.read();
            streamCaracter(letra);
            
            byteStream();
        } catch (IOException ex) {
            Logger.getLogger(StreamApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
