package vista;

import javax.swing.JFrame;
import modelo.ListaGimnasios;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class VentanaMenuGimnasio {
	private JFrame vMenuG;
	private ListaGimnasios l;
	private JFrame ventIni;
	public VentanaMenuGimnasio(ListaGimnasios listaGim,JFrame ventanaInicio) {
		this.l=listaGim;
		this.ventIni=ventanaInicio;
		
		vMenuG = new JFrame();
		vMenuG.getContentPane().setBackground(new Color(43, 164, 255));
		vMenuG.setSize(900,700);
		vMenuG.setLocationRelativeTo(null);
		vMenuG.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaMenuGimnasio.class.getResource("/imagenes/log.jpg")));
		vMenuG.getContentPane().setLayout(null);
		
		JButton btnAñadirGimnasio = new JButton("Añadir Gimnasio");
		btnAñadirGimnasio.setForeground(Color.BLACK);
		btnAñadirGimnasio.setBackground(Color.WHITE);
		btnAñadirGimnasio.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		btnAñadirGimnasio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaInicio.setVisible(false);
				FormularioAñadirGimnasio f1 = new FormularioAñadirGimnasio(l);
				f1.mostrar();
				
			}
			
		});
		btnAñadirGimnasio.setBounds(366, 215, 200, 50);
		vMenuG.getContentPane().add(btnAñadirGimnasio);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 37));
		lblNewLabel.setBounds(359, 37, 207, 39);
		vMenuG.getContentPane().add(lblNewLabel);
		
		JLabel lblDesdeAquPodr = new JLabel("Desde aquí podrá gestionar su negocio");
		lblDesdeAquPodr.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 25));
		lblDesdeAquPodr.setBounds(221, 100, 472, 39);
		vMenuG.getContentPane().add(lblDesdeAquPodr);
		
		JButton btnGestionClientes = new JButton("Gestion clientes");
		btnGestionClientes.setForeground(Color.BLACK);
		btnGestionClientes.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		btnGestionClientes.setBackground(Color.WHITE);
		btnGestionClientes.setBounds(366, 317, 200, 50);
		vMenuG.getContentPane().add(btnGestionClientes);
		
		JButton btnGestionContable = new JButton("Gestion contable");
		btnGestionContable.setForeground(Color.BLACK);
		btnGestionContable.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		btnGestionContable.setBackground(Color.WHITE);
		btnGestionContable.setBounds(366, 411, 200, 50);
		vMenuG.getContentPane().add(btnGestionContable);
		
		JButton btnVolverInicio = new JButton("");
		btnVolverInicio.setIcon(new ImageIcon(VentanaMenuGimnasio.class.getResource("/imagenes/atrascolor.jpg")));
		btnVolverInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vMenuG.setVisible(false);
				ventanaInicio.setVisible(true);
			}
		});
		btnVolverInicio.setForeground(Color.BLACK);
		btnVolverInicio.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
		btnVolverInicio.setBackground(Color.WHITE);
		btnVolverInicio.setBounds(22, 579, 117, 71);
		vMenuG.getContentPane().add(btnVolverInicio);
	}
	
	
	
	
	
	
	
	
	public void mostrar() {
		vMenuG.setVisible(true);
	}
}
