package es.studium.ejercicio01;

public class Persona
{

	//Atributos
	
	private String nombre;
	private String apellidos;
	private String dni;
	private String domicilio; 
	private int telefono;
	
	
	//Constructor por defecto
	
	public Persona()
	{
		nombre="";
		apellidos="";
		dni="";
		domicilio="";
		telefono=0;
	}

		
	//Constructor con parametros
	
	public Persona (String nom, String ap, String dn, String dom, int tel) 
	{
		nombre=nom;
		apellidos=ap;
		dni=dn;
		domicilio=dom;
		telefono=tel;
	}


	//Metodo
	
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


	public int getTelefono()
	{
		return telefono;
	}


	public void setTelefono(int telefono)
	{
		this.telefono = telefono;
	}
	
	
}
