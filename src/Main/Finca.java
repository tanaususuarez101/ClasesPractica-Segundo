package Main;

public class Finca implements Comparable {
	
	private String nombre;
	private String tipo;
	private Double cuota;
	
	public Finca(String nombre, String tipo, Double cuota) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.cuota = cuota;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public Double getCuota() {
		return this.cuota;
	}
	
	public String toString() {
		return "[Nombre: " + this.nombre + ", Tipo: " +  this.tipo + ", cuota: " + this.cuota + "]";
	}

	public int compareTo(Object nom) {
		
		if(nom instanceof Finca) {
			Finca finca = (Finca)nom;
			
			if(this.nombre.compareTo(finca.getNombre()) > 0) {
				return 1;
			} else if(this.nombre.compareTo(finca.getNombre()) < 0){
				return -1;
			}
		}
		return 0;
		
	}
	
	public boolean equals(Object nom) {
		if(nom instanceof Finca) {
			Finca finca = (Finca)nom;
			if(this.nombre.equals(finca.getNombre())) {
				return true;
			}
		}
		return false;
	}
	
}
