package EjercicioConcecionario;
import java.util.*;

public class Concesionario {
	public static void main(String[] args) {
		
		Extra extra1 = new Extra("21", 50.0, "Neumatico");
		Extra extra2 = new Extra("72", 70.0, "Pastilla de Frenos");
		Extra extra3 = new Extra("131", 80.0, "Embrague");
		
		ArrayList<Extra>lista1 = new ArrayList<Extra>();
		
		Vehiculo vehiculo2 = new Vehiculo("5232Z", 11000.2, "Seat", "Ibiza" );
		
		lista1.add(extra1);
		lista1.add(extra3);
		
		Vehiculo vehiculo1 = new Vehiculo("32", 5552.5, "Opel", "Corsa", lista1);
		System.out.println(vehiculo1.dameNombre());
		
		System.out.println(vehiculo1.toString());
		
		lista1.add(extra2);
		vehiculo1.addExtra(extra2);
		
		System.out.println(vehiculo1.toString());
		
		System.out.println(vehiculo1.tieneExtra(extra3));
		
		
		vehiculo2.addExtra(extra2);
		vehiculo2.addExtra(extra2);
		
		Set<Extra>set1= vehiculo1.dameExtra();
		System.out.println(set1);
		
		System.out.println("");
		Venta venta1 = new Venta();
		venta1.addVenta(vehiculo1);
		venta1.addVenta(extra2);
		
		venta1.addVenta(extra2);
		
		for(Vendible e: venta1.masVendidos(3)) {
			System.out.println(e.dameId());
		}
		
	}

}
