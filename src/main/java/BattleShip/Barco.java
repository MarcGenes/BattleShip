package BattleShip;
import java.util.ArrayList;

public class Barco {

	private int medida;
	private String tipo;
	private boolean hundido;
	private int tocado;
	ArrayList<String> coordenadas = new ArrayList<String>();
	
	public Barco(int med, String tip) 
	{
		medida= med;
		tipo=tip;
		hundido=false;
		tocado=0;
		
		
	}
	public void agregarCoordenadas(int x, int y)
	{
		if(coordenadas.size()<medida) {
			String sA = String.valueOf(x);
			String sB = String.valueOf(y);
	
			String res = sA + sB;
			
			
			
			coordenadas.add(res);
		}else {System.out.println("ERROR mas coordenadas que medida del barco");}
	
		
		
	}
	public boolean estaHundido() 
	{
		if(tocado==medida) 
		{
			hundido = true;
		}
		
		return hundido;
	
	}
	public int numeroTocado() 
	{
		return tocado;
	}
	public boolean comprobarCoordenadas(int x, int y)
	{
		String sA = String.valueOf(x);
		String sB = String.valueOf(y);

		String res = sA + sB;
		
		int cont=0;
		boolean encontrado=false;
		if(estaHundido()==false) {
			while(cont<coordenadas.size() && encontrado ==false) 
			{
				
				if(coordenadas.get(cont).equals(res))
				{
					encontrado=true;
					tocado++;
					
				}
				
				
				cont++;
			}
		}else {System.out.println("Este barco ya esta hundido!!");}
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
