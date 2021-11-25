package Ejercicio5;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;
import java.time.Period;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumnos> alumnos = List.of(
                new Alumnos("Freddie", "Mercury", LocalDate.of(1943, 9, 5)),
                new Alumnos("Gordon", "Summer", LocalDate.of(1951, 10, 2)),
                new Alumnos("Roger", "Waters", LocalDate.of(1943, 9, 6)),
                new Alumnos("Marlon", "Brando", LocalDate.of(1924, 4, 3)),
                new Alumnos("Alfredo", "Pacino", LocalDate.of(1940, 4, 25)),
                new Alumnos("Michael", "Jordan", LocalDate.of(1963, 2, 17)),
                new Alumnos("Diego", "Maradona", LocalDate.of(1960, 10, 30)),
                new Alumnos("Roger", "Federer", LocalDate.of(1981, 8, 8)));
        Map<String, Integer> alumnosEdades = alumnos.stream()
                .collect(Collectors
                        .toMap(p-> (p.getNombre() + " " + p.getApellido()),
                                p -> Ejercicio5.getEdad(p.getCumple())));
        System.out.println(alumnosEdades);
    }

    public static Integer getEdad(LocalDate cumple){
        return Period.between(cumple, LocalDate.now()).getYears();
    }
}