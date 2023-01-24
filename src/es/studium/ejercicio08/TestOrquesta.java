package es.studium.ejercicio08;

public class TestOrquesta
{

	public static void main(String[] args)
	{
		Instrumento instrumento1 = new Instrumento ("clarinete", 'E');
		Musico musico1 = new Musico ("John Lennon", 'H');

		System.out.println("Hola, me llamo "+ musico1.getNombre()+ " y toco el "+ instrumento1.getNombre());
		
	}

}
