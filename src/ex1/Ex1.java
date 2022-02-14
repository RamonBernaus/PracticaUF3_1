/*1. Crea un programa que llegeixi frases per teclat i les vagi guardant en un fitxer
“textos.txt”. El programa finalitzarà quan s’entri una cadena buida*/
package ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Ex1 {

    public static void main(String[] args) throws IOException {
        File F = new File("./arxiu.txt");
        F.createNewFile();
        FileReader fr = new FileReader(F);
        FileWriter writer = new FileWriter(F,true);
        BufferedReader br = new BufferedReader(fr);
        PrintWriter pw = new PrintWriter(writer);
        Scanner s = new Scanner(System.in);
        try {
            String linea;
            System.out.println("Digues una frase ");
            linea = s.nextLine();
            linea = br.readLine();
            pw.println(linea);
            pw.flush();
            writer.close();
            fr.close();           
        } catch (Exception e) {
            e.printStackTrace();
            
        }

    }
}
