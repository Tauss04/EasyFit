package modelo;

public class Gimnasio {
	
	private String nombre;
	private String calle;
	//numero no lo uso en este momento pero debe estar para una futura mejora del sistema
	private String numero;
	private String codigoPostal;
	
	public Gimnasio(String nombre,String calle,String numero,String codigoPostal) {
		
		this.nombre=nombre;
		this.calle=calle;
		this.numero=numero;
		this.codigoPostal=codigoPostal;
	}
	public String getCP(){
		int cp = Integer.parseInt(codigoPostal);
		cp = (cp/100)*100;
		String cpFinal=Integer.toString(cp);
		return cpFinal;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCalle() {
		return calle;
	}
}
