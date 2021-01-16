package ExamenExtra;

import java.util.*;

public class Sales {
	
	private ArrayList<Sale> lista;
	
	public Sales() {
		lista = new ArrayList<Sale>();
	}
	
	public void add(Sale sale){
        lista.add(sale);
    }
	
	public void remove(int pos) {
		lista.remove(pos);
	}
	
	public double totalSales(String nombre) {
		double total = 0;
		for(Sale elemento: lista) {
			if(elemento.getName().equals(nombre)) {
				total += elemento.getPrice();
			}
		}
		return total;
	}
	 public List<Sale> salesOrderByPrice(int n){
		 ArrayList<Sale> listaOrder = new ArrayList<Sale>();
		 
		 Collections.sort(lista, new Comparator<Sale>(){
			 @Override
			 public int compare(Sale s1, Sale s2) {
				 if(s1.getPrice() == s2.getPrice()){
					return s1.getName().compareTo(s2.getName());
				 }
				 if(s1.getPrice() > s2.getPrice()) {
					 return 1;
				 }
				 return -1;
			 }
		 });
		 
		 for(int i = 0; i < n; i++) {
			 listaOrder.add(lista.get(i));
		 }
		 return listaOrder;
	 }
	 
	 public List<Sale> getAllSales(){
		 return lista;
	 }
}
