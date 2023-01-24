package es.studium.ejercicio07;

public class Piloto
{

	private String nombre;
	private String nacionalidad;
	
	public Piloto ()
	{
		nombre = "";
		nacionalidad= "";
	}
	
	public Piloto (String nom, String nac)
	{
		nombre = nom;
		nacionalidad = nac;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNacionalidad()
	{
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad)
	{
		this.nacionalidad = nacionalidad;
	}
	
}
