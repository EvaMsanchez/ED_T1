package es.studium.ejercicio05;

public class TestPerro
{

	public static void main(String[] args)
	{
		//Constructor por p�rametros
		
		Perro perro1 = new Perro ("Pastor Alem�n", "grande", "8 a�os", "canela");
		System.out.println(perro1.getRaza()+" "+perro1.getTamano()+" "+perro1.getEdad()+" "+perro1.getColor());

		Perro perro2 = new Perro ("Yorkshire", "peque�o", "2 a�os", "marr�n");
	
		Perro perro3 = new Perro ("Galga", "mediano", "5 meses", "negro");
	}

}
