package es.studium.ejercicio03;

public class Principal
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Empleado empleado1 = new Empleado ();
		empleado1.setNombre("Eva Mar�a");
		empleado1.setApellidos("S�nchez L�pez");
		empleado1.setDni("47013590");
		empleado1.setDomicilio("Anfiteatro,19");
		empleado1.setPuesto("Programadora");
		empleado1.setTelefono(626385143);
		
		System.out.println(empleado1.getNombre()+" "+empleado1.getApellidos()+" "+empleado1.getDni()+" "+empleado1.getDomicilio()+" "+empleado1.getPuesto()+" "+empleado1.getTelefono());

		Empleado empleado2 = new Empleado("Jorge", "S�nchez Garc�a", "34231232", "Avda. La Paz, n�3", "Programador", 954654756);
		
		System.out.println(empleado2.getNombre()+" "+empleado2.getApellidos()+" "+empleado2.getDni()+" "+empleado2.getDomicilio()+" "+empleado2.getPuesto()+" "+empleado2.getTelefono());
	}

}
