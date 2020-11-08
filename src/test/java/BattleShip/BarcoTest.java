package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class BarcoTest {

	@Test
	public void test() {
		
		Barco bar = new Barco(4,"Prueba");
		
		int med = bar.getMedida(); // la medida del barco està establezida no la entra el usuario,
		// pero comprovamos que el metodo funciona bien.
		assertEquals(med,4);
		
		String tip = bar.getTipo();// lo mismo pasa con el tipo, ya esta establezido por el juego,
		assertEquals(tip,"Prueba"); // pero lo comprobamos.

		int toc = bar.numeroTocado(); 
		assertEquals(toc,0);
		
		
		bar.agregarCoordenadas(0,1);
		
		assertTrue(bar.comprobarCoordenadas(0, 1)==true); // suma ++  a tocado al encontrar una coordenada que coninciida con el
		
		assertTrue(bar.comprobarCoordenadas(3, 5)==false);
		
		
		
		int toc2 = bar.numeroTocado(); 
		assertEquals(toc2,1);
		
		//comprovamos que un barco con un solo toque no esta hundido, ya que es de medida 4.
		assertTrue(bar.estaHundido()==false);
		
		// afegim coordenades dun barco V

		bar.agregarCoordenadas(0,2);
		bar.agregarCoordenadas(0,3);
		bar.agregarCoordenadas(0,4);
		
		//comrpobamos si estan todas las coordenadas
		assertTrue(bar.comprobarCoordenadas(0, 2)==true);
		assertTrue(bar.comprobarCoordenadas(0, 3)==true);
		assertTrue(bar.comprobarCoordenadas(0, 4)==true);

		
		int toc3 = bar.numeroTocado(); 
		System.out.println(toc3);
		assertEquals(toc3,4); // comprovamos que se ha tocado las 4 coordenadas del barco i sumamos 4 tocados
		
		// per tant esta enfonsat
		assertTrue(bar.estaHundido()==true); // por lo tanto esta hundido
		assertTrue(bar.comprobarCoordenadas(0, 4)==false); // volvemos a comprobar coordenadas del mismo barco
		assertTrue(bar.estaHundido()==true); // comprovamos que continua hundido
		int toc4 = bar.numeroTocado(); 
		System.out.println(toc4);
		assertEquals(toc4,4); // i que no suma tocados
		
		bar.agregarCoordenadas(0,5); //error limite de coordenadas ( mostrado por si a caso en pantalla).
		//independiente del numero de las coordenadas, es el hecho de añadir más.
		
		//pintamos coordenadas entradas del barco
		
		
		bar.pintarCoordenadas();
		
		
		
		
	}

}
