package es.studium.ejercicio09;

public class Libro
{
	
	private String titulo;
	private Autor autor;
	private int anioPublicacion;
	private String editorial;
	private int numeroPaginas;
	
	public Libro ()
	{
		titulo = "";
		autor = new Autor();
		anioPublicacion = 0;
		editorial = "";
		numeroPaginas = 0;
	}
	
	public Libro (String t, Autor a, int an, String ed, int p)
	{
		titulo = t;
		autor = a;
		anioPublicacion = an;
		editorial = ed;
		numeroPaginas = p;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public Autor getAutor()
	{
		return autor;
	}

	public void setAutor(Autor autor)
	{
		this.autor = autor;
	}

	public int getAnioPublicacion()
	{
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion)
	{
		this.anioPublicacion = anioPublicacion;
	}

	public String getEditorial()
	{
		return editorial;
	}

	public void setEditorial(String editorial)
	{
		this.editorial = editorial;
	}

	public int getNumeroPaginas()
	{
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas)
	{
		this.numeroPaginas = numeroPaginas;
	}

}
