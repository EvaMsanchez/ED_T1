package es.studium.ejercicio11;

public class Futbolista
{

	private String nombre;
	private String apellido;
	private boolean comunitario;
	private Equipo equipo;
	
	public Futbolista ()
	{
		nombre = "";
		apellido = "";
		comunitario = false;
		equipo = new Equipo();
	}
	
	public Futbolista (String no, String ap, boolean co, Equipo eq)
	{
		nombre = no;
		apellido = ap;
		comunitario = co;
		equipo = eq;
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

	public boolean isComunitario()
	{
		return comunitario;
	}

	public void setComunitario(boolean comunitario)
	{
		this.comunitario = comunitario;
	}

	public Equipo getEquipo()
	{
		return equipo;
	}

	public void setEquipo(Equipo equipo)
	{
		this.equipo = equipo;
	}
	
}
