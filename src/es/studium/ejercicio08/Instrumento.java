package es.studium.ejercicio08;

public class Instrumento
{
	
	private String nombre;
	private char afinacion;
	
	public Instrumento ()
	{
		nombre = "";
		afinacion = ' ';
	}
	
	public Instrumento (String nom, char af)
	{
		nombre = nom;
		afinacion = af;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public char getAfinacion()
	{
		return afinacion;
	}

	public void setAfinacion(char afinacion)
	{
		this.afinacion = afinacion;
	}

}
