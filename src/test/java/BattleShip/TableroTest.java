package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableroTest {
	Tablero t1 = new Tablero(8);
	Barco b = new Barco(4,"prueba");
	@Test
	public void testConstructor() {
		assertTrue(t1.getSize()== 8);
		assertFalse(t1.getSize()==12); 	
	}

	@Test
	public void testComprobarTablero(){
		assertTrue(t1.comprobarTablero()==true);
	}
	@Test
	public void testAddBarco(){

		//TRUE
		assertTrue(t1.addBarco(0,0,"V",4,b)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(1, 1 , "H", 4,b)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(5, 6, "H", 3,b)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 5, "V", 3,b)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(4, 3, "H", 2,b)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(6, 0, "V", 2,b)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(0, 7, "H", 1,b)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 3, "V", 1,b)==true);
		t1.mostrarTablero();
		//FALSE
		//comprobaciones varias: alguna casilla Horizontal(no Ok) encima de alguna horizontal(ok),
		//alguna casilla vertical(no ok)
		//encima de alguna casilla vertical(ok), primera casilla encima de casilla ocupada.
		//primera casilla fuera de tablero. casillas de una sola pieza encima de casillas ocupadas i fuera tableo.
		//numeros de casilla negativos, o superiores a medida de tablero
		
		
		
		t1.llenarTableroAgua();// reiniciar tablero. LLeno deAgua.
		
		t1.mostrarTablero();
		assertTrue(t1.addBarco(5, 0, "H", 4,b )==false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 6, "V", 4 ,b)==false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 3, "H", 3,b)== true); // barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(4, 1, "V", 3,b)==false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 3, "V", 2,b)== false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(7, 7, "H", 2,b )==false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(3, 3, "H", 1,b )==false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(9, 9, "H", 1 ,b)==false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(6, 3, "V", 3 ,b)==true); //barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(5, 0, "H", 3,b )==true); //barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(3, 0, "H", 3 ,b)==false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(4, 5, "H", 3,b )==false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(-1, 0, "H", 2 ,b)==false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(3, -1, "H", 4 ,b)==false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(3, 7, "H", 2,b )==true); //barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 7, "H", 2 ,b)==false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(1, 3, "V", 2 ,b)==true); // barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(1, 2, "V", 2,b )==false);
		
		
		
	}
	
	@Test
	public void testValorPsoicion()  // en este metodo nunca habrà valores erroneos de x, e y, se comprueban anteriormente.
	{
		t1.llenarTableroAgua();
		//añadimos 3 barcos de diferentes medidas
		t1.addBarco(1,0,"V",4,b); //1
	    t1.addBarco(5, 6, "H", 3,b); // 2
	    t1.addBarco(1, 4, "H", 4,b); //3
	    
	    t1.mostrarTablero();
	    
	    int res1 = t1.valorPosicion(1, 0); //casilla ocupada
	    assertEquals(res1,1);
	    
	    int res2 = t1.valorPosicion(5, 6); //casilla ocupada
	    assertEquals(res2,1);
	    
	    int res3 = t1.valorPosicion(1, 4); //casilla ocupada
	    assertEquals(res3,1);
	    
	    int res4 = t1.valorPosicion(6, 5); //casilla libre (agua)
	    assertEquals(res4,0);
	    
	    
	    
		
		
	}
	@Test
	public void testCasillaOcupada() // este metodo solo se ejecuta para comprovar si poniendo un barco en una casilla,
	                                 //alguna casilla de su medida ocupa o no un barco puesto anteriormente.
	                                 //en este metodo no se comprueba si la casilla introducida coincide o no. Se hace en el metodo valorPosicion();
									// aqui nunca llegarà una x, o una y  fuera de rango. ni una posicion o  medida erronia.
	{
		t1.llenarTableroAgua();
		//añadimos 3 barcos de diferentes medidas
		t1.addBarco(1,0,"V",4,b); //1
	    t1.addBarco(5, 6, "H", 3,b); // 2
	    t1.addBarco(1, 4, "H", 4,b); //3
	    
	    t1.mostrarTablero();
	    
	    assertTrue(t1.casillaOcupada(0, 1, "H", 4)==true); // hacemos coincidir la segunda casilla de este,  con una casilla del barco 1.
	    assertTrue(t1.casillaOcupada(5, 5, "V", 2)==true); // Hacemos coincidir la seguna casilla de este, con alguna casilla del barco numero 2.
	    assertTrue(t1.casillaOcupada(4, 2, "V", 3)==true); // Hacemos coincidir la ultima casilla de este, con  alguna casilla del barco numero 3.
	    
	    assertTrue(t1.casillaOcupada(2, 5, "V", 3)==false); // este barco no deberia coincidir con ninguno.
	    
	    assertTrue(t1.casillaOcupada(0, 7, "H", 3)==false); // este barco tampoco deberia coincidir con ninguna.
	    
	    
	    
	    
	    
	    
	    
		
	}
}