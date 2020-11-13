/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BattleShip;

import static org.junit.Assert.*;
import org.junit.Test;

public class JuegoTest {
	    Juego juego = new Juego();
	    
	    @Test
	    public void JuegoCompletoTestMock() 
	    {
	    	
	 
	    	Jugador j1 = new Jugador("j1");
	    	Jugador j2 = new Jugador("j2");
	    	
	    	
	    	
	    	
	    	MockDatosEntrada mck = new MockDatosEntrada();
	    	
	    	mck.entradasTeclado(1); //entrada de barco del usuario (j1)
	    	juego.tipoEntradaDatos(mck);
	    	juego.colocarBarcos(); // esto lo hace automaticamente el mock.
	    	mck.entradasTeclado(2); // hay que poner la opcion 2 para que coja los datos de disparar.
	    	juego.jugar(j1); // aqui le pasamos el jugador que juega, pero las entradas las mete el mock.
	    	
	    	int hun= j1.numeroHundidos();
	    	int toc =j1.numeroTocados();
	    	assertEquals(hun,4);
	    	assertEquals(toc,9);
	    	
	        juego.resetTablerosYBarcos();
	    	
	    	mck.entradasTeclado(3);
	    	juego.tipoEntradaDatos(mck);
	    	juego.colocarBarcos();
	    	mck.entradasTeclado(4);
	    	juego.jugar(j2);
	    	
	    	int hun2= j2.numeroHundidos();
	    	int toc2 =j2.numeroTocados();
	    	assertEquals(hun2,4);
	    	assertEquals(toc2,10);
	    	
	    	juego.determinarGanador(j1, j2);
	    	
	    }
	    @Test
	    public void inicioPartidaJuegoManual()  //este test solo se comprueba 
	    //el metodo de inicio, al hacer una aprtida manualmente.
	    {
	    	
	    	
	    	Jugador j1 = new Jugador("j1");
	    	Jugador j2 = new Jugador("j2");
	    	
	    	
	    	//juego.inicioPartida(j1, j2);
	    }

	 
		@Test
		public void ConstructorTest() {

			int res1= juego.comprobarListaBarcos();
			assertEquals(res1,8);		
			
		}
		@Test
		public void DeterminarJugador() 
		{
			
			Juego juego = new Juego();
			Jugador j1 = new Jugador("Jugador1");
			Jugador j2 = new Jugador("Jugador2");
			
			//EL JUGADOR1 HA HUNDIDO LOS 8 BARCOS Y POR TANTO GANA
			j1.ponerGanador(true);
			j2.ponerGanador(false);
			juego.determinarGanador(j1,j2);
			assertEquals(j1.esGanador(),true);
			assertEquals(j2.esGanador(),false);
			
			
			//EL JUGADOR2 HA HUNDIDO LOS 8 BARCOS Y POR TANTO GANA 
			j1.ponerGanador(false);
			j2.ponerGanador(true);
			juego.determinarGanador(j1,j2);
			assertEquals(j1.esGanador(),false);
			assertEquals(j2.esGanador(),true);
			
			//LOS DOS GANAN Y POR TANTO LOS DOS HAN HUNDIDO EL MISMO NUMERO DE BARCOS
			j1.ponerGanador(true);
			j2.ponerGanador(true);
			juego.determinarGanador(j1,j2);
			assertEquals(j1.esGanador(),true);
			assertEquals(j2.esGanador(),true);
			
			//NINGUNO HA HUNDIDO TODOS LOS BARCOS PERO EL JUGADOR1 HA TOCADO MAS
			j1.ponerGanador(false);
			j2.ponerGanador(false);
			j1.sumarTocados();
			j1.sumarTocados();
			j2.sumarTocados();
			juego.determinarGanador(j1,j2);
			assertEquals(j1.esGanador(),true);
			assertEquals(j2.esGanador(),false);
			j1.reinciarTocados();
			j2.reinciarTocados();
			
			//NINGUNO HA HUNDIDO TODOS LOS BARCOS PERO EL JUGADOR2 HA TOCADO MAS
			j1.ponerGanador(false);
			j2.ponerGanador(false);
			j2.sumarTocados();
			j2.sumarTocados();
			j1.sumarTocados();
			juego.determinarGanador(j1,j2);
			assertEquals(j1.esGanador(),false);
			assertEquals(j2.esGanador(),true);
			j1.reinciarTocados();
			j2.reinciarTocados();
			
			
			//LOS DOS JUGADORES HAN HUNDIDO EL MISMO NUMERO DE BARCOS Y TOCADO EL MISMO NUMERO POR TANTO EMPATAN
			j1.ponerGanador(false);
			j2.ponerGanador(false);
			j1.sumarTocados();
			j1.sumarTocados();
			j2.sumarTocados();
			j2.sumarTocados();
			juego.determinarGanador(j1,j2);
			assertEquals(j1.esGanador(),true);
			assertEquals(j2.esGanador(),true);
	
			
			
		}
		
	
}

