package entidades;

public class Director extends Persona{
	int cantPeliculas;
	
	public Director() {
		super();
	}
	public Director(String nombre, String apellido, int edad, int cantPeliculas) {
		super(nombre, apellido, edad);
		this.cantPeliculas = cantPeliculas;
	}
	public int getCantPeliculas() {
		return cantPeliculas;
	}
	public void setCantPeliculas(int cantPeliculas) {
		this.cantPeliculas = cantPeliculas;
	}
	
	
}	
