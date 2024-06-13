package ejecutable;

import java.util.Date;
import java.util.Scanner;

import entidades.Cine;
import entidades.Cliente;
import entidades.ICine;
import entidades.Pelicula;

public class Ejecutable {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 ICine cine= new Cine();
		 int i = 0;
		 int cantidadPeliculas=-1;
		 while(i<3) {
			System.out.println("nombre pelicula: ");
			String nombre = scanner.nextLine();			
			System.out.println("nombre del director: ");
			String nombreDire = scanner.nextLine();
			System.out.println("apellido del director: ");
			String apellidoDire = scanner.nextLine();
			System.out.println("precio de la entrada: ");
			float precio = scanner.nextFloat();
			scanner.nextLine();
			Pelicula peli= new Pelicula(nombreDire,apellidoDire,18,4, 23, nombre,new Date(), 7, "humor", precio);
			 
			cine.agregarPeliculas(peli);
			i++;
		 }
		 
		 System.out.println("Cartelera de pel�culas:");
		 for (Pelicula pelicula : cine.getCartelera()) {
			 imprimirDatos(pelicula);
		 }
		 
		 System.out.println("pelicula a elminar: ");
		 String nombrePeli = scanner.nextLine();
		 cine.eliminarPelicula(nombrePeli);
		 System.out.println("Cartelera de pel�culas con eliminado:");
		 for (Pelicula pelicula : cine.getCartelera()) {
			 imprimirDatos(pelicula);
		 }
		 System.out.println("ingrese la cantidad de peliculas que vio el cliente ");
		 cantidadPeliculas = scanner.nextInt();			
		 scanner.nextLine();
		 Cliente cli= new Cliente("lauti", "rojas", 10, cantidadPeliculas, 1);
		 cine.promocionCliente(cli);
		 System.out.println("ingrese la pelicula que desea ver:  ");
		 String nombrePeliculaAVer =scanner.nextLine();			
		 for (Pelicula pelicula : cine.getCartelera()) {
			 if(pelicula.getTitulo().equals(nombrePeliculaAVer)){
			     if(cli.getCantPeliculas() >= 3){
			    	 pelicula.setPrecio((float) (pelicula.getPrecio()-(pelicula.getPrecio()*0.15)));
			     }
				 imprimirDatos(pelicula);
			 }
		 }
		 
		 scanner.close();
	}
	static void imprimirDatos(Pelicula pelicula) {
		System.out.println("-------------------------");
	     System.out.println("Titulo: " + pelicula.getTitulo());
	     System.out.println("Autor: " + pelicula.getNombre());
	     System.out.println("Duracion: " + pelicula.getDuracion() + " minutos");
	     System.out.println("Precio de la entrada: $" + pelicula.getPrecio());
	     System.out.println("-------------------------");
	}
}