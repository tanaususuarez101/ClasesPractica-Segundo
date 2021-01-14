package ExamenExtra;

import java.util.*;

public class TouristPackage extends TouristProduct {
	
	private double precio;
	private double descuento;
	ArrayList<TouristPackage> listaPackage;
	
	public TouristPackage(String nombre, String descripcion, double precio) {
		super(nombre, descripcion);
		this.precio = precio;
		this.listaPackage = new ArrayList <TouristPackage>();
	}
	
	public boolean add(TouristProduct touristProduct) {
		if(!listaPackage.contains(touristProduct)) {
			listaPackage.add(touristProduct);
			return true;
		}
		return false;
	}
	
	public boolean remove(String nombre) {
		for(int i=0; i<listaPackage.size(); i++) {
			if(listaPackage.get(i).equals(nombre)) {
				listaPackage.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public List<TouristProduct> getProducts(){
		ArrayList<TouristProduct> listaProduct = new ArrayList <TouristProduct>();
		
		return listaProduct;
	}
	
	public String toString() {
		return /*this.nombre + ": " + this.descripcion +*/ this.getProducts() + " " + this.getDiscount() + "€";
	}
	
	public void setDiscount(double descuento) {
		this.descuento = descuento;
	}	
	
	public double getPrice() {
		return this.precio;
	}
	
	public double getPriceWithDiscount() {
		return this.precio - (this.precio*this.descuento);
	}
	
	public double getDiscount() {
		return this.descuento;
	}
}
