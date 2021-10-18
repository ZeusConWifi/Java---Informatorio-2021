import java.util.Scanner;
import java.util.ArrayList;


import java.util.Scanner;
import java.util.ArrayList;

public class Cinco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);       
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();       
        ArrayList<Integer> valorHora = new ArrayList<Integer>();       
        ArrayList<Integer> totalDia = new ArrayList<Integer>();        
        int valor = 0;       
        int sumaFinal = 0;       
        int dias = 1;

        while (dias < 6){            
            System.out.println("¿Cuantas horas se trabajó el dia #" + dias +"?");           
            valor = scan.nextInt();           
            horasTrabajadas.add(valor);
            System.out.println("¿Cuanto vale cada hora trabajada del dia #" + dias +"?");           
            valor = scan.nextInt();           
            valorHora.add(valor);        
            dias++;
        }
        scan.close();

        for (int dia = 0; dia < valorHora.size(); dia++) {     
            valor = valorHora.get(dia) * horasTrabajadas.get(dia);     
            totalDia.add(valor);
        }

        for (int i :totalDia){         
            sumaFinal += i;
        }

        System.out.println("El monto a cobrar por dia será de: " + totalDia);      
        System.out.println("El monto semanal será de: " + sumaFinal);
    }
}
