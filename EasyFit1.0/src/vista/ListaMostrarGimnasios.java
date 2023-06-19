package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Gimnasio;

import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JScrollBar;

public class ListaMostrarGimnasios  {

	private JPanel contentPane;
	private JTextArea listaTxt;
	private JFrame lista;
	
	public ListaMostrarGimnasios() {
		lista = new JFrame();
		lista.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		lista.setBounds(100, 100, 450, 300);
		lista.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		lista.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrGimnasiosCercaDe = new JTextArea();
		txtrGimnasiosCercaDe.setFont(new Font("Stencil", Font.ITALIC, 31));
		txtrGimnasiosCercaDe.setEditable(false);
		txtrGimnasiosCercaDe.setText("Gimnasios cerca");
		txtrGimnasiosCercaDe.setForeground(new Color(255, 255, 0));
		txtrGimnasiosCercaDe.setBackground(new Color(100, 149, 237));
		txtrGimnasiosCercaDe.setBounds(72, 11, 275, 36);
		contentPane.add(txtrGimnasiosCercaDe);
		
		JTextArea txtrDeTi = new JTextArea();
		txtrDeTi.setText("de ti :");
		txtrDeTi.setForeground(Color.YELLOW);
		txtrDeTi.setFont(new Font("Stencil", Font.ITALIC, 31));
		txtrDeTi.setEditable(false);
		txtrDeTi.setBackground(new Color(100, 149, 237));
		txtrDeTi.setBounds(159, 45, 106, 36);
		contentPane.add(txtrDeTi);
		
		listaTxt = new JTextArea();
		listaTxt.setBackground(new Color(100, 149, 237));
		listaTxt.setForeground(Color.BLACK);
		listaTxt.setEditable(false);
		listaTxt.setFont(new Font("Open Sans Semibold", Font.PLAIN, 13));
		listaTxt.setBounds(72, 108, 304, 119);
		contentPane.add(listaTxt);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBackground(new Color(100, 149, 237));
		scrollBar.setForeground(new Color(0, 0, 0));
		scrollBar.setBounds(359, 108, 17, 108);
		contentPane.add(scrollBar);
	}
	//USADO EN ESCUCHADOR BUSCAR ANTES DEL CAMBIO
	public void setGimnasios(String gimnasioS) {
		listaTxt.setText(gimnasioS);
	}
	
	
	/*public void pasoListaSelectiva(ArrayList<Gimnasio> lista) {
		String datoS="";
		for (int i=0;i<lista.size();i++) {
			Gimnasio nuevo=(Gimnasio) lista.get(i);
			datoS=datoS+"\n"+i+"- "+nuevo.getNombre()+" "+nuevo.getCalle();
			listaTxt.setText(datoS);
		}
	}*/
	
	public void mostrar() {
		lista.setVisible(true);
	}
	public void ocultar() {
		lista.setVisible(false);
	}
	public void noResult() {
		listaTxt.setText("No se han encontrado gimnasios cercanos");
	}
}
