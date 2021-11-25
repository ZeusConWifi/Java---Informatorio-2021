package Ejercicio5;
import java.time.LocalDate;

public class Alumnos {
    private String nombre;
    private String apellido;
    private LocalDate cumple;

    public Alumnos(String nombre, String apellido, LocalDate cumple) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cumple = cumple;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getCumple() {
        return cumple;
    }

    public void setCumple(LocalDate cumple) {
        this.cumple = cumple;
    }
}