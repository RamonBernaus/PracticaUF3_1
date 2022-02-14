/*
2. Amplia el programa anterior per tal que:
a) Si el fitxer no existeix, que el generi.
b) Si el fitxer ja existeix, que afegeixi el contingut al final.
c) Si l’usuari escriu @ESBORRA, cal esborrar el contingut del fitxer.
*/
package ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex2 {

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
