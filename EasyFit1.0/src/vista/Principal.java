package vista;
import modelo.ListaGimnasios;
	public class Principal{
		public static void main(String[]args) {
			
			ListaGimnasios lista = new ListaGimnasios();
			VentanaInicio ventana = new VentanaInicio(lista);
			
			ventana.mostrar();
		}		
	}



