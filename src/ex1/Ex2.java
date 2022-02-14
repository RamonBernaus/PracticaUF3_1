/*
2. Amplia el programa anterior per tal que:
a) Si el fitxer no existeix, que el generi.
b) Si el fitxer ja existeix, que afegeixi el contingut al final.
c) Si l’usuari escriu @ESBORRA, cal esborrar el contingut del fitxer.
 */
package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) throws IOException {

        String linea;
        System.out.println("Aquest programa llegeix i guarde els fitxers tipo text que donis.");
        System.out.println("Així que...");
        File_read();

        File F = new File("./arxiu_1.txt");
        if (F.exists()) {
            F.createNewFile();
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(F));
        bw.write("");
        bw.close();
    }

    public static String File_read() throws IOException {
        File arxiu = new File("./arxiu.txt");
        Scanner s = new Scanner(System.in);
        arxiu.createNewFile();
        FileReader fr = new FileReader(arxiu);
        BufferedReader br = new BufferedReader(fr);
        String linea = null;
        boolean comprovar = true;
        do {
            try {
                System.out.println("Digues una frase ");
                linea = br.readLine();
                linea = s.nextLine();
                if (linea.equals("")) {
                    System.out.println("La linea esta buida, el programa s'ha aturat");
                    fr.close();
                    comprovar = false;
                    return linea;
                } else {
                    comprovar = true;
                    File_print(linea);
                }
            } catch (Exception e) {
                e.printStackTrace();

            }
        } while (comprovar = true);
        return linea;
    }

    public static File File_print(String F) throws IOException {
        File arxiu = new File("./arxiu.txt");
        FileWriter write = new FileWriter(arxiu, true);
        PrintWriter pw = new PrintWriter(write);
        pw.println(F);
        pw.flush();
        write.close();
        return arxiu;
    }

}
