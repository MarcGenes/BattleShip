package BattleShip;
import java.util.Scanner;

public class LeerDatosEntrada implements DatosEntrada{
	
	private Scanner read;
	
	LeerDatosEntrada()
	{
		read= new Scanner(System.in);
	}
	public int entrarCoordenadaX() 
	{
		return read.nextInt();
	}
	public int entrarCoordenadaY() 
	{
		return read.nextInt();
	}
	public int entrarCoordenadaDisparoX() 
	{
		return read.nextInt();
	}
	public int entrarCoordenadaDisparoY() 
	{
		return read.nextInt();
	}
	
	public String entrarPosicion() 
	{
		
		return read.next();
	}

}
