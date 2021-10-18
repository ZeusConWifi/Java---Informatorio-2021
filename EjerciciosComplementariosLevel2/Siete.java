import java.util.Scanner;
import java.util.ArrayList;

public class Siete {

    public static void main(String[] args) {

        System.out.println("Ingrese dos números enteros de los cuales el primero sea menor que el segundo: ");
        Scanner scan = new Scanner(System.in);     
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        ArrayList<String> lista = new ArrayList<String>();
        for (int i = num1; i < num2; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                lista.add("FizzBuzz");
            } else if (i % 2 == 0) {
                lista.add("Fizz");
            } else if (i % 3 == 0) {
                lista.add("Buzz");
            } else {
                lista.add(String.valueOf(i));
            }
        }
        System.out.println(lista);
    }
}
