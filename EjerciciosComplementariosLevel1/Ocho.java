import java.util.Scanner;

public class Ocho {
    public static void main(String[] args)   {
        Scanner entradaScanner = new Scanner(System.in); 
        System.out.print("Ingrese su nombre: ");
        String nombre = entradaScanner.nextLine(); 
        System.out.print("Ingrese su edad: ");
        int edad = entradaScanner.nextInt();
        Scanner entradaScanner2 = new Scanner(System.in); 
        System.out.print("Ingrese su dirección: ");
        String direccion = entradaScanner2.nextLine(); 
        System.out.print("Ingrese su ciudad: ");
        String ciudad = entradaScanner2.nextLine(); 

        System.out.print(nombre + " - " + edad + " - " + direccion + " - " + ciudad);
    }
    
}


