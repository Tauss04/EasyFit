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
import modelo.ListaGimnasios;
import javax.swing.ImageIcon;



public class VentanaInicio {
	private JFrame ventanaInicio;
	private VentanaMenu v1;
	private VentanaMenuGimnasio v;
	private ListaGimnasios listaGimnasios;
	
	public VentanaInicio(ListaGimnasios l) {
		this.listaGimnasios=l;
		
		ventanaInicio = new JFrame();
		ventanaInicio.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaInicio.class.getResource("/imagenes/log.jpg")));
		ventanaInicio.setSize(900, 700);
		ventanaInicio.setLocationRelativeTo(null);
		ventanaInicio.setTitle("EasyFit");
		
		ventanaInicio.getContentPane().setBackground(new Color(33, 141, 115));
		ventanaInicio.getContentPane().setLayout(null);
	
		
		
		JLabel titulo = new JLabel("¿Que tipo de usuario eres?");
		titulo.setBounds(242, 451, 425, 73);
		titulo.setFont(new Font("SansSerif", Font.BOLD, 32));
       
        
        ventanaInicio.getContentPane().add(titulo);
        
        JButton Gimnasio = new JButton("Gimnasio");
        Gimnasio.setBounds(242, 549, 189, 55);
        Gimnasio.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		v = new VentanaMenuGimnasio(listaGimnasios,ventanaInicio);
        		v.mostrar();
        	}
        });
 
        
       
        
        Gimnasio.setFont(new Font("Helvetica", Font.PLAIN,18));        
        ventanaInicio.getContentPane().add(Gimnasio);
        
        JButton Cliente = new JButton("Cliente");
        Cliente.setBounds(478, 551, 189, 50);
        Cliente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ventanaInicio.setVisible(false);
        		v1 = new VentanaMenu(listaGimnasios,ventanaInicio);
        		v1.mostrar();
        	}
        });
        Cliente.setFont(new Font("Helvetica",Font.PLAIN,18)); 
       Cliente.setPreferredSize(new Dimension(200,50));
        
        ventanaInicio.getContentPane().add(Cliente);
        
        JLabel bienvenido = new JLabel("Bienvenido a EasyFit");
        bienvenido.setFont(new Font("SansSerif", Font.BOLD, 40));
        bienvenido.setBounds(263, 11, 396, 81);
        ventanaInicio.getContentPane().add(bienvenido);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(VentanaInicio.class.getResource("/imagenes/logo.png")));
        lblNewLabel.setBounds(97, -85, 850, 700);
        ventanaInicio.getContentPane().add(lblNewLabel);
	}
	public void mostrar() {
		ventanaInicio.setVisible(true);
	}
}
