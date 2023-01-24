package es.studium.ejercicio19;

public class Cliente
{

	private String nombre;
	private String direccion;
	private String dni;
	
	public Cliente ()
	{
		nombre = "";
		direccion = "";
		dni = "";
	}
	
	public Cliente (String n, String d, String dn)
	{
		nombre = n;
		direccion = d;
		dni = dn;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}

	public String getDni()
	{
		return dni;
	}

	public void setDni(String dni)
	{
		this.dni = dni;
	}
	
}
