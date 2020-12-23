package Main;

import java.util.*;

public class Propietario {
	
	private String nombre;
	private ArrayList <Finca> listaFincas;
	
	
	public Propietario(String nombre) {
		this.nombre=nombre;
		this.listaFincas=new ArrayList<Finca>();
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Finca getFinca(String nombre) {
		
		for(int i=0; i<listaFincas.size(); i++) {
			if(listaFincas.get(i).getNombre().equals(nombre)) {
				return listaFincas.get(i);
			}
		}
		return null;
	}
	
	public boolean addFinca(Finca finca) {
		
		if(!listaFincas.contains(finca)) {
			listaFincas.add(finca);
			return true;
		}
		return false;
	}
	
	public boolean removeFinca(String nombre) {
		
		for(int i=0; i<listaFincas.size(); i++) {
			if(listaFincas.get(i).getNombre().equals(nombre)) {
				listaFincas.remove(i);
				return true;
			}
		}
		return false;
	}
		
	
	public List<Finca> getFinca() {
		return listaFincas;
	}
	
	public double CuotaTotal() {
		
		double suma = 0.0;
		
		for(int i=0; i < listaFincas.size(); i++) {
			suma += listaFincas.get(i).getCuota();
		}
		
		return suma;
	}
	

	public String toString() {
		String representa = this.nombre + "\n";
		
		for(int i=0; i<listaFincas.size(); i++){
			representa += i+1 + "-" + listaFincas.get(i).toString() + "\n";
		}
		return representa;
	}	
	
	
	
	
	
	
	
	

}
