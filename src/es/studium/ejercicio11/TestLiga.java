package es.studium.ejercicio11;

public class TestLiga
{

	public static void main(String[] args)
	{
		Equipo equipo1 = new Equipo ("Real Betis Balompié", 1800, 50000);
		Equipo equipo2 = new Equipo ("Sevilla F.C.", 1775, 32000);
		
		Futbolista futbolista1 = new Futbolista ("Joaquín", "Sánchez", true, equipo1);
		Futbolista futbolista2 = new Futbolista ("Jesús", "Navas", true, equipo2);
		Futbolista futbolista3 = new Futbolista ("Diego", "Lainez", false, equipo1);
		Futbolista futbolista4 = new Futbolista ("Franco", "Vázquez", true, equipo2);

		System.out.println(futbolista1.getNombre()+" "+futbolista1.getApellido()+" juega en "+futbolista1.getEquipo().getNombre());
		System.out.println(futbolista2.getNombre()+" "+futbolista2.getApellido()+" juega en "+futbolista2.getEquipo().getNombre());
		System.out.println(futbolista3.getNombre()+" "+futbolista3.getApellido()+" juega en "+futbolista3.getEquipo().getNombre());
		System.out.println(futbolista4.getNombre()+" "+futbolista3.getApellido()+" juega en "+futbolista4.getEquipo().getNombre());
		
	}

}
