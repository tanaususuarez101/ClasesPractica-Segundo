package ExamenExtra;

public class Hotel extends TouristProduct {
	
	private double precio;
	private double descuento;
	
	public Hotel(String nombre, String descripcion, double precio) {
		super(nombre, descripcion);
		this.precio = precio;
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
