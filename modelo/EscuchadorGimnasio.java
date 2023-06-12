package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana2;

public class EscuchadorGimnasio implements ActionListener{
	public void actionPerformed (ActionEvent ev) {
		
		Ventana2 ventana2 = new Ventana2();
		ventana2.mostrar();
}
}
