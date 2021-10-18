import java.util.*;

public class Cuatro {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();
    alumnos.add("Juan Bautista Alberdi");
    alumnos.add("José de San Martín");
    alumnos.add("Manuel Belgrano");
    alumnos.add("Mariano Moreno");
    alumnos.add("Justo José de Urquiza");
    alumnos.add("Manuel Dorrego");
    alumnos.add("Juan Manuel de Rosas");
    alumnos.add("Alfredo Palacios");
    alumnos.add("Juan B. Justo");
    alumnos.add("Alicia Moreau de Justo");    
    alumnos.add("Lisandro de la Torre");
    alumnos.add("Mario Bravo");   
    System.out.println("Listado de alumnos: ");
    System.out.println(alumnos);

List<String> head = alumnos.subList(0, 4);
List<String> midlList = alumnos.subList(4, 8);
List<String> tail = alumnos.subList(8, 12);
System.out.println("Dividimos en tres cursos..."); 
System.out.println("Primer curso: "); 
System.out.println(head); 
System.out.println("Segundo curso: "); 
System.out.println(midlList); 
System.out.println("Tercer curso: "); 
System.out.println(tail);
    
}
}