package vista;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.EscuchadorBuscar;

public class Ventana2 {
    private JFrame ventana2;
 
    public Ventana2() {
    	    	    	
        ventana2 = new JFrame();
        ventana2.setSize(500, 300);
        ventana2.setLocationRelativeTo(null);
        ventana2.setTitle("EasyFit");

        Container contenedor = ventana2.getContentPane();
        contenedor.setLayout(new GridBagLayout());
        
        // Titulo
        JLabel titulo = new JLabel("Introduce tu dirección");
        titulo.setFont(new Font("Cursive", Font.ITALIC,35));
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridx = 0; 
        gbc.gridy = 0; 
        gbc.gridwidth = GridBagConstraints.REMAINDER; 
        gbc.anchor = GridBagConstraints.NORTH; 
        gbc.insets.bottom = 30;
        contenedor.add(titulo, gbc);
        
        // Par 1
        JLabel lcalle = new JLabel("Calle: ");
        JTextField tcalle = new JTextField(15);
        tcalle.setText("C/");
        
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets.bottom = 10;
        contenedor.add(lcalle, gbc);
        
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        contenedor.add(tcalle, gbc);
        
        // Par 2
        JLabel lnumero = new JLabel("Número: ");
        JTextField tnumero = new JTextField(5);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets.bottom = 10;
        contenedor.add(lnumero, gbc);
        
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        contenedor.add(tnumero, gbc);
    
        // Par 3
        JLabel lcp = new JLabel("Código Postal: ");
        JTextField tcp = new JTextField(5);
        
        gbc.gridx= 0;
        gbc.gridy= 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets.bottom=20;
        contenedor.add(lcp,gbc);
        
        gbc.gridx= 1;
        gbc.anchor = GridBagConstraints.CENTER;
        contenedor.add(tcp,gbc);
        
        // Boton
        JButton buscar = new JButton ("Buscar");
        buscar.setPreferredSize(new Dimension(90,40));
        buscar.setFont(new Font("Cursive", Font.ITALIC,17));
        
        gbc.gridx=0;
        gbc.gridy= 4;
        contenedor.add(buscar,gbc);
        
        EscuchadorBuscar b1 =new EscuchadorBuscar();        
        buscar.addActionListener(b1);
        
        //envio los datos        
        b1.setCalle(tcalle);
        b1.setNumero(tnumero);
        b1.setCpostal(tcp);
    }
    //setter
    
    //metodo para mostrar ventana
    public void mostrar() {
        ventana2.setVisible(true);
    }
}
