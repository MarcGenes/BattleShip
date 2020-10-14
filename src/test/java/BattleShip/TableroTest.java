package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableroTest {
	@Test
	public void testConstructor() {
   	Tablero t1 = new Tablero(10);
   	assertTrue(t1.getSize()== 10);
   	assertFalse(t1.getSize()==12); 	
	}
	
	
	
}