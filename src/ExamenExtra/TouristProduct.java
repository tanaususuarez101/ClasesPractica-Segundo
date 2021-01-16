package ExamenExtra;

public abstract class TouristProduct {
	
	String nombre;
	String descripcion;
	
	public TouristProduct(String nombre, String descripcion){
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public String getName() {
		return this.nombre;
	}
	
	public String getDescription() {
		return this.descripcion;
	}
	
	public abstract double getPrice();
	
	public abstract double getPriceWithDiscount();
	
	public abstract double getDiscount();
	
	public String toString() {
		return this.nombre + ": " + this.descripcion + " " + this.getDiscount() + "€";
	}
	@Override
	//Creo mi propio equals para poder eliminar un TouristProduct mediante el nombre
	public boolean equals(Object nom) {
		if(nom instanceof TouristProduct) {
			TouristProduct touristProduct = (TouristProduct)nom;
			if(this.nombre.equals(touristProduct.getName())) {
				return true;
			}
		}
		return false;
	}
}
