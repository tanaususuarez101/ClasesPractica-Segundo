package ExamenExtra;

public class Flight extends TouristProduct {
	
	private double precio;
	private boolean descuento;
	
	public Flight (String nombre, String descripcion, double precio) {
		super(nombre, descripcion);
		this.precio = precio;
	}
	
	public void setResident(boolean descuento) {
		this.descuento = descuento;
	}
	
	@Override
	public double getPrice() {
		return this.precio;
	}
	
	@Override
	public double getPriceWithDiscount() {
			return this.precio - this.precio * this.getDiscount();
	}
	
	@Override
	public double getDiscount() {
		if(this.descuento) return 0.75;
		else return 0;
	}
	
}