package Contenedor;

import java.util.*;

public class ArrayListEjemplo {

	public static void main(String[] args) {
		// List -> ArrayList: está contruido sobre un array
		//		-> LinkedList: está contruido sobre los objectos node
		// add(Objecto nuevo)
		// remove(int posicion)
		// get(int posicion)
		// set(int posicion, objecto nuevo)
		// size(): devuelve el número de elementos  que tiene el contenedor
		
		List<String> nombres2 = new ArrayList<String>();
		ArrayList<String> nombres = new ArrayList<String>();
		List<Integer> nombres3 = new LinkedList<Integer>();
		LinkedList<Integer> nombres4 = new LinkedList<Integer>();

		// Caracteristicas de las listas: Hay elementos repetidos y no están ordenados
		nombres.add("estas");
		nombres.add("Hola");
		nombres.add("mundo");
		nombres.add("Como");
		nombres.add("Como");
		
		
		for (int posicion = 0; posicion < nombres.size(); posicion++) {
			System.out.println("La posicion "+ posicion + " Tiene el valor: "+ nombres.get(posicion));
		}
		
		nombres.remove(3);
		System.out.println();
		for(String valor: nombres) {
			System.out.println(valor);
		}
		
		System.out.println();
		Iterator<String> ite = nombres.iterator();
		while(ite.hasNext()) {
			String elemento = ite.next();			
			if (elemento.equals("estas")) {
				
				ite.remove();
			}			
		}
		for(String valor: nombres) {
			System.out.println(valor);
		}
	}

}
