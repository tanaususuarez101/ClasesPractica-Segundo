package Contenedor;

import java.util.*;

public class HashMapEjemplo {
	
	/*
	 * 
	
	Ideas del objecto HashMap:
	
	1. Un Map es una colección de parejas formadas por claves y valores, estableciendo una correspondencia entre cada clave y su valor
	2. Un mapa no puede contener claves repetidas
	3. Un sortedMap además mantiene ordenado los elementos por la clave
	
	relacion: Clave => valor
	
	metodos son diferente a las de set y a las list, esto son:
	- put(clave, valor) : añade un nuevo valor
	- get (clave): Devuelve el elemento asociado a la clave
	- remome (clave): elimina el elemento asoaciado a la clave
	- size(): devuelve el número de elementos 
	- clear(): limpia la colección, la vacía.
	
	Funciones utiles para recorrer los MAP:
	- set keySet(): Devuelve una colección en forma de set de trodas las clave del HashMap
	- set entrySet(): Devuelve un set Entry (objecto clave valor)
	- collection values(): devuelve una colección de valores de mapas
	
	Implementaciones:
	- HashSet
	- HashMap
	
	 * */
	
	/**
	 * Siguiendo con el ejemplo de set
	 * 
	 * */
	
	public static void main(String[] args) {
		
		class Coche {
			public String marca;
			public String modelo;
			public String color;
			
			public Coche(String marca, String modelo, String color) {
				this.marca = marca;
				this.modelo = modelo;
				this.color = color;
			}
			
			public String toString() {
				return "Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color;
			}
			
		}
		
		Map <Integer, Coche> coleccionCoche = new HashMap<Integer, Coche>();
		
		coleccionCoche.put(1, new Coche("Renault", "Clio", "Rojo"));
		coleccionCoche.put(2, new Coche("Renault", "Clio", "Rojo")); 
		coleccionCoche.put(3, new Coche("Peugeot", "208", "Amarillo"));
		coleccionCoche.put(4, new Coche("Peugeot", "308", "Gris"));
		coleccionCoche.put(5, new Coche("Opel", "Corsa", "verde"));
		coleccionCoche.put(5, new Coche("Opel", "Astra", "Azul")); // no se añade, por que está repetido su clave
		
		System.out.println("Numero de elemento añadidos: " + coleccionCoche.size());
		System.out.println();
		
		// Los Map hay que tener cuidado al recorrerlo, por que no se hacen de forma habitual
		
		for (Integer clave: coleccionCoche.keySet()) {
			
			Coche coche = coleccionCoche.get(clave);
			System.out.println("La clave es: " + clave + "  y el valor es:\n    "+coleccionCoche.get(clave));
		}
		
		
		Map <String, Coche> cochesMatrivulados = new HashMap<String, Coche>();
		
		
		cochesMatrivulados.put("9827GW", new Coche("Renault", "Clio", "Rojo"));
		cochesMatrivulados.put("9827GW", new Coche("Renault", "Clio", "Rojo")); 
		System.out.println();
		for (String clave: cochesMatrivulados.keySet()) {
			
			Coche coche = cochesMatrivulados.get(clave);
			System.out.println("La clave es: " + clave + "  y el valor es:\n    "+cochesMatrivulados.get(clave));
		}
		
	}
	
	

}
