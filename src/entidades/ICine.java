package entidades;

import java.util.ArrayList;

public interface ICine {
	public int buscarPeliculasPorNombre(String nombre);
	public void agregarPeliculas(Pelicula peliculaAAgregar);
	public void eliminarPelicula(String nombre);
	public void promocionCliente(Cliente cli);
	public Cliente getClientes();
	public ArrayList<Pelicula> getCartelera();
}
