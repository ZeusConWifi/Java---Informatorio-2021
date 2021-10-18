import java.util.*;

public class Dos {
    public static void main(String[] args) {
        ArrayList<Integer> enteros = new ArrayList<Integer>();
        enteros.add(3);
        enteros.add(15);
        enteros.add(91);
        enteros.add(10);
        enteros.add(21);
 System.out.println(enteros);

 int tamanio = enteros.size();
 System.out.println("El número de elementos es de: "+tamanio);

 enteros.add(0, 1);
 enteros.add(6, 4);

 System.out.println("Le agreganos un entero al principio y otro al final...");
 System.out.println(enteros);
 System.out.println("Con las modificiaciones, el número de elementos es de: "+ enteros.size());
    }
}