package vista;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import control.EscuchadorBuscar;
import modelo.ListaGimnasios;


public class VentanaFormulario {
    private JFrame ventanaFormulario;
    private EscuchadorBuscar b1;
	private ListaGimnasios listaComp;
    
    public VentanaFormulario(ListaGimnasios l) {
    	this.listaComp=l;
    	
    	
        ventanaFormulario = new JFrame();
        ventanaFormulario.setSize(500, 300);
        ventanaFormulario.setLocationRelativeTo(null);
        ventanaFormulario.setTitle("EasyFit");

        Container contenedor = ventanaFormulario.getContentPane();
        ventanaFormulario.getContentPane().setLayout(null);
        
        // Titulo
        JLabel titulo = new JLabel("Introduce tu dirección");
        titulo.setBounds(75, 18, 333, 45);
        titulo.setFont(new Font("Cursive", Font.ITALIC,35));
        contenedor.add(titulo);
        // Par 1
        JLabel lcalle = new JLabel("Calle: ");
        lcalle.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lcalle.setBounds(75, 77, 108, 28);
        JTextField tcalle = new JTextField(15);
        tcalle.setBounds(201, 83, 126, 20);
        tcalle.setText("C/");
        contenedor.add(lcalle);
        contenedor.add(tcalle);
        
        // Par 2
        JLabel lnumero = new JLabel("Número: ");
        lnumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lnumero.setBounds(75, 116, 108, 20);
        JTextField tnumero = new JTextField(15);
        tnumero.setBounds(201, 118, 126, 20);
        contenedor.add(lnumero);
        contenedor.add(tnumero);
        JTextField tcp = new JTextField(15);
        tcp.setBounds(201, 153, 126, 20);
        
            // Par 3
            JLabel lcp = new JLabel("Código Postal: ");
            lcp.setFont(new Font("Tahoma", Font.PLAIN, 15));
            lcp.setBounds(75, 147, 108, 28);
            contenedor.add(lcp);
            contenedor.add(tcp);
        
        // Boton
        JButton buscar = new JButton ("Buscar");
        buscar.setBounds(201, 210, 90, 40);
        buscar.setPreferredSize(new Dimension(90,40));
        buscar.setFont(new Font("Cursive", Font.ITALIC,17));
        contenedor.add(buscar );
        
        b1 =new EscuchadorBuscar(listaComp,ventanaFormulario);  
        buscar.addActionListener(b1);
        
        //envio los datos        
        b1.setCalle(tcalle);
        b1.setNumero(tnumero);
        b1.setCpostal(tcp);
    }
    
    //metodo para mostrar ventana
    public void mostrar() {
        ventanaFormulario.setVisible(true);
    }

}
