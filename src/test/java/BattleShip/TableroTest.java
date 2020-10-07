package BattleShip;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableroTest {

	 public void testConstructor() 
	    
	 {
	    	Tablero t1 = new Tablero(10);
	    	
	    	assertTrue(t1.getTamaño()== 10);
	    	assertFalse(t1.getTamaño()==12);
	    	
	 }

}
