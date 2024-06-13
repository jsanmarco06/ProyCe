package entidades;

import java.util.Date;

public class Pelicula extends Director{
	int duracion;
	String titulo;
	Date fechaEsteno;
	int edadPermitida;
	String categoria;
	float precio;
	
	public Pelicula() {
		super();
	}


	public Pelicula(String nombre, String apellido, int edad, int cantPeliculas, int duracion, String titulo,
			Date fechaEsteno, int edadPermitida, String categoria, float precio) {
		super(nombre, apellido, edad, cantPeliculas);
		this.duracion = duracion;
		this.titulo = titulo;
		this.fechaEsteno = fechaEsteno;
		this.edadPermitida = edadPermitida;
		this.categoria = categoria;
		this.precio = precio;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Date getFechaEsteno() {
		return fechaEsteno;
	}


	public void setFechaEsteno(Date fechaEsteno) {
		this.fechaEsteno = fechaEsteno;
	}


	public int getEdadPermitida() {
		return edadPermitida;
	}


	public void setEdadPermitida(int edadPermitida) {
		this.edadPermitida = edadPermitida;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

}
