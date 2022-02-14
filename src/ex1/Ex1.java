/*
1. Crea un programa que llegeixi frases per teclat i les vagi guardant en un fitxer
“textos.txt”. El programa finalitzarà quan s’entri una cadena buida
 */
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
        //Iniciem el programa
        System.out.println("Aquest programa llegeix i guarde els fitxers tipo text que donis.");
        System.out.println("Així que...");
        //Executem el File_read per a que ens llegeixi
        File_read();

    }

    public static String File_read() throws IOException {
        //Creem el file 
        File arxiu = new File("./arxiu.txt");
        arxiu.createNewFile();
        Scanner s = new Scanner(System.in);
        FileReader fr = new FileReader(arxiu);
        //Fem que el llegeixi
        BufferedReader br = new BufferedReader(fr);
        String linea = null; //Creem un string per a que es doni el contingut
        boolean comprovar = true; //boolean per comprovar
        do {
            try {
                System.out.println("Digues una frase ");
                linea = br.readLine(); //imprimim el contingu al file
                linea = s.nextLine(); //el llegim per a poguer saber si es null
                if (linea.equals("")) { //comprovem si es null
                    System.out.println("La linea esta buida, el programa s'ha aturat");
                    fr.close();
                    comprovar = false;
                    return linea;
                    //Si ho es para el programa
                } else {
                    comprovar = true;
                    //Si no ho es segueix i ens ho registra en el arxiu
                    File_print(linea); //amb el file print
                }
            } catch (Exception e) {
                e.printStackTrace();

            }
        } while (comprovar = true);
        return linea; //tornem el string al main
    }

    public static File File_print(String F) throws IOException {
        File arxiu = new File("./arxiu.txt"); //Cridem al file
        FileWriter write = new FileWriter(arxiu, true);
        PrintWriter pw = new PrintWriter(write); //el copiem al arxiu
        pw.println(F);
        pw.flush();
        write.close(); //parem 
        return arxiu;
    }

}
