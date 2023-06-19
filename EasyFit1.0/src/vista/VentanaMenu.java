 
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
import modelo.ListaGimnasios;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMenu {	
	private JFrame ventana1;
	private ListaGimnasios listaComp;
	private JFrame ventanaInicio;
	
	public VentanaMenu(ListaGimnasios l, JFrame ventanaInicio) {		
		this.listaComp=l;
		this.ventanaInicio=ventanaInicio;
		
		ventana1 = new JFrame();
		ventana1.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaMenu.class.getResource("/imagenes/log.jpg")));
		ventana1.setSize(900,700);
		ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ventana1.setLocationRelativeTo(null);
	    ventana1.setTitle("EasyFit");		
	    //Color de fondo en RGB AZUL
	    ventana1.getContentPane().setBackground(new Color(43, 164, 255));
        ventana1.getContentPane().setLayout(null);

        // Uso GridBagLayout para posicionar los elementos
        
        
       
        
        // Creo el JLabel del titulo
        JLabel titulo = new JLabel("Bienvenido");
        titulo.setBounds(360, 56, 222, 75);
        titulo.setFont(new Font("Helvetica", Font.BOLD, 40));       
        
        // Creo un objeto GridBagConstraints para posicionar el titulo
        GridBagConstraints gbcTitulo = new GridBagConstraints();
        gbcTitulo.gridx = 0; // Columna 0
        gbcTitulo.gridy = 0; // Fila 0
        gbcTitulo.gridwidth = GridBagConstraints.REMAINDER; // Ancho total
        gbcTitulo.anchor = GridBagConstraints.NORTH; // Posicionamos en la parte superior
        gbcTitulo.insets = new Insets(40, 0, 5, 5); // Padding superior
        gbcTitulo.weighty = 1.0; // El titulo ocupa todo el espacio vertical disponible
       
        ventana1.getContentPane().add(titulo);
    
        //Boton Buscar Gimnasios
        JButton buscarGym = new JButton("BuscarGimnasios");
        buscarGym.setBounds(360, 224, 190, 47);
        buscarGym.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		VentanaFormulario ventana2 = new VentanaFormulario(listaComp);		
        		ventana2.mostrar();
        	}
        });
        buscarGym.setFont(new Font("Helvetica", Font.PLAIN,18));
        
        
        //Nuevo
        
        
       
        GridBagConstraints gbcBuscarGym = new GridBagConstraints();
        gbcBuscarGym.gridx=1;
        gbcBuscarGym.gridy=1;
        gbcBuscarGym.gridwidth= GridBagConstraints.REMAINDER;
        gbcBuscarGym.anchor= GridBagConstraints.CENTER;
        gbcBuscarGym.insets = new Insets(0, 0, 300, 5);
        gbcBuscarGym.weighty = 1.0;
        buscarGym.setPreferredSize(new Dimension(200,50));
        
        ventana1.getContentPane().add(buscarGym);
        
        
        //Boton rutina
        JButton rutina = new JButton("Mis Rutinas");
        rutina.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        rutina.setBounds(360, 322, 190, 47);
        rutina.setFont(new Font("Helvetica", Font.PLAIN,18));
        
        GridBagConstraints gbcRutina = new GridBagConstraints();
        gbcRutina.gridx=1;
        gbcRutina.gridy=1;
        gbcRutina.gridwidth= GridBagConstraints.REMAINDER;
        gbcRutina.anchor= GridBagConstraints.CENTER;
        gbcRutina.insets = new Insets(0, 0, 150, 5);
        gbcRutina.weighty = 1.0;
        rutina.setPreferredSize(new Dimension(200,50));    
        ventana1.getContentPane().add(rutina);
        
        JButton btnNewButton = new JButton("Mi suscripción");
        btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 18));
        btnNewButton.setBounds(360, 415, 190, 47);
        ventana1.getContentPane().add(btnNewButton);
        
        JButton btnVolverAInicio = new JButton("Volver a Inicio");
        btnVolverAInicio.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ventana1.setVisible(false);
        		ventanaInicio.setVisible(true);
        	}
        });
        btnVolverAInicio.setPreferredSize(new Dimension(200, 50));
        btnVolverAInicio.setFont(new Font("SansSerif", Font.PLAIN, 15));
        btnVolverAInicio.setBounds(10, 614, 149, 36);
        ventana1.getContentPane().add(btnVolverAInicio);
        
	}
		public void mostrar() {
			ventana1.setVisible(true);
		}				
}

