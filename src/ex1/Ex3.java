/*3. Amplia el programa anterior per tal que:
a) Mostri per pantalla tot el contingut del fitxer
b) Mostri per pantalla el contingut de la línia X, sent X un número que li
demanarem a l’usuari.
c) Inserti una línia al començament del fitxer*/
package ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Ex3 {

    public static void main(String[] args) throws IOException {
        Print_File();
        Print_X();
        Agregar_lin();
    }

    public static String Print_File() throws IOException {
        File arxiu = new File("arxiu.txt");
        Scanner s = null;
        String linea = null;
        try {
            System.out.println("LLegim el fitxer ");
            s = new Scanner(arxiu);
            while (s.hasNextLine()) {
                linea = s.nextLine(); 	// Guardamos la linea en un String
                System.out.println(linea);      // Imprimimos la linea
            }
        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());

        }
        return linea;
    }

    public static String Print_X() throws IOException {
        int x;
        String linea;
        FileReader fr = new FileReader("arxiu.txt");
        BufferedReader bf = new BufferedReader(fr);
        Scanner s = new Scanner(System.in);
        System.out.println("Don un numero de la linea");
        x = s.nextInt();
        long numero_lin = 0;
        while ((linea = bf.readLine()) != null) {
            if (numero_lin == x - 1) {
                System.out.println(linea);
                return linea;
            } else if (numero_lin > x) {
                linea = "El numero es massa gran";
            } else {
                numero_lin++;
            }
        }

        return linea;
    }
    public static String Agregar_lin(){
        String line = null;
        try
        {
            String filePath = "arxiu.txt";
            FileWriter fw = new FileWriter(filePath, true);               
            line= "\r\nHola :)";    
            fw.write(line);
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return line;
     }
}

