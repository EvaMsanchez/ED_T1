package es.studium.ejercicio05;

public class TestPerro
{

	public static void main(String[] args)
	{
		//Constructor por párametros
		
		Perro perro1 = new Perro ("Pastor Alemán", "grande", "8 años", "canela");
		System.out.println(perro1.getRaza()+" "+perro1.getTamano()+" "+perro1.getEdad()+" "+perro1.getColor());

		Perro perro2 = new Perro ("Yorkshire", "pequeño", "2 años", "marrón");
	
		Perro perro3 = new Perro ("Galga", "mediano", "5 meses", "negro");
	}

}
