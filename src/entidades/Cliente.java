package entidades;

public class Cliente extends Persona{
	int cantPeliculas;
	int idCLiente;
	public Cliente(String nombre, String apellido, int edad, int cantPeliculas,
			int idCLiente) {
		super(nombre, apellido, edad);
		this.cantPeliculas = cantPeliculas;
		this.idCLiente = idCLiente;
	}
	public int getCantPeliculas() {
		return cantPeliculas;
	}
	public void setCantPeliculas(int cantPeliculas) {
		this.cantPeliculas = cantPeliculas;
	}
	public int getIdCLiente() {
		return idCLiente;
	}
	public void setIdCLiente(int idCLiente) {
		this.idCLiente = idCLiente;
	}
		
}
