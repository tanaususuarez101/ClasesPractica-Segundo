package Main;

public class ComunidadpropietarioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Finca finca1 = new Finca ("Pantoja", "Rustica", 23.2);
		System.out.println(finca1);
		
		Finca finca2 = new Finca ("Condomina", "Industrial", 421.2);
		System.out.println(finca2);
		
		Propietario pro1 = new Propietario("Pepe");
		
		pro1.addFinca(finca1);
		pro1.addFinca(finca2);
		System.out.println(pro1);
		
	}

}
