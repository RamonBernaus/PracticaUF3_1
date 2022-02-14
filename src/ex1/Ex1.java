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
        FileReader fr = new FileReader(F);
        BufferedReader br = new BufferedReader(fr);
        String linea = null;
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
            linea = br.readLine();
            File_print(linea);
        }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        }while(comprovar = true);
        return linea;
        }
     public static File File_print(String F) throws IOException{ 
        File arxiu = new File("./arxiu.txt");
        FileWriter write = new FileWriter(arxiu, true);
        PrintWriter pw = new PrintWriter(write);
        pw.println(F);
        pw.flush();
        write.close();
        return arxiu;
     }
     
     
    
}
