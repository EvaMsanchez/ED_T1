package es.studium.ejercicio01;

public class Principal
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona ();
		persona1.setNombre("Eva Mar�a");
		persona1.setApellidos("S�nchez L�pez");
		persona1.setDni("47013590-A");
		persona1.setDomicilio("Anfiteatro,19");
		persona1.setTelefono(626385143);
		
		System.out.println(persona1.getNombre()+" " + persona1.getApellidos()+" " + persona1.getDni()+" " + persona1.getDomicilio()+" " + persona1.getTelefono());
		
		Persona persona2 = new Persona ("Jorge", "S�nchez Garc�a", "34231232", "Avda. La Paz, n�3", 954654756);

		System.out.println(persona2.getNombre()+" " + persona2.getApellidos()+" " + persona2.getDni()+" " + persona2.getDomicilio()+" " + persona2.getTelefono());;
	}

}
