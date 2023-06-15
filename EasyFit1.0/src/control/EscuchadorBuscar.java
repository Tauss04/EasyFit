package control;
import modelo.Buscador;
import modelo.ListaGimnasios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ListaMostrarGimnasios;
import javax.swing.JTextField;

public class EscuchadorBuscar implements ActionListener {	
	private JTextField calle;
	private JTextField numero;
	private JTextField cpostal;
	private String scalle="0";
	private String snumero="0";
	private String scpostal;
	private ListaMostrarGimnasios listaFin;
	private ListaGimnasios listaComp;
	
	public EscuchadorBuscar(ListaGimnasios l) {
		this.listaComp=l;
	}
	
	public void setCalle(JTextField calle) {
		this.calle=calle;
	}
	public void setNumero(JTextField numero) {
		this.numero=numero;
	}
	public void setCpostal(JTextField cpostal) {
		this.cpostal=cpostal;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		 scalle=calle.getText();
		 snumero=numero.getText();
		 scpostal=cpostal.getText();
		 
		 
		//Si se encuentran Gimnasios se muestra una lista con los gimnasios
		//Si no se encuentran se muestra una lista con un mensaje
		
		Buscador bus = new Buscador(scalle,snumero,scpostal);
		bus.pasoLista(listaComp);
		
		listaFin = new ListaMostrarGimnasios();
		boolean error = bus.hayError();
		if(error==false) {
			if(bus.buscar()=="Gimnasio encontrado: ") {
				listaFin.noResult();
				listaFin.mostrar();
			}else {
				listaFin.setGimnasios(bus.buscar());		
				listaFin.mostrar();
			}
		}else {
			System.out.println("salta Alerta");
		}
	}
}
