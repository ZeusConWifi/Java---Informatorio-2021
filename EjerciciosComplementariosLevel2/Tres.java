import java.util.*;

public class Tres {
    public static void main(String[] args) {
        ArrayList<Integer> barajaFrancesa = new ArrayList<Integer>();
        barajaFrancesa.add(2);
        barajaFrancesa.add(3);
        barajaFrancesa.add(4);
        barajaFrancesa.add(5);
        barajaFrancesa.add(6);
        barajaFrancesa.add(7);
        barajaFrancesa.add(8);
        barajaFrancesa.add(9);
        barajaFrancesa.add(10);
        System.out.println("Baraja Francesa: ");
        System.out.println(barajaFrancesa);
        System.out.println("Baraja Francesa en orden inverso: ");
        Collections.reverse(barajaFrancesa);
        System.out.println(barajaFrancesa);
        System.out.println("Baraja Francesa desordenada: ");
        Collections.shuffle(barajaFrancesa);
        System.out.println(barajaFrancesa);
    }
}
