package vista;

import java.awt.Choice;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import modelo.Rutina;
public class VentanaCreoRutina {
    private JFrame vCreoRutina; 
    private JFrame vRutina;
    private JFrame vMenu;
    private  ArrayList<Rutina> listaRutinas;
    public VentanaCreoRutina(JFrame vRutina,JFrame vMenu,ArrayList<Rutina> listaRutinas) {
        this.vRutina=vRutina;
        this.vMenu=vMenu;
        this.listaRutinas=listaRutinas;

        vCreoRutina = new JFrame();
        vCreoRutina.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaCreoRutina.class.getResource("/imagenes/logo (1).png")));
        vCreoRutina.setSize(600, 400);
        vCreoRutina.setTitle("EasyFit");       
        vCreoRutina.getContentPane().setLayout(null);
        vCreoRutina.setLocationRelativeTo(null);
        
        
        JLabel lblNewLabel = new JLabel("Día de la semana");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblNewLabel.setBounds(109, 43, 169, 26);
        vCreoRutina.getContentPane().add(lblNewLabel);
        
        JLabel lblClasificacin = new JLabel("Clasificación");
        lblClasificacin.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblClasificacin.setBounds(109, 79, 134, 26);
        vCreoRutina.getContentPane().add(lblClasificacin);
        
        TextField clasificacion = new TextField();
        clasificacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
        clasificacion.setBounds(311, 84, 134, 21);
        vCreoRutina.getContentPane().add(clasificacion);
        
        JLabel lblIntroduceTusEjercicios = new JLabel("Introduce tus ejercicios");
        lblIntroduceTusEjercicios.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblIntroduceTusEjercicios.setBounds(168, 146, 225, 26);
        vCreoRutina.getContentPane().add(lblIntroduceTusEjercicios);
        
        Choice diaSemana = new Choice();
        diaSemana.setFont(new Font("Dialog", Font.PLAIN, 20));
        diaSemana.setBounds(311, 43, 134, 30);
        diaSemana.add("Lunes");
        diaSemana.add("Martes");
        diaSemana.add("Miércoles");
        diaSemana.add("Jueves");
        diaSemana.add("Viernes");
        diaSemana.add("Sábado");
        diaSemana.add("Domingo");
        vCreoRutina.getContentPane().add(diaSemana);
        
        TextArea ejercicios = new TextArea();
        ejercicios.setBounds(63, 178, 440, 150);
        vCreoRutina.getContentPane().add(ejercicios);
        
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(0, 342, 586, 21);
        
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {  
            	 
	             String dia=diaSemana.getSelectedItem();
	             String clasificacionS=clasificacion.getText();
	             String ejercicioS=ejercicios.getText();
	             
	             Rutina r1 = new Rutina(dia,clasificacionS,ejercicioS);
	             
	             
	             listaRutinas.add(r1);
	             try {
	            	 	FileOutputStream fich = new FileOutputStream("rutinas/rutina.txt");
	            	 	ObjectOutputStream ob = new ObjectOutputStream(fich);
	            	 	ob.writeObject(listaRutinas);	            	 
	            	 JOptionPane.showMessageDialog(null,"Rutina guardada correctamente");
	             }catch(IOException ex) {
	            	 JOptionPane.showMessageDialog(null, "Error al guardar la rutina: " + ex.getMessage());
	             }
	             //vuelvo a Menu para poder actualizar la rutina añadida.
	             vCreoRutina.setVisible(false);
	             vRutina.setVisible(false);
	             vMenu.setVisible(true);
            	
            }
        });
        vCreoRutina.getContentPane().add(btnGuardar);
       
    }

    public void mostrar() {
        vCreoRutina.setVisible(true);
    }
}
  

