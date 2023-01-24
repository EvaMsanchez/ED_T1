package es.studium.ejercicio20;

public class Empleado extends Persona //La clase de la que hereda
{
	
	//Atributos: solo los nuevos de esta clase
	private String puesto;
	
	
	//Constructor vacío: los que hereda con palabra super() + los de esta clase
	public Empleado()
	{
		super();
		puesto = "";
	}
	
	
	//Constructor parámetro: todos los parámetros tanto nuevos con de la clase padre, + super con los de la clase padre
	public Empleado (String nom, String ap, String dom, int tlf, String dn, String puesto)
	{
		super(nom, ap, dom, tlf, dn);
		this.puesto = puesto;
	}


	//Métodos: solo se crean los de la nueva clase
	public String getPuesto()
	{
		return puesto;
	}


	public void setPuesto(String puesto)
	{
		this.puesto = puesto;
	}
	
}
