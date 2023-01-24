package es.studium.ejercicio07;

public class Coche
{

	private String fabricante;
	private String modelo;
	private int ano;
	private boolean gasolina;
	
	public Coche ()
	{
		fabricante = "";
		modelo = "";
		ano = 0;
		gasolina = false;
	}
	
	public Coche (String fa, String mod, int a, boolean ga)
	{
		fabricante = fa;
		modelo = mod;
		ano = a;
		gasolina = ga;
	}

	public String getFabricante()
	{
		return fabricante;
	}

	public void setFabricante(String fabricante)
	{
		this.fabricante = fabricante;
	}

	public String getModelo()
	{
		return modelo;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	public int getAno()
	{
		return ano;
	}

	public void setAno(int ano)
	{
		this.ano = ano;
	}

	public boolean isGasolina()
	{
		return gasolina;
	}

	public void setGasolina(boolean gasolina)
	{
		this.gasolina = gasolina;
	}
	
}
