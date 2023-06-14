package vista;

import javax.swing.JFrame;
import java.awt.Toolkit;

public class VentanaMenuGimnasio {
	private JFrame vMenuG;
	public VentanaMenuGimnasio() {
		vMenuG = new JFrame();
		vMenuG.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaMenuGimnasio.class.getResource("/imagenes/log.jpg")));
	}
	public void mostrar() {
		vMenuG.setVisible(true);
	}
}
