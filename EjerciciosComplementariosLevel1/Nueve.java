import java.util.Scanner;
import java.io.IOException;

public class Nueve {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String frase;
        char letra;
        int numeroDeVeces = 0;
        do {
            System.out.println("Ingrese una frase: ");
            frase = scan.nextLine();
        } while (frase.isEmpty());
        System.out.print("Ingrese una letra: ");
        letra = (char) System.in.read();
        numeroDeVeces = contarCaracteres(frase, letra);
        System.out.println("La letra " + letra + " aparece " + numeroDeVeces + " veces");
        scan.close();                   
    }

    public static int contarCaracteres(String cadena, char letra) {
        int posicion, contador = 0;
        posicion = cadena.indexOf(letra);
        while (posicion != -1) { 
            contador++;           
            posicion = cadena.indexOf(letra, posicion + 1);
        }
        return contador;
   }
}
