package es.studium.ejercicio19;

public class Cuenta
{

	private Cliente cliente;
	private int numeroCuenta;
	private double saldo;
	
	public Cuenta ()
	{
		cliente = new Cliente();
		numeroCuenta = 0;
		saldo = 0.0;		
	}
	
	public Cuenta (Cliente c, int nc, double s)
	{
		cliente = c;
		numeroCuenta = nc;
		saldo = s;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

	public int getNumeroCuenta()
	{
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta)
	{
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo()
	{
		return saldo;
	}

	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}
	
}
