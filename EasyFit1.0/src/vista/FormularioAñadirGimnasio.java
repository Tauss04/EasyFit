package vista;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.ListaGimnasios;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FormularioAñadirGimnasio {
    private JFrame ventanaFormulario;

	private ListaGimnasios l1;
	private JTextField tNombre;
	private JTextField tCalle;
	private JTextField tNumero;
	private JTextField tCp;
    
    public FormularioAñadirGimnasio(ListaGimnasios listaG) {
    	this.l1=listaG;
    	
    	
        ventanaFormulario = new JFrame();
        ventanaFormulario.setSize(500, 300);
        ventanaFormulario.setLocationRelativeTo(null);
        ventanaFormulario.setTitle("EasyFit");
        ventanaFormulario.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Introduce los datos de tu Gimnasio");
        lblNewLabel.setFont(new Font("Open Sans Semibold", Font.PLAIN, 18));
        lblNewLabel.setBounds(101, 11, 313, 51);
        ventanaFormulario.getContentPane().add(lblNewLabel);
        
        JLabel lNombre = new JLabel("Nombre :");
        lNombre.setBounds(101, 76, 46, 14);
        ventanaFormulario.getContentPane().add(lNombre);
        
        tNombre = new JTextField();
        tNombre.setBounds(157, 73, 142, 20);
        ventanaFormulario.getContentPane().add(tNombre);
        tNombre.setColumns(10);
        
        JLabel lCalle = new JLabel("Calle :");
        lCalle.setBounds(101, 107, 46, 14);
        ventanaFormulario.getContentPane().add(lCalle);
        
        tCalle = new JTextField();
        tCalle.setBounds(157, 104, 142, 20);
        ventanaFormulario.getContentPane().add(tCalle);
        tCalle.setColumns(10);
        
        JLabel lNumero = new JLabel("Número :");
        lNumero.setBounds(101, 138, 46, 14);
        ventanaFormulario.getContentPane().add(lNumero);
        
        tNumero = new JTextField();
        tNumero.setBounds(157, 135, 142, 20);
        ventanaFormulario.getContentPane().add(tNumero);
        tNumero.setColumns(10);
        
        JLabel lCp = new JLabel("CodigoPostal :");
        lCp.setBounds(73, 169, 74, 14);
        ventanaFormulario.getContentPane().add(lCp);
        
        tCp = new JTextField();
        tCp.setBounds(157, 166, 142, 20);
        ventanaFormulario.getContentPane().add(tCp);
        tCp.setColumns(10);
        
        JButton btnAñadir = new JButton("Añadir");
        btnAñadir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String nombre = tNombre.getText();
        		String calle = tCalle.getText();
        		String numero ="";
        		numero = tNumero.getText();
        		String cp = tCp.getText();
        		l1.añadirGimnasio(nombre, calle, numero, cp);
        		ventanaFormulario.setVisible(false);
        	}
        });       
        btnAñadir.setBounds(183, 210, 89, 23);
        ventanaFormulario.getContentPane().add(btnAñadir);
    }
    
    
    //metodo para mostrar ventana
    public void mostrar() {
        ventanaFormulario.setVisible(true);
    }
}
