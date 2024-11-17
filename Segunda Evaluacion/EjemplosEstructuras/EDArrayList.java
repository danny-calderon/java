import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class EDArrayList{
	public static void main (String[] args){

	ArrayList<String> diasSemana = new ArrayList<String>();
	ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	diasSemana.add("Lunes");
	diasSemana.add("Martes");
	diasSemana.add("Miércoles");
	diasSemana.add("Jueves");
	diasSemana.add("Viernes");
	diasSemana.add("Sabado");
	diasSemana.add("Domingo");

	for (int i=1; i<=10;i++){
		numeros.add(i);
	}
		
		System.out.println("Iteramos con Iterator");

		Iterator<String> ital = diasSemana.iterator();
		while (ital.hasNext()){
		System.out.println(ital.next()); }

		Iterator<Integer> ital1 = numeros.iterator();
		while (ital1.hasNext()){
		System.out.println(ital1.next()); }

		
		Collections.sort(diasSemana);
		Collections.sort(numeros,Collections.reverseOrder());
		
		System.out.println("Iteramos con foreach");
		for (String dia : diasSemana) {
		System.out.println(dia); }

		for (Integer numero : numeros) {
		System.out.println(numero); }
	}
}