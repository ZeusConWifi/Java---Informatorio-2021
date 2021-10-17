import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Uno {
    private static ArrayList<Integer> arrayListInt = new ArrayList<>();
	private static ArrayList<Ciudad> ciudades = new ArrayList<>();
	public static void main(String args[]) {
    
		ciudades.add(new Ciudad("Mendoza", 1));
	    ciudades.add(new Ciudad("Mar Del Plata", 2));
		ciudades.add(new Ciudad("Córdoba", 3));

		System.out.println("\nRanking de ciudades argentinas:");
		Collections.sort(ciudades, new Comparator<Ciudad>() {
			@Override
			public int compare(Ciudad c1, Ciudad c2) {
				return new Integer(c1.getPrefe()).compareTo(new Integer(c2.getPrefe()));
			}
		});
		printArrayListCiudad();
	}

	private static void printArrayListInt() {
		Iterator<Integer> itrArrayList = arrayListInt.iterator();
		int posicion = 1;
		while (itrArrayList.hasNext()) {
			System.out.println("Posicion(" + posicion + ") = " + itrArrayList.next());
			posicion++;
		}
	}

	private static void printArrayListCiudad() {
		Iterator<Ciudad> itrArrayList = ciudades.iterator();
		int posicion = 1;
		while (itrArrayList.hasNext()) {
			System.out.println("Posicion(" + posicion + ") = " + itrArrayList.next().toString());
			posicion++;
		}
	}

}

class Ciudad {

	private String nombre;
	private int prefe;

	public Ciudad() {
	}

	public Ciudad(String nombre, int prefe) {
		this.nombre = nombre;
		this.prefe = prefe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrefe() {
		return prefe;
	}

	public void setPrefe(int prefe) {
		this.prefe = prefe;
	}

	@Override
	public String toString() {
		return "#" + this.getPrefe() + "  -  " + this.getNombre();
	}
}
