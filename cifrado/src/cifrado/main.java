
package cifrado;

import static cifrado.cifradoCesar.cifradoCesar;
import static cifrado.cifradoCesar.descifradoCesar;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        String texto;
        int cod;
        char opcion;
        do {
            System.out.print("Introduce un texto: ");
            texto = leer.nextLine();
        } while (texto.isEmpty());
        do {
            System.out.print("Introduce el código: ");
            cod = leer.nextInt();
        } while (cod < 1);
        do {
            leer.nextLine();
            System.out.print("(C) cifrar o (D) descifrar?: ");
            opcion = (char) System.in.read();
        } while (Character.toUpperCase(opcion) != 'C' && Character.toUpperCase(opcion) != 'D');
        if (Character.toUpperCase(opcion) == 'C') {
            System.out.println("Texto cifrado: " + cifradoCesar(texto, cod));
        } else {
            System.out.println("Texto descifrado: " + descifradoCesar(texto, cod));
        }
    }

}
