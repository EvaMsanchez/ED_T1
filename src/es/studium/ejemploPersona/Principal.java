package es.studium.ejemploPersona;

public class Principal
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona ();
		persona1.setNombre("Mar�a Jos�");
		persona1.setApellidos("Mart�nez Navas");
		persona1.setEdad(22);
		persona1.setHaPagado(true);
		
		
		System.out.println(persona1.getNombre());
		
		Persona persona2 = new Persona ("Javier", "Romero Mart�nez", 20, true);
		
		System.out.print(persona2.getNombre()+ " ");
		System.out.println(persona2.getApellidos());
		System.out.println(persona2.getEdad());
		System.out.println(persona2.getHaPagado());
		
		System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " " + persona2.getEdad() + " " + persona2.getHaPagado());

	}

}
