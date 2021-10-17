import java.util.Scanner;

public class Dos {
    public static void main(String[] args) {

    Scanner entradaScanner = new Scanner(System.in); 

    System.out.print( "Ingrese el primer número: " );
        int primerNumero = entradaScanner.nextInt();
        System.out.print( "Ingrese el segundo número: " );
        int segundoNumero = entradaScanner.nextInt();
 
        System.out.print( "Su suma es: " );
        System.out.println( primerNumero + segundoNumero );
        System.out.print("Su resta es: ");
        System.out.println( primerNumero - segundoNumero );
        System.out.print("Su multiplicación es: ");
        System.out.println( primerNumero * segundoNumero );
        System.out.print("Su división es: ");
        System.out.println( primerNumero / segundoNumero );
        System.out.print("Su módulo es: ");
        System.out.println( primerNumero % segundoNumero );
entradaScanner.close();
    }
}
