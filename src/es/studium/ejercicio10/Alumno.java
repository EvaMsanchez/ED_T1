package es.studium.ejercicio10;

public class Alumno
{

	private String nombre;
	private String apellido;
	private int edad;
	private boolean haPagado;
	private Aula aula;
	
	public Alumno ()
	{
		nombre = "";
		apellido = "";
		edad = 0;
		haPagado = false;
		aula = new Aula();
	}
	
	public Alumno (String nom, String ap, int e, boolean p, Aula a)
	{
		nombre = nom;
		apellido = ap;
		edad = e;
		haPagado = p;
		aula = a;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellido()
	{
		return apellido;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public boolean getHaPagado()
	{
		return haPagado;
	}

	public void setHaPagado(boolean haPagado)
	{
		this.haPagado = haPagado;
	}

	public Aula getAula()
	{
		return aula;
	}

	public void setAula(Aula aula)
	{
		this.aula = aula;
	}
	
}
