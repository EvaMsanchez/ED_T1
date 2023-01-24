package es.studium.ejercicio20;

public class Principal
{

	public static void main(String[] args)
	{
		
		Empleado empleado1 = new Empleado ();
		empleado1.setNombre("Eva");
		empleado1.setApellidos("Sánchez López");
		empleado1.setDomicilio("Anfiteatro");
		empleado1.setTelefono(626000000);
		empleado1.setDni("12345678-A");
		empleado1.setPuesto("programadora");
		
		Empleado empleado2 = new Empleado ("Marcos", "López Sánchez", "Anfiteatro", 679000000, "11222333-M", "encargado");

		System.out.println(empleado1.getNombre()+" "+empleado1.getApellidos()+" "+empleado1.getDomicilio()+" "+empleado1.getTelefono()+" "+empleado1.getDni()+" "+empleado1.getPuesto());
		
		
		Consejero consejero1 = new Consejero ("Alejandro", "Alarcón Pérez", "C/ Jara nº1", 622000000, "12345678-A", "operador", 2);
		
		System.out.println("El consejero "+consejero1.getNombre()+" "+consejero1.getApellidos()+" vive en "+consejero1.getDomicilio()+", teléfono "+consejero1.getTelefono()+" dni "+consejero1.getDni()+" puesto "+consejero1.getPuesto()+" nº acciones "+consejero1.getNumeroAcciones());
		
	}

}
