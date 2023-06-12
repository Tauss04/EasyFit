package modelo;

import java.util.ArrayList;

import vista.AlertaFormulario;

public class Buscador {
	private String calleS;
	private String numeroS;
	private String codigoPostal;
	private ArrayList listaComp;
	
	public Buscador(String calle,String numero, String codigoPostal) {		
		this.calleS=calle;
		this.codigoPostal=codigoPostal;
		
		
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
	
	public String buscar(){
		String datosGymS="Gimnasio encontrado: ";
		boolean error = false;		
		for(int i=0;i<listaComp.size();i++) {
			Gimnasio nuevo=(Gimnasio) listaComp.get(i);
			String cp=nuevo.getCP();
			System.out.println("DEBUG 1: "+cp);
			
			//QUITO LAS ULTIMAS 2 CIFRAS DEL CP Y LAS DEJO EN 00 PARA COMPARAR LA CIUDAD UNICAMENTE
			
			//Si el usuario no completa el campo codigoPostal 
			//salta excepcion por que no puede pasar a int un String vacio
			//por lo que si salta tengo una bandera que si es true aparece una ventana Informativa al usuario
			try {
				int cpUsuario= Integer.parseInt(codigoPostal);
				
				cpUsuario=(cpUsuario/100)*100;
				String cpUsuarioS=Integer.toString(cpUsuario);
				
				if(cp.equals(cpUsuarioS)) {								
					datosGymS=datosGymS+"\n"+nuevo.getNombre()+" "+nuevo.getCalle();	
					System.out.println("DEBUG 2: ");
				}
			}catch(NumberFormatException ex) {
				error=true;
			}			
		}
		if(error==true) {
			AlertaFormulario a1 = new AlertaFormulario();
			a1.mostrar();
		}
		return datosGymS;
	}
	
	
	
}
