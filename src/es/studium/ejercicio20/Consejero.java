package es.studium.ejercicio20;

public class Consejero extends Empleado
{
	
	private int numeroAcciones;
	
	
	public Consejero()
	{
		super();
		numeroAcciones = 0;
	}
	
	
	public Consejero (String nom, String ap, String dom, int tlf, String dn, String puesto, int numeroAcciones)
	{
		super(nom, ap, dom, tlf, dn, puesto);
		this.numeroAcciones = numeroAcciones;
	}


	public int getNumeroAcciones()
	{
		return numeroAcciones;
	}


	public void setNumeroAcciones(int numeroAcciones)
	{
		this.numeroAcciones = numeroAcciones;
	}

}
