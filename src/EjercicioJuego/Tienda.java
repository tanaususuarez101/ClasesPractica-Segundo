package EjercicioJuego;

import java.util.*;

import Main.Finca;

public class Tienda {
	
	ArrayList<Juego> estanteria; 
	private int orden;
	
	
	public Tienda() {
		this.estanteria = new ArrayList<Juego>(); 
	}
	
	public boolean add(Juego juego) {
		if(!estanteria.contains(juego)) {
			estanteria.add(juego);
			return true;
		}
		return false;
	}
	
	public void setOrder(int id) {
		this.orden = id;
		
	}
	
	public List<Juego> getList(){	
		if(this.orden == 0) {
			Collections.sort(estanteria, new Comparator<Juego>() {
				@Override
				public int compare(Juego j1, Juego j2) {
					return j1.compareTo(j2);
				}
			});
			
		} else {
			Collections.sort(estanteria, new Comparator<Juego>() {
				@Override
				public int compare(Juego j1, Juego j2) {
					return j2.compareTo(j1);
				}
			});
		}
		return estanteria;
	}
	
	public Set<String> setNombre(){
		Set<String> setDeString = new HashSet<String>();
		
		for(int i = 0; i < estanteria.size(); i++) {
			setDeString.add(estanteria.get(i).getTitulo());					
		}
		
		return setDeString;
	}
	
}
