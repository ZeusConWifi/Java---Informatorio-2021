import java.util.Scanner;

public class Hola {
    public static void main(String[] args)
    {
        Scanner entradaScanner = new Scanner(System.in); 

        System.out.println("Ingrese su nombre: ");

        String usuario = entradaScanner.nextLine(); 

        System.out.println("Hola " + usuario);
        entradaScanner.close();
    }
}


