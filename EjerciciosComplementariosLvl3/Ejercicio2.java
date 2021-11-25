import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 3, 5, 7, 9);
        Integer potencia  = 2;
        List<Integer> nrosPotenciados = numeros.stream()
                                               .map(p-> Ejercicio2.calcularPotencia(p, potencia))
                                               .collect(Collectors.toList());
        System.out.println(nrosPotenciados);
    }

    public static Integer calcularPotencia(Integer numero, Integer potencia) {
        if (potencia == 0){
            return 1;
        }else {
            return numero * calcularPotencia(numero, potencia-1);
        }
    }
}