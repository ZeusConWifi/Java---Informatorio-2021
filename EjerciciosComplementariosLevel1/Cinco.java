import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero: ");
        int m = num.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int n = num.nextInt();
        int mult = mult(m, n);
        System.out.println("La multiplicación sucesiva de ambos números es= "+ mult);
        num.close();
    }
    static int mult(int m, int n){
        int mul = 0;
        if((m != 0) && (n != 0)){
            for (int i = 0; i < n; i++) {
                mul += m;
            }
        }
        return mul;
    }
}
