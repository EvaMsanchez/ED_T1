package es.studium.ejercicio11;

public class Equipo
{
	
	private String nombre;
	private int anioFundacion;
	private int numeroSocios;
	
	
	public Equipo ()
	{
		nombre = "";
		anioFundacion = 0;
		numeroSocios = 0;
	}
		
	
	public Equipo (String no, int af, int ns)
	{
		nombre = no;
		anioFundacion = af;
		numeroSocios = ns;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getAnioFundacion()
	{
		return anioFundacion;
	}

	public void setAnioFundacion(int anioFundacion)
	{
		this.anioFundacion = anioFundacion;
	}

	public int getNumeroSocios()
	{
		return numeroSocios;
	}

	public void setNumeroSocios(int numeroSocios)
	{
		this.numeroSocios = numeroSocios;
	}
	
}
