/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BattleShip;
import java.util.*;

public class Juego {
	

 Tablero tab = new Tablero(8);
 ArrayList<Barco> barcos = new ArrayList<Barco>();
	  
	
 public Juego()	{
  
  
 
  Barco port1= new Barco (4,"Portaavion One");
  barcos.add(port1);
  Barco port2 = new Barco(4, "Portaavion Two");
  barcos.add(port2);
  Barco  des1 = new Barco (3,"Destructor One");
  barcos.add(des1);
  Barco des2 = new Barco(3, "Destructor Two");
  barcos.add(des2);
  Barco frag1 = new Barco (2,"Fragata One");
  barcos.add(frag1);
  Barco frag2 = new Barco(2, "Fragata Two");
  barcos.add(frag2);
  Barco sub1 = new Barco (1,"Submarino One");
  barcos.add(sub1);
  Barco sub2 = new Barco(1, "Submarino Two");
  barcos.add(sub2);
  
  
  
 }
  
 
  
  public void ColocarBarcos() 
  {
	  

	  int numB = 0;
	  boolean barcoOK = true;
	  Scanner reader = new Scanner(System.in);
	  while(numB<8) 
	  {
		  System.out.println("Introduce las coordenadas y la posicion del barco"+ (numB+1));
		  System.out.println(barcos.get(numB).getTipo());
		  System.out.println("Coordenada X: ");
		  int x = reader.nextInt();
		  System.out.println("Coordenada Y: ");
		  int y = reader.nextInt();
		  System.out.println("Posicion del Barco ( V o H ) ");
		  String pos = reader.next();
		  barcoOK =tab.addBarco(x, y, pos, barcos.get(numB).getMedida(),barcos.get(numB));
		  //guardar posicion en tablero de los barcos asi sabremos si estan tocados o hundidos
		  
		  if(barcoOK == false){
			 System.out.println("Las coordenadas o la posicion del barco incorrectas, sale de los limites del Tablero o posicion ocupada");
		  }else{
			  
			  numB++;
		  }
		 
		
		  tab.mostrarTablero();
	  }
	  
	  
	  
	  
  }
  public void Jugar()  // metodo con el bucle de jugar.
  {
	  int tiradas = 0;
	  int totalTiradas= 45;
	  Scanner reader2 = new Scanner(System.in);
	  
	  while(tiradas<totalTiradas) 
	  {
		  System.out.println("EMPIEZA LA TIRADA NUMERO"+ (tiradas+1) + " DE "+totalTiradas);
		  System.out.println("INTRODUCE LAS COORDENADAS QUE QUIERAS DISPARAR!");
		  System.out.println("introduce X");
		  int x = reader2.nextInt();
		  System.out.println("introduce Y");
		  int y = reader2.nextInt();
		  if((x > 7 || y > 7) || (x<0 || y<0)) 
		  {
			  System.out.println("ERROR: LAS COORDENADAS DEBEN ESTAR DENTRO DEL TABLERO");
		  }
		  else {
			  
			  boolean tocado = tab.comprobarTirada(x,y);
			  if(tocado == false) 
			  {
				  System.out.println("AGUA!!! NO HAS TOCADO NINGUN BARCO!");
				  
			  }else {
				  
				  int cont=0;
				  boolean encontrado= false;
				  while(cont< barcos.size() && encontrado ==false)
				  {
					  encontrado = barcos.get(cont).comprobarCoordenadas(x,y);
					  if(encontrado== true)
					  {
						  if(barcos.get(cont).estaHundido() == false) 
						  {
							  System.out.println(barcos.get(cont).getTipo()+" TOCADO!!!");
							  
						  }else {
							  System.out.println(barcos.get(cont).getTipo()+" HUNDIDO!!!");
							  
						  }
						 

					  }
					  cont++;
						    
				  }
			  
			  
			  
			  tiradas++;
		  }
		
			  
			  
			  
			  
		  }
		  
		  
	  }
	  
	  
  }
  
  
  
  
  

	
}
