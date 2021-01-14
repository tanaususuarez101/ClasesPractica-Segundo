package EjercicioConcecionario;


public abstract class Vendible implements Comparable {
	
	String id;
	double pvp;
	
	public Vendible(String id, double pvp) {
		this.id = id;
		this.pvp = pvp;
	}
	
	public String dameId() {
		return this.id;
	}
	
	public double damePVP() {
		return this.pvp;
	}
	
	public void setPVP(double pvp) {
		this.pvp = pvp;
	}
	
	public abstract String dameNombre();
	
	public abstract Object clone();
	
	
	public int compareTo(Object nom) {
		
		if(nom instanceof Vendible) {
			Vendible vendible = (Vendible)nom;
			
			if(this.id.compareTo(vendible.dameId()) > 0) {
				return 1;
			} else if(this.id.compareTo(vendible.dameId()) < 0){
				return -1;
			}
		}
		return 0;
		
	}

}
