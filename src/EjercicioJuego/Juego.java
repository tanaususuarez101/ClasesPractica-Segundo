package EjercicioJuego;

public class Juego implements Venta, Comparable<Juego> {

	String titulo;
	String Descripcion;
	String plataforma;
	
	private int id;
	private Double precio;
	
	
	public Juego(String titulo, String descripcion, String plataforma, int id) {
		this.titulo = titulo;
		this.Descripcion = descripcion;
		this.plataforma = plataforma;
		this.id = id;
	}
	
	//Cree un getNombre para poder tener un Set de los nombres en la tienda
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public int getId() {
		return id;
	}
	
	public Double getPrecio() {
		return precio; 
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public int compareTo(Juego juego) {
		return titulo.compareTo(juego.titulo) ;
	}
	
	
}
