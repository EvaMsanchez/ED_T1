package es.studium.ejercicio08;

public class Musico
{

	private String nombre;
	private char sexo;
	
	public Musico ()
	{
		nombre = "";
		sexo = ' ';
	}
	
	public Musico (String nom, char sex)
	{
		nombre = nom;
		sexo = sex;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public char getSexo()
	{
		return sexo;
	}

	public void setSexo(char sexo)
	{
		this.sexo = sexo;
	}
	
}
