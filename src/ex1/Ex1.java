/*1. Crea un programa que llegeixi frases per teclat i les vagi guardant en un fitxer
“textos.txt”. El programa finalitzarà quan s’entri una cadena buida*/
package ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ausias
 */
public class Ex1 {

    public static void main(String[] args) throws IOException {
        File F = new File("./arxiu.txt");
        F.createNewFile();
        FileReader fr = new FileReader(F);
        BufferedReader br = new BufferedReader(fr);
        Scanner s = new Scanner(System.in);
        try {
            String linea;
            System.out.println("Digues una frase ");
            linea = s.nextLine();
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
            fr.close();
        }

    }
}
