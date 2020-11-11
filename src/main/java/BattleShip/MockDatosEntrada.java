package BattleShip;

import java.util.ArrayList;

public class MockDatosEntrada implements DatosEntrada{
	
	private ArrayList<Integer>coordX = new ArrayList<Integer>();
	private ArrayList<Integer>coordY= new ArrayList<Integer>();
	private ArrayList<Integer>coordDisparoX = new ArrayList<Integer>();
	private ArrayList<Integer>coordDisparoY= new ArrayList<Integer>();
	private ArrayList<String>posi = new ArrayList<String>();
	private int contX =0, contY=0, contP=0, contDisX=0, contDisY=0;
	
	public void entradasTeclado(int tipo) 
	{
	  if(tipo==1) //coordenadas de introduccion de barco
	  {
		    coordX.add(0);coordY.add(0);posi.add("V");
			coordX.add(1);coordY.add(1);posi.add("H");
			coordX.add(2);coordY.add(5);posi.add("V");
			coordX.add(5);coordY.add(6);posi.add("H");
			coordX.add(0);coordY.add(6);posi.add("V");
			coordX.add(5);coordY.add(3);posi.add("H");
			coordX.add(7);coordY.add(0);posi.add("V");
			coordX.add(7);coordY.add(7);posi.add("V");
	  }
	  if(tipo==2) //coordenadas de disparar a barcos
	  {
		  coordDisparoX.add(0);coordDisparoY.add(0);
		  coordDisparoX.add(2);coordDisparoY.add(2);//agua
		  coordDisparoX.add(7);coordDisparoY.add(0);
		  coordDisparoX.add(8);coordDisparoY.add(8); //error
		  coordDisparoX.add(5);coordDisparoY.add(6);
		  coordDisparoX.add(0);coordDisparoY.add(0);// ya disparada!
		  coordDisparoX.add(2);coordDisparoY.add(5);
		  
		  //continuar metiendo coordenadas hasta 45. si no se meten sale ya disparadas pero es normal.
		  
		   
		  
	  } //datos entrada de INICIO
	  

		
		
	}
	public int entrarCoordenadaX() 
	{
		int res=0;
		if(contX<coordX.size()) 
		{
			res= coordX.get(contX);
			contX++;
			
		}
	    return res;
		
		
	}
	public int entrarCoordenadaY() 
	{
		int res=0;
		if(contY<coordY.size()) 
		{
			res= coordY.get(contY);
			contY++;
			
		}
	    return res;
		
		
	}
	
	
	public String entrarPosicion() 
	{

		String res="";
		if(contP<posi.size()) 
		{
			res= posi.get(contP);
			contP++;
			
		}
	    return res;
		
		
	}
	
	public int entrarCoordenadaDisparoX() 
	{
		int res=0;
		if(contDisX<coordDisparoX.size()) 
		{
			res= coordDisparoX.get(contDisX);
			contDisX++;
			
		}
	    return res;
		
		
	}
	public int entrarCoordenadaDisparoY() 
	{
		int res=0;
		if(contDisY<coordDisparoY.size()) 
		{
			res= coordDisparoY.get(contDisY);
			contDisY++;
		}
	    return res;
		
		
	}
	
	

}
