import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in); 
        System.out.print( "Ingrese un número entero positivo: " );
        int num = entradaScanner.nextInt();
            for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }   
    }    
}
