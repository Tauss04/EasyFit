package modelo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class EscuchadorBuscar implements ActionListener {		
	private JTextField calle;
	private JTextField numero;
	private JTextField cpostal;
	
	
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
		String scalle=calle.getText();
		String snumero=numero.getText();
		String scpostal=cpostal.getText();
		
		Buscador bus = new Buscador(scalle,snumero,scpostal);
		bus.buscar();
		
		
		System.out.println("Calle introducida: "+scalle);
		System.out.println("Numero introducido: "+snumero);
		System.out.println("CodigoPostal introducido: "+scpostal);
	}
	
}
