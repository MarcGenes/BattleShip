package BattleShip;

public class Jugador {
	
	private String nombre;
	private boolean ganador;
	private int hundidos;
	private int tocados;
	private boolean colocado;
	private boolean disparado;
	
	
	public Jugador(String nom)
	{
		nombre=nom;
		ganador=false;
		hundidos=0;
		tocados=0;
		colocado=false;
		disparado=false;
		
	}
	public void ColocadoBarcos() 
	{
		colocado=true;
	}
	public void DispardoBarcos() 
	{
		disparado=false;
	}
	public boolean haColocadoTodos() 
	{
		return colocado;
		
		
	}
	public boolean haDisparadoTodos()
	{
		return disparado;
	}
	public void ponerGanador(boolean gan) 
	{
		ganador=gan;
		
	}
	public String retNombre()
	{
		return nombre;
	}
	public boolean esGanador()
	{
		return ganador;
	}
	public void sumarTocados()
	{
		tocados++;
	}
	public int numeroTocados()
	{
		return tocados;
	}
	public void sumarHundidos()
	{
		
		hundidos++;
	}
	public int numeroHundidos() 
	{
		return hundidos;
	}
}
