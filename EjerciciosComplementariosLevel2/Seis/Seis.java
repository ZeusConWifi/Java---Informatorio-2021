package Seis;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Seis {

    public static void main(String[] args) {
        Map<Integer, Integer> Diccionario;
        
        Diccionario = new HashMap<>();

        Set<Empleado> lista ; 
        
        lista = new HashSet<>(); 
        
        lista.add(new Empleado("Leonel", "Messi", 10101010, 8, 352));
        
        lista.add(new Empleado("Rodrigo", "De Paul", 07070707, 7, 310));
        
        lista.add(new Empleado("Marcos", "Acuña", 11111111, 8, 456));
        
        lista.add(new Empleado("Lautaro", "Martínez", 22222222, 9, 440));

        for (Empleado emp : lista) {
            
            int sueldo = emp.calcularSueldo();
            
            Diccionario.put(emp.dni, sueldo);
        }
        System.out.print(Diccionario);
    }
}
