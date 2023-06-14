package control;
import modelo.Buscador;
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
	private ListaMostrarGimnasios lista;
	
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
		
		
		lista = new ListaMostrarGimnasios();
		boolean error = bus.hayError();
		if(error==false) {
			if(bus.buscar()=="Gimnasio encontrado: ") {
				lista.noResult();
				lista.mostrar();
			}else {
				lista.setGimnasios(bus.buscar());		
				lista.mostrar();
			}
		}else {
			System.out.println("salta Alerta");
		}
	}
}
