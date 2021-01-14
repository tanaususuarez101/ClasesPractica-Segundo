package EjercicioConcecionario;

import java.util. *;

public class Venta {
	
	
	Map<Vendible, Integer> lista; 
	
	
	public Venta() {
		this.lista = new HashMap<Vendible, Integer>();
	}
	
	public double total() {
		double suma = 0.0;
		 
		for(Vendible e: lista.keySet()) {
			suma += e.damePVP();
		}
		return suma;
	}
	
	public List<Vendible> lista(){
		ArrayList<Vendible> listaCopia = new ArrayList<Vendible>();
		for(Vendible e: lista.keySet()) {
			listaCopia.add((Vendible)e.clone());
		}
		return listaCopia;
	}
	
	
	/* [camiseta => 3, pantalones => 2, calcetines => 5, gorro => 2, guantes => 7]
	 * 
	 * 
	 */
	
	public List<Vendible> masVendidos(int n){
		ArrayList<Vendible> masVendidos = new ArrayList<Vendible>();
		Vendible claveAux = null;
		Integer valor = 0;
		for(Vendible clave: lista.keySet()) {
			valor = lista.get(clave);
			claveAux = clave;
			for(Vendible clave2: lista.keySet()) {				
				if(valor < lista.get(clave2)) {
					claveAux = clave2;
					valor = lista.get(clave2);
				}
			}
			masVendidos.add(claveAux);
				
		}
		
		return masVendidos;
	}

	public List<Vendible> masVendidos(){
		ArrayList<Vendible> masVendidos = new ArrayList<Vendible>();
		for(Vendible clave: lista.keySet()) {
			
		}
		return masVendidos;
	}
	
	public int numeroVentas() {
		return lista.size();
	}
	/*
	public String toString() {
		return 
	}*/
	
	public boolean addVenta(Vendible venta) {
		
		if(!lista.containsKey(venta)) {
			lista.put(venta, 1);
		} else {
			lista.put(venta, lista.get(venta)+1);
		}
		return false;
	}
	
	

}
