package BattleShip;

import static org.junit.Assert.*;
import org.junit.Test;



public class JugadorTest {

	
	@Test
	public void test() {
		
		Jugador jug = new Jugador("jugador");
		
		assertFalse(jug.haDisparadoTodos()==true);
		assertFalse(jug.haColocadoTodos()==true);
		
		jug.ColocadoBarcos();
		assertTrue(jug.haColocadoTodos()==true);
		jug.DisparadoBarcos();
		assertTrue(jug.haDisparadoTodos()==true);
		assertFalse(jug.haDisparadoTodos()==false);
		String nom = jug.retNombre();
		assertEquals(nom,"jugador");
		jug.ponerGanador(true);
		assertTrue(jug.esGanador()==true);
		jug.sumarTocados();//suma ++
		int toc = jug.numeroTocados();
		assertEquals(toc,1);
		jug.sumarHundidos();//suma ++
		int hun = jug.numeroHundidos();
		assertEquals(hun,1);
		
		
		
	}
}
