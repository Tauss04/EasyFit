package modelo;

import java.util.ArrayList;

public class ListaGimnasios {
	private ArrayList listaComp;
	
	public ListaGimnasios() {		
		
		listaComp = new ArrayList<Gimnasio>();
		Gimnasio g1 = new Gimnasio("NaturBox","Poligono cunchillos","3","50500");
		Gimnasio g2 = new Gimnasio("ActualFit24","Mosquera de Barnuevo", "10", "42002");
		Gimnasio g3 = new Gimnasio("Spartan","Centro Comercial Camaretas","","42190");
		Gimnasio g4 = new Gimnasio("GalleryGym","Cardenal Frías", "3", "42001");
		Gimnasio g5 = new Gimnasio("Acropolis","Paseo de la Florida", "45", "42004");
		Gimnasio g6 = new Gimnasio("Polideportivo","Avenida la paz","","50500");
				 
		
		listaComp.add(g1);
		listaComp.add(g2);
		listaComp.add(g3);
		listaComp.add(g4);
		listaComp.add(g5);
		listaComp.add(g6);
	}
	
	public void añadirGimnasio(String nombre,String calle,String numero, String cp) {
		Gimnasio g = new Gimnasio(nombre,calle,numero,cp);
		listaComp.add(g);
	}
	
	public ArrayList pasoLista() {
		return listaComp;
	}
	
	
}
