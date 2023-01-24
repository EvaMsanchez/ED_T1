package es.studium.ejemploPersona;

public class Persona {
	
	//Atributos
	
	/*Comentario
	 * varias 
	 * l�neas
	 * 
	 * 
	 * 
	 */
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean haPagado; 
	
	
	//Constructor vacio o por defecto
	
	public Persona() {
		nombre="";
		apellidos="";
		edad=0;
		haPagado=false;
	}

	//Constructor con parametros
	
	public Persona (String nom, String ap, int ed, boolean haP) {
		nombre=nom;
		apellidos=ap;
		edad=ed;
		haPagado=haP;		
	}
	
	//Metodos

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean getHaPagado() {
		return haPagado;
	}

	public void setHaPagado(boolean haPagado) {
		this.haPagado = haPagado;
	}
	
	
	
	
	}
