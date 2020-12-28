package Contenedor;

import java.util.*; // <- importante importar el objecto SET y TreeSet que se encuentra dentrro de la biblioteca utils

public class SetEjemplo {
	

	
	public static void main(String[] args) {
		 //set:
		// Caracteristicas: No Hay elementos repetidos
		// sortedSet: Además de no tener elementos no repetidos están ordenados.

		/**
		 * IMPORTANTE: HAY QUE IMPLEMETAR LA INTERFAZ "COMPARABLE<T>" DONDE T ES EL OBJECTO QUE ALMACENA,
		 * RECUERDA: LA ESTRUCTURA DEL MÉTODO QUE HAY QUE IMPLEMENTAR EN LA INTERFAZ COMPARABLE ES LA SIGUIENTE:
		 * @Override
		 * public int compareTo(T objecto){
		 * }
		 * 
		 * ¡¡¡ SI NO LO IMPLEMENTA SE COJE POR DEFECTO EL DE LA CLASE OBJECT, Y ESTE NO FUNCIONA MUY BIEN EN TODOS LOS CASOS !!!!	 
		 */
		
		// URL donde puedes ver las clase implementable de los set,métodos, contructores ya tributos:
		// https://docs.oracle.com/javase/7/docs/api/java/util/Set.html
		
		Set<String> setDeString = new TreeSet<String>(); // ejemplo con la clase String, que ya tiene implementada la interfaz comparable por defecto
		
		
		
		class Coche implements Comparable<Coche>{
			public String marca;
			public String modelo;
			public String color;
			
			public Coche(String marca, String modelo, String color) {
				this.marca = marca;
				this.modelo = modelo;
				this.color = color;
			}
			
			public int compareTo(Coche coche) {
				return marca.equals(coche.marca) ? modelo.compareTo(coche.modelo): marca.compareTo(coche.marca);
				
			}
		}
		
		
		/*
		  
		 En el caso de los Sets existen tres implementaciones fundamentales:

		 1. HashSet: Define el concepto de conjunto (grupo de elementos no repetidos) a través de una estructura Hash . Es el conjunto más habitual.

		 2. TreeSet: Define el concepto de conjunto a través de una estructura de Arbol . Este conjunto se utiliza  en casos en los cuales necesitamos un orden especifico de los elementos.

		 3. LinkedHashSet: Define el concepto de conjunto añadiendo una lista doblemente enlazada en la ecuación que nos asegura que los elementos siempre se recorren de la misma forma. 
		 
		 */
		
		
		
		Set <Coche> setDeCoche = new HashSet<>();
		
		
		
		setDeCoche.add(new Coche("Renault", "Clio", "Rojo"));
		setDeCoche.add(new Coche("Renault", "Clio", "Rojo")); // no se añade, por que está repetido, se hace en base al método compareTo
		setDeCoche.add(new Coche("Peugeot", "208", "Amarillo"));
		setDeCoche.add(new Coche("Peugeot", "308", "Gris"));
		setDeCoche.add(new Coche("Opel", "Corsa", "verde"));
		setDeCoche.add(new Coche("Opel", "Astra", "Azul"));
		
		// Comprobamos si están ordenados según el criterio del compareTo:
		System.out.println("- PRIMER EJEMPLO");
		for (Coche coche: setDeCoche) {
			System.out.println(coche.marca + " " + coche.modelo + " " + coche.color);
		}
		// Para eliminar un elemento de un set debemos conocer que elemento es (esto puede ser un inconveniente):
		setDeCoche.remove(new Coche("Renault", "Clio", "Rojo"));
		System.out.println("\n- Elemento eliminado:");
		for (Coche coche: setDeCoche) {
			System.out.println(coche.marca + " " + coche.modelo + " " + coche.color);
		}
		
		
				
		
		
		
		// ¡importante! los contenedores set no tienen los métodos get, ni set implementados, pero si tiene un metodo denominado, toArray() que nos devuelve un array de Objects
		
		System.out.println("\n- SEGUNDO EJEMPLO");
		Object [] arrayDeSet = setDeCoche.toArray(); 
		for (int i = 0; i< arrayDeSet.length; i++) {
			
			Coche coche = (Coche) arrayDeSet[i]; // Como están  almacenado en un array generico de la clase objecto, los casteamos para especificar y pode usar sus atributos			
			System.out.println(coche.marca + " " + coche.modelo + " " + coche.color);
		}
		
		// si no queremos hacer este paso intermedio y estar haciendo la conversión de array. O por la necesidad de borrar un elemento del set podemos utilizar un iterador.
		
		Iterator itercoche = setDeCoche.iterator();
		while (itercoche.hasNext()) {
			Coche cocheActual = (Coche) itercoche.next(); // devuelve el objecto y pasa al siguiente
			if (cocheActual.modelo.equals("Renault")) {
				setDeCoche.remove(cocheActual); // una opción para borrarlo
				//itercoche.remove(); // o bien esta también vale
				
				//Te preguntaras ¿Por que puedo borrar si está en dos objectos distitnos? se tratan de referencias, cuando se crea iterator, se crea una referencia para cada elemento del contenedor
			}
			
		}
		
		
		System.out.println("\n- TERCER EJEMPLO");
		for (Coche coche: setDeCoche) {
			System.out.println(coche.marca + " " + coche.modelo + " " + coche.color);
		}
		
		
		
		
		/**
		 * LA CLASE SORTEDSET funciona de la misma forma:
		 * URL: https://docs.oracle.com/javase/7/docs/api/java/util/SortedSet.html
		 * este objecto es otra derivación de un set, pero en este caso para ordenar (igual que el TreeSet que se comentó anteriormente)
		 * */
		System.out.println("\n- CUARTO EJEMPLO");
		
		
		SortedSet<Integer> valores = new TreeSet<Integer>();
		
		valores.add(5);
		valores.add(3);
		valores.add(1);
		valores.add(10);
		for (Integer valor: valores) {
			System.out.println(valor);
		}
		
		
	}
	
	
	
}


