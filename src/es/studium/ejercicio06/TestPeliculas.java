package es.studium.ejercicio06;

public class TestPeliculas
{

	public static void main(String[] args)
	{
		
		Pelicula pelicula1 = new Pelicula ("Titanic", 2000, "120min");
		Pelicula pelicula2 = new Pelicula ("Los renglones torcidos de Dios", 2022, "150min");
		Pelicula pelicula3 = new Pelicula ("El poder del perro", 2021, "99min");
		Pelicula pelicula4 = new Pelicula ("Diamantes en bruto", 2020, "110min");
		Pelicula pelicula5 = new Pelicula ("En la hierba alta", 2019, "105min");
		
		System.out.println(pelicula2.getTitulo()+" "+pelicula2.getAno()+" "+pelicula2.getDuracion());
	}

}
