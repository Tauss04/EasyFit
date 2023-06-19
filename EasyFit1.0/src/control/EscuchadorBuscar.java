package control;
import modelo.Buscador;
import modelo.ListaGimnasios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ListaMostrarGimnasios;

import javax.swing.JFrame;
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
	private JFrame ventanaFormulario;
	
	public EscuchadorBuscar(ListaGimnasios l, JFrame ventanaFormulario) {
		this.listaComp=l;
		this.ventanaFormulario=ventanaFormulario;
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
		if (bus.buscar()=="ERROR") {
			System.out.println("salta Alerta");
			listaFin.ocultar();
		} else {
			if(bus.buscar()=="Gimnasio encontrado: ") {
				listaFin.noResult();
				listaFin.mostrar();
				ventanaFormulario.setVisible(false);
			}else{
				listaFin.setGimnasios(bus.buscar());		
				listaFin.mostrar();
				ventanaFormulario.setVisible(false);
			}
		}
		
		
	}
}
