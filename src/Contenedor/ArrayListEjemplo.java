package Contenedor;

import java.util.*;

public class ArrayListEjemplo {

	@SuppressWarnings("unchecked")
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
		
		
		
		
		
		
		// ¿Se puede ordenar una list? Sí utilizando  el método comparator
		// Ejemplo:
		
		
		
		
		
		class Caja <T, O>{
			ArrayList<T> elementos;
			O tamano;
			
			public Caja(O tamano){
				elementos = new ArrayList<T>();
				this.tamano = tamano;
			}
		}
		
		Caja<String,Integer> caja = new Caja<String,Integer>(3);
		Caja<String,Integer> caja1 = new Caja<String,Integer>(3);
		Caja<String,Integer> caja2 = new Caja<String,Integer>(3);
		
		
		
		class Coche implements Comparable<Coche>{ 
			public String marca;
			public String modelo;
			public String color;
			
			public Coche(String marca, String modelo, String color) {
				this.marca = marca;
				this.modelo = modelo;
				this.color = color;
			}
			
			@Override
			public int compareTo(Coche coche) {
				return marca.equals(coche.marca) ? modelo.compareTo(coche.modelo): marca.compareTo(coche.marca);
				
			}
		}
		
		
		System.out.println("\n\nCOMO ORDENAR UN ARRAY LIST");
		
		
		
		List<Coche> listCoches = new ArrayList<Coche>();
		
		listCoches.add(new Coche("Renault", "Clio", "Rojo"));
		listCoches.add(new Coche("Peugeot", "208", "Amarillo"));
		listCoches.add(new Coche("Peugeot", "308", "Gris"));
		listCoches.add(new Coche("Opel", "Corsa", "verde"));
		listCoches.add(new Coche("Opel", "Astra", "Azul"));

		// se han añadido tal y como se han insertado, al final de la lista
		
		// PRIMERA FORMA, implementar directamente el comparator:
		
		Collections.sort(listCoches, new Comparator<Coche>(){
			@Override
			public int compare(Coche c1, Coche c2) {
				return c1.marca.equals(c2.marca) ? c1.modelo.compareTo(c2.modelo): c1.marca.compareTo(c2.marca);
			}
		});
		
		
		for (Coche coche: listCoches) {
			System.out.println(coche.marca + " " + coche.modelo + " " + coche.color);
		}
		
	
		// SEGUNDA FORMA

		class ImplementarOrden implements Comparator<Coche> {
			public int compare(Coche c1, Coche c2) {				
				return c1.marca.equals(c2.marca) ? c1.modelo.compareTo(c2.modelo): c1.marca.compareTo(c2.marca);
			}		
		}
		
		Collections.sort(listCoches);
		
		
		
	}
	
	


}
