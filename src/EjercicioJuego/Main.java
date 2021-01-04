package EjercicioJuego;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Tienda oliver = new Tienda();
		
		Juego play = new Juego ("Fifa", "juego de futbol", "ps4", 323);
		Juego mesa = new Juego ("Monopoly", "el que no se arruine gana", "carton", 013);
		
		oliver.add(play);
		oliver.add(mesa);
		oliver.setOrder(1);
		List<Juego>lista1 = oliver.getList();
		for(Juego juego: lista1) {
			System.out.println(juego.titulo + ", " + juego.Descripcion + ", " + juego.plataforma + ", " + juego.getId());			
		}
		
		Set<String>set1= oliver.setNombre();
		System.out.println(set1);
	}

}
