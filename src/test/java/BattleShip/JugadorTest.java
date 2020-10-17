package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class JugadorTest {

	@Test
	public void test() {
		
		Jugador j1 = new Jugador("juan");
		assertEquals(j1.getNombre(),"juan");
		
	}

}
