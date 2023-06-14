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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



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
		
		JLabel titulo = new JLabel("¿Que usuario eres?");
		titulo.setFont(new Font("Helvetica", Font.BOLD, 40));
		GridBagConstraints gbcTitulo = new GridBagConstraints();
        gbcTitulo.gridx = 0; // Columna 0
        gbcTitulo.gridy = 0; // Fila 0
        gbcTitulo.gridwidth = GridBagConstraints.REMAINDER; // Ancho total
        gbcTitulo.anchor = GridBagConstraints.NORTH; // Posicionamos en la parte superior
        gbcTitulo.insets = new Insets(40, 0, 0, 0); // Padding superior
        gbcTitulo.weighty = 1.0;
        
        ventanaInicio.getContentPane().add(titulo,gbcTitulo);
        
        JButton Gimnasio = new JButton("Gimnasio");
        Gimnasio.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ventanaInicio.setVisible(false);
        		VentanaMenuGimnasio v = new VentanaMenuGimnasio();
        		v.mostrar();
        	}
        });
 
        
       
        
        Gimnasio.setFont(new Font("Helvetica", Font.PLAIN,18));
        
        GridBagConstraints gbc_Gimnasio = new GridBagConstraints();
        gbc_Gimnasio.gridx=1;
        gbc_Gimnasio.gridy=1;
        gbc_Gimnasio.gridwidth= GridBagConstraints.REMAINDER;
        gbc_Gimnasio.anchor= GridBagConstraints.CENTER;
        gbc_Gimnasio.insets = new Insets(0,0,300,0);
        gbc_Gimnasio.weighty = 1.0;
        Gimnasio.setPreferredSize(new Dimension(200,50));
        
        ventanaInicio.getContentPane().add(Gimnasio,gbc_Gimnasio);
        
        JButton Cliente = new JButton("Cliente");
        Cliente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ventanaInicio.setVisible(false);
        		VentanaMenu v1 = new VentanaMenu();
        		v1.mostrar();
        	}
        });
        Cliente.setFont(new Font("Helvetica",Font.PLAIN,18));
        
       
        
        
        GridBagConstraints gbc_Cliente = new GridBagConstraints();
        gbc_Cliente.gridx=1;
        gbc_Cliente.gridy=1;
        gbc_Cliente.gridwidth= GridBagConstraints.REMAINDER;
        gbc_Cliente.anchor= GridBagConstraints.CENTER;
        gbc_Cliente.insets = new Insets(0,0,150,0);
        gbc_Cliente.weighty = 1.0;
        Cliente.setPreferredSize(new Dimension(200,50));
        
        ventanaInicio.getContentPane().add(Cliente,gbc_Cliente);
	}
	public void mostrar() {
		ventanaInicio.setVisible(true);
	}
}
