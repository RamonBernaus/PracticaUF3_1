/*1. Crea un programa que llegeixi frases per teclat i les vagi guardant en un fitxer
“textos.txt”. El programa finalitzarà quan s’entri una cadena buida*/
package ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ausias
 */
public class Ex1 {

    public static void main(String[] args) throws IOException {
        File archivo = new File("C:\\archivo.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        try {
            String linea;
            while ((linea = br.readLine()) != null) 
                System.out.println(" Digues una frase i es guardara");
            }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
