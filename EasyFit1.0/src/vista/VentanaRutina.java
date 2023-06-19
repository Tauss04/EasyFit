package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import modelo.Rutina;

public class VentanaRutina {
	private JFrame vRutina;
    private JFrame vMenu;    
    private JTextArea textArea;
    private ArrayList<Rutina> listaRutinainicial;
    private  ArrayList<Rutina> listaRutinasFinal;
    
	public VentanaRutina(JFrame vMenu,ArrayList<Rutina> listaRutinas) {
        this.vMenu = vMenu;
        this.listaRutinasFinal=listaRutinas;
        vMenu.setVisible(false);

        vRutina = new JFrame();
        vRutina.setSize(900, 700);
        vRutina.setLocationRelativeTo(vMenu);
        vRutina.setTitle("EasyFit");
        vRutina.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaRutina.class.getResource("/imagenes/logo (1).png")));
        vRutina.getContentPane().setBackground(new Color(43, 164, 255));
        vRutina.getContentPane().setLayout(null);

        
        
        JButton btnCrearRutina = new JButton("Crear Rutina");
        btnCrearRutina.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               VentanaCreoRutina v1= new VentanaCreoRutina(vRutina,vMenu,listaRutinasFinal); 
               v1.mostrar();
            }
        });
        btnCrearRutina.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnCrearRutina.setBounds(343, 216, 171, 33);
        vRutina.getContentPane().add(btnCrearRutina);

        JButton btnBorrarRutina = new JButton("Borrar Rutina");
        btnBorrarRutina.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {       	
	        	try {
	        		FileOutputStream fich = new FileOutputStream("rutinas/rutina.txt");
	        		fich.close();
	        		vRutina.setVisible(false);
	        		vMenu.setVisible(true);
	        	}catch(IOException ex) {
	        		
	        	}
        	}
        });
        btnBorrarRutina.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnBorrarRutina.setBounds(343, 299, 171, 33);
        vRutina.getContentPane().add(btnBorrarRutina);
        
        textArea = new JTextArea();
        textArea.setBackground(new Color(43, 164, 255));
        textArea.setBounds(71, 445, 707, 191);
        vRutina.getContentPane().add(textArea);
        
        try {
        	FileInputStream fich = new FileInputStream("rutinas/rutina.txt");
        	ObjectInputStream ob = new ObjectInputStream(fich);
        	
        	listaRutinasFinal =(ArrayList<Rutina>) ob.readObject();
        	String rutinaS="";
        	for(int i=0;i<listaRutinasFinal.size();i++) {
        		Rutina nuevo = listaRutinasFinal.get(i);
        		rutinaS=rutinaS+"\n"+nuevo.getDia()+": Clasificación: "+nuevo.getClasificacion()+" Ejercicios: "+nuevo.getEjercicios();
        		System.out.println("A ver que paso en rutinaS: "+rutinaS);
        		textArea.setText(rutinaS);
        	}       	
        }catch(IOException | ClassNotFoundException ex) {
        	System.out.println("Ocurrió un error al leer el ArrayList desde el fichero: " + ex.getMessage());
        }
    }


    public void mostrar() {
        vRutina.setVisible(true);
    }
}
