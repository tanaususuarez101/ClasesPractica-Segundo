package EjercicioConcecionario;

import java.util.*;

public class Vehiculo extends Vendible {
	
	private String marca;
	private String modelo;
	ArrayList<Extra> extras;
	
	public Vehiculo(String id, double pvp, String marca, String modelo) {
		super(id, pvp);
		this.marca = marca;
		this.modelo = modelo;
		this.extras = new ArrayList<Extra>();
	}
	
	public Vehiculo(String id, double pvp, String marca, String modelo, ArrayList<Extra> extra ) {
		super(id, pvp);
		this.marca = marca;
		this.modelo = modelo;
		this.extras = new ArrayList<Extra>();
		for(Extra e: extra) {
			this.extras.add(e.clone());
		}
	}
	
	public String dameNombre() {
		return this.marca + " " + this.modelo;
	}
	
	public boolean addExtra(Extra extra) {
		if(!extras.contains(extra)) {
			extras.add(extra);
			return true;
		}
		return false;
	}
	
	public boolean quitarExtra(Extra extra) {
		for(int i=0; i < extras.size(); i++) {
			if(extras.get(i).equals(extra)) {
				extras.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean tieneExtra(Extra extra) {
		for(int i=0; i < extras.size(); i++) {
			if(extras.get(i).equals(extra)) {
				return true;
			}
		}
		return false;
	}
	
	public Set<Extra> dameExtra(){
		Set<Extra> setExtras = new HashSet<Extra>();
		
		for(int i=0; i < extras.size(); i++) {
			setExtras.add(extras.get(i));
		}
		return setExtras;
	}
	
	public String toString() {
		return "| " + this.marca + " | " + this.modelo + " | " + this.extras + " |";
	}
	
	public Vehiculo clone() {
		return new Vehiculo(id, pvp, marca, modelo);
	}

}
