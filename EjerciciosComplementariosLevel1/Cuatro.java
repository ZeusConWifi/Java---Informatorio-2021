import java.util.Scanner;

public class Cuatro {
        public static void main( String[] args ) {
         Scanner entradaScanner = new Scanner(System.in); 
         System.out.println("Ingrese un número entero: ");
         int num = entradaScanner.nextInt();
         System.out.println( "El factorial de " + num + " es: " + factorial( num ) );      
        }
      
        public static int factorial( int num ) {
           int fact = 1;
           for( int i = 1; i <= num; i++ ) {
              fact *= i;
           }
           return fact;
         }
      
     
}
