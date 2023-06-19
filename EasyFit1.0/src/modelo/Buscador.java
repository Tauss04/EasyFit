package modelo;

import java.util.ArrayList;

import vista.AlertaFormulario;

public class Buscador {
	private String calleS;
	private String numeroS;
	private String codigoPostal;
	private boolean error=false;
	private ArrayList<Gimnasio> listaComp;
	
	public Buscador(String calle,String numero, String codigoPostal) {		
		this.calleS=calle;
		this.codigoPostal=codigoPostal;		
	}
	public void pasoLista(ListaGimnasios lista) {
		listaComp=lista.pasoLista();
	}
	
	public String buscar(){
		String datosGymS="Gimnasio encontrado: ";		
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
				datosGymS="ERROR";			
			}			
		}
		
		if(datosGymS=="ERROR") {
			AlertaFormulario a1 = new AlertaFormulario();
			a1.mostrar();
		}
		return datosGymS;
		
		
	}			
}
