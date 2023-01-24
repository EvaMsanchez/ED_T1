package es.studium.ejercicio07;

public class TestCarrera
{

	public static void main(String[] args)
	{
		
		Coche coche1 = new Coche ("Porsche", "356", 2018, false);
		Coche coche2 = new Coche ("Peugeot", "L76", 2020, true);
		Piloto piloto1 = new Piloto ("Michael Schumacher", "Alemán");
		Piloto piloto2 = new Piloto ("Fernando Alonso", "Español");
		
		System.out.println("Hola, me llamo "+piloto1.getNombre());
		System.out.println("Hola, me llamo "+piloto2.getNombre());
		
	}

}
