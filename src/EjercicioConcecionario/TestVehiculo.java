package EjercicioConcecionario;

import org.junit.runner.JUnitCore;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

public class TestVehiculo {

	private Vehiculo v1, v2, v3;
	private Extra e1, e2, e3;
	private ArrayList<Extra>lista1 = new ArrayList<Extra>();
	
	@Before
	public void inicializaVehiculo() {
		v1 = new Vehiculo("3242S", 5552.5, "Opel", "Corsa", lista1);
		v2 = new Vehiculo("5232Z", 11000.2, "Seat", "Ibiza");
		v3 = new Vehiculo("87463", 232.1, "Citroen", "Berlingo");
	}
	
	@Before
	public void inicializaExtra() {
		e1 = new Extra("21", 50.0, "Neumatico");
		e2 = new Extra("72", 70.0, "Pastilla de Frenos");
		e3 = new Extra("131", 80.0, "Embrague");
	}
	
	@Test
	public void testConstructor() {
		assertTrue(v1.dameNombre().equals("Opel Corsa"));
		assertTrue(v2.dameNombre().equals("Seat Ibiza"));
		assertTrue(v3.dameNombre().equals("Citroen Berlingo"));
	}
	
	@Test
	public void testNull() {
		assertNotNull(v1);
		assertNotNull(v2);
		assertNotNull(v3);
	}
	
	@Test
	public void testAddExtra() {
		assertTrue(v1.addExtra(e1));
		assertTrue(v2.addExtra(e2));
		assertTrue(v3.addExtra(e1));
	}
	
	@Test
	public void testQuitarExtra() {
		assertFalse(v3.quitarExtra(e1));
	}
	
	@Test
	public void testTieneExtra() {
		v1.addExtra(e1);
		assertTrue(v1.tieneExtra(e1));
		
	}
	
}
