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
	public void testGenerarTableroOK(){
	    	Tablero tab = new Tablero(8);
	    	tab.llenarTableroAgua();
	    	Tablero tab2 = new Tablero(8);
	    	tab.llenarTableroAgua();
	    	assertEquals(tab.equals(tab2),true);
	}
	
	@Test
	public void testAddBarco(){

		// TRUE (barcos bien colocados)
		assertTrue(t1.addBarco(0,0,"V",4,b)==true); //valor minimo de frontera de X e Y
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
		assertTrue(t1.addBarco(0, 7, "H", 1,b)==true); //barco en casilla Y de valor forntera
		t1.mostrarTablero();
		assertTrue(t1.addBarco(7, 7, "V", 1,b)==true); //barco en valor frontera de X e Y maximo
		t1.mostrarTablero();
		
		
		//FALSE
		//Comprobaciones varias: 
		//1-Alguna casilla Horizontal(no Ok) encima de alguna horizontal(ok),
		//2-Alguna casilla vertical(no ok) encima de alguna casilla vertical(ok),
		//3-Primera casilla encima de casilla ocupada.
		//4-Primera casilla fuera de tablero.
		//5-Casillas de una sola pieza encima de casillas ocupadas i fuera tableo.
		//6-Numeros de casilla negativos, o superiores a medida de tablero
		
		
		
		t1.llenarTableroAgua();// reiniciar tablero. LLeno deAgua. ( se comprueba este metodo al pintar-lo ) y a la vez se comprueva el metodo
		//mostrarTablero
		t1.mostrarTablero();
		
		
		//Particiones equivalentes de valores tanto positivos como negativos
		t1.mostrarTablero();
		assertTrue(t1.addBarco(5, 0, "H", 4,b )==false); //fuera de tablero por H
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 6, "V", 4 ,b)==false); //fuera de tablero por V
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 3, "H", 3,b)== true); // barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(4, 1, "V", 3,b)==false); //casilla  3 coincide con barco (2,3,H)
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 3, "V", 2,b)== false); //casilla 1 coincide con barco(2,3,H)
		t1.mostrarTablero();
		assertTrue(t1.addBarco(7, 7, "H", 2,b )==false); //Casilla fuera de tablero V con valores forntera, pero medida superior.
		t1.mostrarTablero();
		assertTrue(t1.addBarco(3, 3, "H", 1,b )==false); // casilla coincide con casilla ocupada del barco (2,3,H)
		t1.mostrarTablero();
		assertTrue(t1.addBarco(8, 3, "H", 1 ,b)==false); //Valor límite positivo de X
		t1.mostrarTablero();
		assertTrue(t1.addBarco(3, 8, "H", 1 ,b)==false); //Valor límite positivo de Y
		t1.mostrarTablero();
		assertTrue(t1.addBarco(9, 9, "H", 1 ,b)==false); //Valores superiores de X e Y
		t1.mostrarTablero();
		assertTrue(t1.addBarco(6, 3, "V", 3 ,b)==true); //barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(5, 0, "H", 3,b )==true); //barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(3, 0, "H", 3 ,b)==false); //casilla 3 coincide con barco(5,0,H);
		t1.mostrarTablero();
		assertTrue(t1.addBarco(4, 5, "H", 3,b )==false); //casilla 3 coincidecon barco(6,3,V)
		t1.mostrarTablero();
		assertTrue(t1.addBarco(-1, 0, "H", 2 ,b)==false); // valor limite negativo de X
		t1.mostrarTablero();
		assertTrue(t1.addBarco(3, -1, "H", 4 ,b)==false); //valor limite negativo de Y
		t1.mostrarTablero();
		assertTrue(t1.addBarco(3, 7, "H", 2,b )==true); //barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(2, 7, "H", 2 ,b)==false); //casilla 2 coincide con casilla de barco(3,7,H)
		t1.mostrarTablero();
		assertTrue(t1.addBarco(1, 3, "V", 2 ,b)==true); // barco ok
		t1.mostrarTablero();
		assertTrue(t1.addBarco(1, 2, "V", 2,b )==false); //casilla 2 coincide con casilla de barco(1,3,V)
		
		
		
	}
	
	@Test
	public void testValorPsoicion()  // en este metodo nunca habra� valores erroneos de x, e y, se comprueban anteriormente.
									//solo se comprueba la casilla introducida por el usuario al colocar el barco
	{
		t1.llenarTableroAgua();
		//agregamos 3 barcos de diferentes medidas
		t1.addBarco(1,0,"V",4,b); //1
	    t1.addBarco(5, 6, "H", 3,b); // 2
	    t1.addBarco(1, 4, "H", 4,b); //3
	    
	    t1.mostrarTablero();
	    
	    int res1 = t1.valorPosicion(1, 0); //casilla ocupada 1
	    assertEquals(res1,1);
	    
	    int res2 = t1.valorPosicion(5, 6); //casilla ocupada 2 
	    assertEquals(res2,1);
	    
	    int res3 = t1.valorPosicion(1, 4); //casilla ocupada 3
	    assertEquals(res3,1);
	    
	    int res4 = t1.valorPosicion(6, 5); //casilla libre (agua)
	    assertEquals(res4,0);
	    
	    
	    
		
		
	}
	@Test
	public void testCasillaOcupada() // este metodo solo se ejecuta para comprovar si poniendo un barco en una casilla libre
	                                 //alguna casilla de su medida ocupa o no un barco puesto anteriormente.
	                                 //en este metodo no se comprueba si la casilla introducida coincide o no. Se hace en el metodo valorPosicion();
									// aqui nunca llegarà una x, o una y  fuera de rango. ni una posicion o  medida erronia.                            
	{
		t1.llenarTableroAgua();
		//añadimos 3 barcos de diferentes medidas en posiciones libres.
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
	
	
	@Test
	public void testComprobarTirada() //este metodo comprueba si i actualiza una variable tocado dependiendo de si es agua o no.
	//muy parecido a valorPosicion(), retornando boolean en vez de int.
	//los valores x e y nuca seran erroneos pues se comprueban anteriormente
	{
		
		t1.llenarTableroAgua();
		t1.mostrarTablero();
		t1.addBarco(3,3,"V",4,b); //1
	    t1.addBarco(0, 6, "H", 3,b); // 2
	    t1.addBarco(4, 4, "H", 4,b);//3
	    t1.addBarco(0, 3, "V", 1, b);//4
	    t1.mostrarTablero();
	    
	    //Todas estas pruebas son pruebas de valor limite de los barcos colocados. tanto disparando fuera( agua)
	    //o tocando el barco (tocado)
	    
	    assertTrue(t1.comprobarTirada(3,2)==false) ;//agua
	    assertTrue(t1.comprobarTirada(3,3)==true) ;// tocado
	    assertTrue(t1.comprobarTirada(3,6)==true); //tocado
	    assertTrue(t1.comprobarTirada(4,6)==false);//agua
	    assertTrue(t1.comprobarTirada(0,5)==false) ;//agua
	    assertTrue(t1.comprobarTirada(0,7)==false) ;//agua
	    assertTrue(t1.comprobarTirada(2,6)==true) ;// tocado
	    assertTrue(t1.comprobarTirada(4,4)==true); //tocado
	    assertTrue(t1.comprobarTirada(7,4)==true);//tocado
	    assertTrue(t1.comprobarTirada(3,7)==false);//agua
	    assertTrue(t1.comprobarTirada(0,3)==true);//tocado
	    
	    
	}
}