package modelo;

import java.io.Serializable;

public class Rutina implements Serializable{
	private String dia;
	private String clasificacion;
	private String ejercicios;
	public Rutina(String dia, String clasificacion, String ejercicios) {
		this.dia=dia;
		this.clasificacion=clasificacion;
		this.ejercicios=ejercicios;
	}
	public String getDia() {
		return dia;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public String getEjercicios() {
		return ejercicios;
	}
}
