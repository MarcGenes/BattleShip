package BattleShip;

public class Barco {

	private int medida;
	private String tipo;
	
	public Barco(int med, String tip) 
	{
		medida= med;
		tipo=tip;
		
	}

	public int getMedida() {
		return medida;
	}

	public void setMedida(int medida) {
		this.medida = medida;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
