package EjercicioConcecionario;

public class Extra extends Vendible {
	
	private String nombre;
	
	public Extra(String id, double pvp, String nombre) {
		super(id, pvp);
		this.nombre = nombre;
	}
	
	public String dameNombre() {
		return this.nombre;
	}
	
	//para poder realizar bien el metodo quitarExtra, necesito hacer mi propio equals
	
	public boolean equals(Object nom) {
		if(nom instanceof Extra) {
			Extra extra = (Extra)nom;
			if(this.nombre.equals(extra.dameNombre())) {
				return true;
			}
		}
		return false;
	}
	
	public Extra clone() {
		Extra extra = new Extra(id, pvp, nombre);
		return extra;
	}
	
	public String toString() {
		return "id= " + this.id + " , nombre= " + this.nombre;
	}
	
}
