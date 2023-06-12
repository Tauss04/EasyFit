 
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

import modelo.EscuchadorGimnasio;

public class Ventana1 {	
	private JFrame ventana1;	
	public Ventana1() {				
		ventana1 = new JFrame();
		ventana1.setSize(900,700);
		ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ventana1.setLocationRelativeTo(null);
	    ventana1.setTitle("EasyFit");		
	    //Color de fondo en RGB AZUL
	    ventana1.getContentPane().setBackground(new Color(43, 164, 255));

        // Uso GridBagLayout para posicionar los elementos
        ventana1.setLayout(new GridBagLayout());
        
        //Inserto imagen a mi ventana
       /*ClassLoader classLoader = getClass().getClassLoader();
        ImageIcon logo = new ImageIcon(classLoader.getResource("imagenes/logo.jpg"));
        JLabel jLogo = new JLabel();
        jLogo.setIcon(logo);
        
        GridBagConstraints gbcLogo = new GridBagConstraints();
        gbcLogo.gridx=0;
        gbcLogo.gridy=0;
        gbcLogo.gridwidth=GridBagConstraints.REMAINDER;
        gbcLogo.anchor = GridBagConstraints.NORTH; // Posicionamos en la parte superior
        gbcLogo.insets = new Insets(0, 0, 40, 0); // Padding superior
        gbcLogo.weighty = 1.0;
        
        ventana1.add(jLogo, gbcLogo);*/
        
        // Creo el JLabel del titulo
        JLabel titulo = new JLabel("Bienvenido");
        titulo.setFont(new Font("Helvetica", Font.BOLD, 40));       
        
        // Creo un objeto GridBagConstraints para posicionar el titulo
        GridBagConstraints gbcTitulo = new GridBagConstraints();
        gbcTitulo.gridx = 0; // Columna 0
        gbcTitulo.gridy = 0; // Fila 0
        gbcTitulo.gridwidth = GridBagConstraints.REMAINDER; // Ancho total
        gbcTitulo.anchor = GridBagConstraints.NORTH; // Posicionamos en la parte superior
        gbcTitulo.insets = new Insets(40, 0, 0, 0); // Padding superior
        gbcTitulo.weighty = 1.0; // El titulo ocupa todo el espacio vertical disponible
       
        ventana1.add(titulo, gbcTitulo);
    
        //Boton Buscar Gimnasios
        JButton buscarGym = new JButton("BuscarGimnasios");
        buscarGym.setFont(new Font("Helvetica", Font.PLAIN,18));
        
        GridBagConstraints gbcBuscarGym = new GridBagConstraints();
        gbcBuscarGym.gridx=1;
        gbcBuscarGym.gridy=1;
        gbcBuscarGym.gridwidth= GridBagConstraints.REMAINDER;
        gbcBuscarGym.anchor= GridBagConstraints.CENTER;
        gbcBuscarGym.insets = new Insets(0,0,300,0);
        gbcBuscarGym.weighty = 1.0;
        buscarGym.setPreferredSize(new Dimension(200,50));
        
        ventana1.add(buscarGym, gbcBuscarGym);
        EscuchadorGimnasio b1 = new EscuchadorGimnasio();
        buscarGym.addActionListener(b1);
        
        //Boton rutina
        JButton rutina = new JButton("Ver Rutina");
        rutina.setFont(new Font("Helvetica", Font.PLAIN,18));
        
        GridBagConstraints gbcRutina = new GridBagConstraints();
        gbcRutina.gridx=1;
        gbcRutina.gridy=1;
        gbcRutina.gridwidth= GridBagConstraints.REMAINDER;
        gbcRutina.anchor= GridBagConstraints.CENTER;
        gbcRutina.insets = new Insets(0,0,150,0);
        gbcRutina.weighty = 1.0;
        rutina.setPreferredSize(new Dimension(200,50));
        
        ventana1.add(rutina, gbcRutina);
        
	}
	public void mostrar() {
		ventana1.setVisible(true);
	}				
	}

