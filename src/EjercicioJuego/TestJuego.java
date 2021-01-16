package EjercicioJuego;

// Paquetes que hay que importar
import org.junit.*;
import org.junit.runner.JUnitCore;
import static org.junit.Assert.*;

public class TestJuego {
	
	/*
	 *	Como si atributos se tratasen de la clase test, indicamos los objecto que vamos aprobar
	 *  en diferentes clases
	 */
	
	
	private Juego j1, j2, juegoIsNull, j3;
	private Juego j4;
	
	
	@Before
	public void inicializada(){
		j1 = new Juego("Juego 1", "Primer juego", "ps2", 1);
		j2 = new Juego("Juego 1", "Segundo juego", "ps2", 2);
		j3 = new Juego("Juego 3", "Segundo juego", "ps2", 3);
	}
	
	@Ignore
	public void testBasicos() {
		assertTrue(j1.getId() == 1);
		assertTrue(j2.getId() == 2);
		assertTrue(j3.getId() == 3);		
		assertTrue(j1.getPrecio() == null);
		
		j2.setPrecio(2.2);
		assertTrue(j2.getPrecio() == 2.2);
		
		assertTrue(j2.getTitulo().length() > 0);
		
	}
	
	@Test
	public void testNull() {
		
		assertNotNull(j1);
		assertNotNull(j2);
		assertNull(juegoIsNull);
		assertNotNull(j2); //-> debe falla,debido a que j2 está inicializado y no es null línea 2
	}
	
	@Test
	public void testCompareTo() {
		assertTrue(j1.compareTo(j2)==0);
		assertTrue(j2.compareTo(j3) < 0);
	}
	
}
