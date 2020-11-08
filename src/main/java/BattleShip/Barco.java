package BattleShip;
import java.util.ArrayList;

public class Barco {

	private int medida;
	private String tipo;
	private boolean hundido;
	private int tocado;
	ArrayList<String> coordenadas = new ArrayList<String>();
	ArrayList<Boolean>coordTocadas= new ArrayList<Boolean>();
	
	
	public Barco(int med, String tip) 
	{
		medida= med;
		tipo=tip;
		hundido=false;
		tocado=0;
		for(int i=0;i<medida;i++)
		{
			coordTocadas.add(false);
		}
		
		
	}
	public void agregarCoordenadas(int x, int y)
	{
		
	
			
			String sA = String.valueOf(x);
			String sB = String.valueOf(y);
	
			String res = sA + sB;
			
			
			coordenadas.add(res);
				
		
	}
	public boolean estaHundido() 
	{
		
		return 	hundido;
	
	}
	public int numeroTocado() 
	{
		return tocado;
	}
	public void sumarTocado() 
	{
		
		tocado++;
		if(tocado==medida) {hundido=true;}
	}
	public boolean comprobarCoordenadas(int x, int y) // comprobamos si existe coordenada, i si es asi tocamos el barco!
	{
		String sA = String.valueOf(x);
		String sB = String.valueOf(y);

		String res = sA + sB;
		
		int cont=0;
		boolean encontrado=false;
		if(estaHundido()==false) {
			while(cont<coordenadas.size() && encontrado ==false) 
			{
				
				if(coordenadas.get(cont).equals(res) && coordTocadas.get(cont)==false)
				{
					encontrado=true;
					coordTocadas.add(cont, true);
					
				}
				
				
				cont++;
			}
		}
		return encontrado;
		
	}
	
	public void pintarCoordenadas() 
	{
		for(int i =0; i<coordenadas.size();i++) 
		{
			System.out.print(coordenadas.get(i));
			System.out.print(" ; ");
			
		}
		System.out.println();
	}
	
	

	public int getMedida() {
		return medida;
	}

	

	public String getTipo() {
		return tipo;
	}


}
