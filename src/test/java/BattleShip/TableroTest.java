package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableroTest {
	Tablero t1 = new Tablero(8);
	@Test
	public void testConstructor() {
		assertTrue(t1.getSize()== 8);
		assertFalse(t1.getSize()==12); 	
	}

	@Test
	public void testComprobarTablero(){
		assertTrue(t1.ComprobarTablero()==true);
	}
	@Test
	public void testAddBarco(){
		Barco b = new Barco(4,"prueba");
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
		
		
		
		t1.LlenarTableroAgua();// reiniciar tablero.
		
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
}