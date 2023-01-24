package es.studium.ejercicio19;

public class TestBanco
{

	public static void main(String[] args)
	{
		Cliente cliente1 = new Cliente ("Antonio Alonso", "C/ Jara", "11222333N");
		Cliente cliente2 = new Cliente ("Beatriz Benítez", "C/ Romero", "44555666A");
		
		Cuenta cuenta1 = new Cuenta (cliente1, 1234567890, 100.0);
		Cuenta cuenta2 = new Cuenta (cliente2, 1357911131, 200.0);

		System.out.println("La cuenta de "+cuenta1.getCliente().getNombre()+" tiene "+cuenta1.getSaldo());
		System.out.println("La cuenta de "+cuenta2.getCliente().getNombre()+" tiene "+cuenta2.getSaldo());
		
		cuenta1.setSaldo(cuenta1.getSaldo()+50);
		cuenta2.setSaldo(cuenta2.getSaldo()-50);
		
		System.out.println("La cuenta de "+cuenta1.getCliente().getNombre()+" tiene "+cuenta1.getSaldo());
		System.out.println("La cuenta de "+cuenta2.getCliente().getNombre()+" tiene "+cuenta2.getSaldo());
		
	}

}
