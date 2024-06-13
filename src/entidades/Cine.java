package entidades;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Cine extends Pelicula implements ICine{
	ArrayList <Pelicula>  cartelera= new ArrayList<Pelicula>();
	Cliente clientes;
	
	public Cine() {
		super();
	}
	
	public Cine(String nombre, String apellido, int edad, int cantPeliculas, int duracion, String titulo,
			Date fechaEsteno, int edadPermitida, String categoria, float precio, ArrayList<Pelicula> cartelera,
			Cliente clientes) {
		super(nombre, apellido, edad, cantPeliculas, duracion, titulo, fechaEsteno, edadPermitida, categoria, precio);
		this.cartelera = cartelera;
		this.clientes = clientes;
	}

	public ArrayList<Pelicula> getCartelera() {
		return cartelera;
	}

	public void setCartelera(ArrayList<Pelicula> cartelera) {
		this.cartelera = cartelera;
	}

	public Cliente getClientes() {
		return clientes;
	}
	
	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}

	public int buscarPeliculasPorNombre(String nombre) {
		int posicion = -1;
		int i = 0;
		for(Pelicula peli:cartelera) {
			if(peli.getTitulo().equals(nombre)) {
				posicion = i;
			}
			i++;
		}
		
		return posicion;
	}
	public void agregarPeliculas(Pelicula peliculaAAgregar) {
			cartelera.add(peliculaAAgregar);
	}
	public void eliminarPelicula(String nombre) {
		int posicion=buscarPeliculasPorNombre(nombre);

		if(posicion!=-1) {
			cartelera.remove(posicion);
			System.out.println("La pelicula se ha eliminado correctamente");
		}
		else {
			System.out.println("La pelicula no se encuentra");

		}
	}
	public void promocionCliente(Cliente cli) {
		if(cli.getCantPeliculas() >= 3) {
			JOptionPane.showMessageDialog(null, "El cliente "+ cli.getNombre() + " tiene un cupon de descuento del 15%!!");
		}
		
	}

	@Override
	public String toString() {
		return "Cine [cartelera=" + cartelera + ", clientes=" + clientes + ", duracion=" + duracion + ", titulo="
				+ titulo + ", fechaEsteno=" + fechaEsteno + ", edadPermitida=" + edadPermitida + ", categoria="
				+ categoria + ", cantPeliculas=" + cantPeliculas + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + "]";
	}

	
}
