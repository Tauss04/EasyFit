package vista;

import javax.swing.JFrame;
import modelo.ListaGimnasios;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class VentanaMenuGimnasio {
	private JFrame vMenuG;
	private ListaGimnasios l;
	public VentanaMenuGimnasio(ListaGimnasios listaGim) {
		this.l=listaGim;
		
		vMenuG = new JFrame();
		vMenuG.setSize(500,500);
		vMenuG.setLocationRelativeTo(null);
		vMenuG.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaMenuGimnasio.class.getResource("/imagenes/log.jpg")));
		vMenuG.getContentPane().setLayout(null);
		
		JButton btnAñadirGimnasio = new JButton("Añadir Gimnasio");
		btnAñadirGimnasio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FormularioAñadirGimnasio f1 = new FormularioAñadirGimnasio(l);
				f1.mostrar();
				vMenuG.setVisible(false);
			}
			
		});
		btnAñadirGimnasio.setBounds(148, 116, 123, 23);
		vMenuG.getContentPane().add(btnAñadirGimnasio);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 35));
		lblNewLabel.setBounds(132, 21, 162, 39);
		vMenuG.getContentPane().add(lblNewLabel);
	}
	
	
	
	
	
	
	
	
	public void mostrar() {
		vMenuG.setVisible(true);
	}
}
