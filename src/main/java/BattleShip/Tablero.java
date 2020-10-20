package BattleShip;

public class Tablero {
	
	private int size;
	private int [][] tab;
	
		
	public Tablero (int s) {
		size=s;
		tab= new int [size][size];
	}
	
	public int getSize() {
		return size;
	}
	
	public void llenarTablero(int posI, int posJ, int valor) 
	{
		tab[posI][posJ]=valor;
		
	}

	public void mostrarTablero() 
	{
		System.out.print("X  ");
		for(int x=0; x<getSize();x++)
		{
			
			System.out.print(x+1);
			
		}
		System.out.print("\n");
		System.out.print("Y");
		System.out.print("\n");
		for(int i =0; i<getSize();i++) 
		{
			System.out.print(" "+ (i+1) + " ");
			for(int j =0; j<getSize();j++) 
			{
				
				System.out.print(tab[i][j]);
				
			}
			System.out.print("\n");
			
		}
	}
	public void addBarco(int x, int y, String pos) 
	{
		
		// TODO
		
	}
	
}
