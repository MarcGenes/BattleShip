package BattleShip;

public class Tablero {
	
	private int size;
	private int [][] tab;

	 final int  AGUA = 0;
	 final int  BARCO = 1;
	 
		
	public Tablero (int s) {
		size=s;
		tab= new int [size][size];
		LlenarTableroAgua();
	}
	
	public int getSize() {
		return size;
	}
	
	public void llenarTablero(int posI, int posJ, int valor) 
	{
		tab[posI][posJ]=valor;	
	}

	public void LlenarTableroAgua() {
		  
		  for(int i =0; i<getSize();i++)
		  {
			  for(int j=0; j<getSize();j++) 
			  {
				  llenarTablero(i, j, AGUA);
			  }
		  }
	  }
	  
	public void mostrarTablero() 
	{
		System.out.print("X  ");
		for(int x=0; x<getSize();x++)
		{
			System.out.print(x);
		}
		System.out.print("\n");
		System.out.print("Y");
		System.out.print("\n");
		for(int i =0; i<getSize();i++) 
		{
			System.out.print(" "+ (i) + " ");
			for(int j =0; j<getSize();j++) 
			{
				System.out.print(tab[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public int valorPosicion(int x, int y){
		return tab[x][y];
	}
	
	public boolean casillaOcupada(int x, int y, String pos, int medida){
		boolean ocupada = false;
		if(pos=="V"){
			int conty = y+1;
			while(conty<medida && ocupada==false){
				if(valorPosicion(x,conty)==BARCO){ocupada=true;}
				else{ conty ++;
				}
			}
		}if(pos=="H"){
			int contx = x+1;
			while(contx<medida && ocupada==false){
				if(valorPosicion(contx,y)==BARCO){ocupada=true;}
				else{ contx ++;
				}
			}
		}
		return ocupada;
	}
	public boolean addBarco(int x, int y, String pos, int medida) 
	{
		System.out.println(x+" "+y);
		boolean barcoOK = true;
		if(x<0 || y<0 || x>7 || y>7){barcoOK = false;}
		if(barcoOK==true && valorPosicion(x,y)==BARCO){barcoOK = false;} 
		if(barcoOK==true && pos=="H" && x+(medida-1)>7){barcoOK = false;}
		if(barcoOK==true && pos=="V" && y+(medida-1)>7){barcoOK = false;}
		if(barcoOK==true && casillaOcupada(x,y,pos, medida)==true){barcoOK= false;}
		if(barcoOK == true ){
			if( pos.equals("V")){
				for(int i=y; i<=y+(medida-1); i++){
					llenarTablero(i,x,BARCO);
				}
			}
			if( pos.equals("H")){
				for(int j=x; j<=x+(medida-1);j++) 
				{
					llenarTablero(y,j,BARCO);
				}
					
				
			}
			
		}
		return barcoOK;
}
	
	
	 public boolean ComprobarTablero(){
		 boolean var = true;
		 for (int i=0; i<getSize(); i++){
			 for(int j=0; j<getSize(); j++){
				 if(tab[i][j]!= 0){ var=false;}
			 }
		 }
		  return var;
	  }
	 
	
}
