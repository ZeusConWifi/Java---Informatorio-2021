import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero: ");
        int m = num.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int n = num.nextInt();
        int result = calcularPotencia(m,n);
        System.out.println(m+" elevado a la "+n+"es: "+result);
    }
    static int calcularPotencia(int m, int n){
        int preg = 1;
        if(m > 0 && n==0){
            return preg;
        }
        else if(m == 0 && n>=1){
            return 0;
        }
        else{
            for(int i = 1; i<= n; i++){
                preg = preg*m;
            }
            return preg;
        }
    }
}