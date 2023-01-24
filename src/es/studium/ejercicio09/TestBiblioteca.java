package es.studium.ejercicio09;

public class TestBiblioteca
{

	public static void main(String[] args)
	{
		Autor autor1 = new Autor ("Nombre Autor 1", "Apellidos Autor 1", "Española");
		Libro libro1 = new Libro ("Título 1", autor1, 1999, "Editorial 1", 520);
		
		System.out.println(libro1.getTitulo() + " " + libro1.getAutor().getNombre() + " " + libro1.getAutor().getApellidos() + " " + libro1.getAutor().getNacionalidad());
		
		Autor autor2 = new Autor ();
		autor2.setNombre("Nombre Autor 2");
		autor2.setApellidos("Apellidos Autor 2");
		autor2.setNacionalidad("Española");
		
		Libro libro2 = new Libro ();
		libro2.setTitulo("Título 2");
		libro2.setAutor(autor2);
		libro2.setEditorial("Editorial Libro 2");
		libro2.setAnioPublicacion(2000);
		libro2.setNumeroPaginas(240);
		
		System.out.println(libro2.getTitulo() + " " + libro2.getAutor().getNombre() + " " + libro2.getAutor().getApellidos() + " " + libro2.getAutor().getNacionalidad());
	
	}

}
