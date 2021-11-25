import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> superheroes = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "Brainiac", "Hulk");
        Long contador = superheroes.stream()
                        .filter(p -> p.startsWith("B") || p.startsWith("b"))
                        .count();
        System.out.println(contador);
    }
}