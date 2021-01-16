package ExamenExtra;

import java.util.*;

public class TouristPackage extends TouristProduct {
	
	private double precio;
	private double descuento;
	private ArrayList<TouristProduct> listaProduct;
	
	public TouristPackage(String nombre, String descripcion, double precio) {
		super(nombre, descripcion);
		this.precio = precio;
		this.listaProduct = new ArrayList <TouristProduct>();
	}
	
	public boolean add(TouristProduct touristProduct) {
		if(!listaProduct.contains(touristProduct)) {
			return listaProduct.add(touristProduct);
		}
		return false;
	}
	
	public boolean remove(String nombre) {
		for(int i=0; i<listaProduct.size(); i++) {
			if(listaProduct.get(i).getName().equals(nombre)) {
				listaProduct.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public List<TouristProduct> getProducts(){
		ArrayList<TouristProduct> lista = new ArrayList <TouristProduct>();
		for(TouristProduct e: listaProduct) {
			lista.add(e);
		}
		return lista;
	}
	
	@Override	
	public String toString() {
		String aux = this.nombre + ": " + this.descripcion;
		for(int i=0; i<listaProduct.size(); i++) {
			aux += " [" + listaProduct.get(i).getName() + ", " + listaProduct.get(i).getPriceWithDiscount() + "€] ";
		}
		return aux;
	}
	
	public void setDiscount(double descuento) {
		this.descuento = descuento;
	}	
	
	@Override
	public double getPrice() {
		return this.precio;
	}
	
	@Override
	public double getPriceWithDiscount() {
		return this.precio - (this.precio*this.descuento);
	}
	
	@Override
	public double getDiscount() {
		return this.descuento;
	}
}
