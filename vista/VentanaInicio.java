package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Toolkit;


public class VentanaInicio {
	private JFrame ventanaInicio;
	public VentanaInicio() {
		ventanaInicio = new JFrame();
		ventanaInicio.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaInicio.class.getResource("/imagenes/log.jpg")));
		ventanaInicio.setSize(900, 700);
		ventanaInicio.setLocationRelativeTo(null);
		ventanaInicio.setTitle("EasyFit");
		
		ventanaInicio.getContentPane().setBackground(new Color(43, 164, 255));
	
		ventanaInicio.getContentPane().setLayout(new GridBagLayout());
		
		JLabel titulo = new JLabel("Selecciona una opción");
		titulo.setFont(new Font("Helvetica", Font.BOLD, 40));
		GridBagConstraints gbcTitulo = new GridBagConstraints();
        gbcTitulo.gridx = 0; // Columna 0
        gbcTitulo.gridy = 0; // Fila 0
        gbcTitulo.gridwidth = GridBagConstraints.REMAINDER; // Ancho total
        gbcTitulo.anchor = GridBagConstraints.NORTH; // Posicionamos en la parte superior
        gbcTitulo.insets = new Insets(40, 0, 0, 0); // Padding superior
        gbcTitulo.weighty = 1.0;
        
        ventanaInicio.getContentPane().add(titulo,gbcTitulo);
        
        JButton iniciarSesion = new JButton("Iniciar Sesión");
        
        iniciarSesion.setFont(new Font("Helvetica", Font.PLAIN,18));
        
        GridBagConstraints gbcInicio = new GridBagConstraints();
        gbcInicio.gridx=1;
        gbcInicio.gridy=1;
        gbcInicio.gridwidth= GridBagConstraints.REMAINDER;
        gbcInicio.anchor= GridBagConstraints.CENTER;
        gbcInicio.insets = new Insets(0,0,300,0);
        gbcInicio.weighty = 1.0;
        iniciarSesion.setPreferredSize(new Dimension(200,50));
        
        ventanaInicio.getContentPane().add(iniciarSesion,gbcInicio);
        
        JButton registro = new JButton("Registrarme");
        registro.setFont(new Font("Helvetica",Font.PLAIN,18));
        
        GridBagConstraints gbcRegistro = new GridBagConstraints();
        gbcRegistro.gridx=1;
        gbcRegistro.gridy=1;
        gbcRegistro.gridwidth= GridBagConstraints.REMAINDER;
        gbcRegistro.anchor= GridBagConstraints.CENTER;
        gbcRegistro.insets = new Insets(0,0,150,0);
        gbcRegistro.weighty = 1.0;
        registro.setPreferredSize(new Dimension(200,50));
        
        ventanaInicio.getContentPane().add(registro,gbcRegistro);
	}
	public void mostrar() {
		ventanaInicio.setVisible(true);
	}
}
