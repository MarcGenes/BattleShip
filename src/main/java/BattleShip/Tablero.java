package BattleShip;

public class Tablero {
	
	private int size;
	private boolean [][] tab;
	
		
	public Tablero (int s) {
		size=s;
		tab = new boolean[size][size];
	}
	
	public int getSize() {
		return size;
	}

	
	
}
