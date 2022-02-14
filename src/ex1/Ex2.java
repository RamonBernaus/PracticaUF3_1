/*
2. Amplia el programa anterior per tal que:
a) Si el fitxer no existeix, que el generi.
b) Si el fitxer ja existeix, que afegeixi el contingut al final.
c) Si l’usuari escriu @ESBORRA, cal esborrar el contingut del fitxer.
 */
package ex1;

import java.io.File;
import java.io.IOException;

public class Ex2 {

    public static void main(String[] args) throws IOException {
        File F = new File("./arxiu_1.txt");
        if (F.exists()) {
            F.createNewFile();
        }
    }
}
