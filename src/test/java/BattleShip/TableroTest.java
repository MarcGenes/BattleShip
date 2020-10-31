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
		//TRUE
		assertTrue(t1.addBarco(0,0,"V",4)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(1, 1 , "H", 4)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(5, 6, "H", 3)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 5, "V", 3)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(4, 3, "H", 2)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(6, 0, "V", 2)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(0, 7, "H", 1)==true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 3, "V", 1)==true);
		t1.mostrarTablero();
		//FALSE
		t1.LlenarTableroAgua();
		t1.mostrarTablero();
		assertTrue(t1.addBarco(5, 0, "H", 4 )==false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 6, "V", 4 )==false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 3, "H", 3)== true);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(4, 1, "V", 3)==false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 3, "V", 2)== false);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(7, 7, "H", 2 )==false);
		assertTrue(t1.addBarco(3, 3, "H", 1 )==false);
		assertTrue(t1.addBarco(9, 9, "H", 1 )==false);
		assertTrue(t1.addBarco(0, 0, "V", 2 )==false);
		assertTrue(t1.addBarco(-1, 0, "H", 2 )==false);
		assertTrue(t1.addBarco(3, -1, "H", 4 )==false);
		
		
	}
}