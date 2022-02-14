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
        
        String linea;
        System.out.println("Aquest programa llegeix i guarde els fitxers tipo text que donis.");
        System.out.println("Així que..."); 
        File_read();
        }
    public static String File_read() throws IOException{
        File F = new File("./arxiu.txt");
        Scanner s = new Scanner(System.in);
        F.createNewFile();
        String linea = null;
        FileReader fr = new FileReader(F);
        FileWriter writer = new FileWriter(F,true);
        boolean comprovar = true;
        do{
        try {
        System.out.println("Digues una frase ");
        linea= s.nextLine();
        if (linea.equals("")){
            System.out.println("La linea esta buida, el programa s'ha aturat");
            fr.close();
            comprovar = false;
            return linea;
        } else{
            comprovar = true;
        }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        }while(comprovar = true);
        return linea;
        }
     public static String File_print() throws IOException{
         String si = null;
         return si;
         /*
         pw.println(linea);
         pw.flush();
         writer.close();*/
     }
     
     
    
}
