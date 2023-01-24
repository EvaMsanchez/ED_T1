package es.studium.ejercicio05;

public class Perro
{

	private String raza;
	private String tamano;
	private String edad;
	private String color;
	
	public Perro ()
	{
		raza = "";
		tamano = "";
		edad = "";
		color = "";
	}
	
	public Perro (String raz, String tam, String ed, String col)
	{
		raza = raz;
		tamano = tam;
		edad = ed;
		color = col;
	}

	public String getRaza()
	{
		return raza;
	}

	public void setRaza(String raza)
	{
		this.raza = raza;
	}

	public String getTamano()
	{
		return tamano;
	}

	public void setTamano(String tamano)
	{
		this.tamano = tamano;
	}

	public String getEdad()
	{
		return edad;
	}

	public void setEdad(String edad)
	{
		this.edad = edad;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
	
}
