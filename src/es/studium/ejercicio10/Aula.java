package es.studium.ejercicio10;

public class Aula
{
	
	private String nombre;
	private int numeroAlumnos;
	
	public Aula ()
	{
		nombre = "";
		numeroAlumnos = 0;
	}
	
	public Aula (String nom, int na)
	{
		nombre = nom;
		numeroAlumnos = na;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getNumeroAlumnos()
	{
		return numeroAlumnos;
	}

	public void setNumeroAlumnos(int numeroAlumnos)
	{
		this.numeroAlumnos = numeroAlumnos;
	}
	
}
