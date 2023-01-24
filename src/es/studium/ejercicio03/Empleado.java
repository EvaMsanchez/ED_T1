package es.studium.ejercicio03;

public class Empleado
{

	// Atributos

	private String nombre;
	private String apellidos;
	private String dni;
	private String domicilio;
	private String puesto;
	private int telefono;

	// Constructor por defecto

	public Empleado()
	{
		nombre = "";
		apellidos = "";
		dni = "";
		domicilio = "";
		puesto = "";
		telefono = 0;
	}

	// Constructor con parametros

	public Empleado(String nombre, String a, String dn, String d, String p, int t)
	{
		this.nombre = nombre;
		apellidos = a;
		dni = dn;
		domicilio = d;
		puesto = p;
		telefono = t;
	}

	// Metodo

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellidos()
	{
		return apellidos;
	}

	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}

	public String getDni()
	{
		return dni;
	}

	public void setDni(String dni)
	{
		this.dni = dni;
	}

	public String getDomicilio()
	{
		return domicilio;
	}

	public void setDomicilio(String domicilio)
	{
		this.domicilio = domicilio;
	}

	public String getPuesto()
	{
		return puesto;
	}

	public void setPuesto(String puesto)
	{
		this.puesto = puesto;
	}

	public int getTelefono()
	{
		return telefono;
	}

	public void setTelefono(int telefono)
	{
		this.telefono = telefono;
	}

}
