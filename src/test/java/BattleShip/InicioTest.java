package BattleShip;


import org.junit.Test;

public class InicioTest {
	
	@Test
	public void testmenuInicio() 
	{
		Inicio ini = new Inicio();
		
		MockDatosInicio mckI = new MockDatosInicio();
    	
		mckI.datosMenu(1); //entrada de barco del usuario (j1)
		ini.tipoDatos(mckI);
		ini.main(null);
 
        Inicio ini2 = new Inicio();
		
	}

}
