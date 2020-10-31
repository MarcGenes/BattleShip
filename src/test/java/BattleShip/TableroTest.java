package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableroTest {
	Tablero t1 = new Tablero(10);
	@Test
	public void testConstructor() {
		

		assertTrue(t1.getSize()== 10);
		assertFalse(t1.getSize()==12); 	
	}

	@Test
	public void testComprobarTablero(){
		assertTrue(t1.ComprobarTablero()==true);
	}
	
}