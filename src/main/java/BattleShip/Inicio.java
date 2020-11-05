package BattleShip;
import java.util.Scanner;

public class Inicio {

	public static void main (String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		
		while(salir)
		{
			try 
			{
				System.out.println("Entra 1: Normas");
				System.out.println("Entra 2: Jugar");
				System.out.println("Entra 3: Salir");
				int op = sc.nextInt();
				switch(op)
				{
					case 1:
						salir=true;
						 System.out.println("Hay 4 tipos de Barcos");
						  System.out.println(" 2 Portaaviones que ocupan 4 casillas cada uno ");
						  System.out.println(" 2 Destructores que ocupan 3 casillas cada uno");
						  System.out.println(" 2 Fragatas que ocupan 2 casillas cada uno");
						  System.out.println(" 2 Submarinos que ocupan 1 casilla cada uno \n");
						  System.out.println(" Por lo tanto 8 barcos en total que ocupan 20 casillas\n");
						  
						  System.out.println(" EL TABLERO TIENE TAMAÑO FIJO DE 8 por 8 ( total 64 casillas)  \n");
						  System.out.println(" LOS 0 SON AGUA Y LOS 1 SERAN LOS BARCOS \n");
						
						  System.out.print("\n");
						  
						  System.out.println("PARA INTRODUCIR LOS BARCOS, INTRODUCE LOS NUMEROS DE LAS COORDENADAS DE LA PRIMERA CASILLA   \n"
						  		+ "DONDE QUIERAS COLOCAR EL BARCO Y LA POSICION VERTICAL U HORIZONTAL ( V o H ), \n"
						  		+ "FIJATE BIEN DONDE COLOCAS EL BARCO YA QUE LA POSICION SIEMPRE SERAN HACIA LA DERECHA(H) O HACIA ABAJO(V)."
						  		+ "EN LOS SUBMARINOS DE 1 CASILLA ES INDIFERENTE PONER H O V, SE PONDRA ,SI ESTA LIBRE, EN LAS COORDENADAS SELECCIONADAS");
						  System.out.println("\n");
						  System.out.println("---------------------------------- \n");
						  System.out.println ("LA DINÀMICA DEL JUEGO ES POR TURNOS COMPLETOS. ES DECIR, EL JUGADOR 1, COLOCA TODOS SUS BARCOS EN EL TABLERO. "
								+ "UNA VEZ COLOCADOS, ES EL TURNO DEL JUGADOR 2, QUE DEBE INTETNTAR HUNDIRLOS. TENDRÀ 45 INTENTOS PARA ELLO. CUANTOS MAS HUNDA O TOQUE MEJOR "
								+ "UNA VEZ EL JUGADOR 2 HAYA AGOTADO SUS TIRADAS O HUNDIDO TODOS LOS BARCOS, CREARÁ ÉL SU TABLERO, I SERÁ EL TURNO DEL JUGADOR 1 DE INTENTAR HUNDIR "
								+ "O TOCAR EL MAXIMO DE BARCOS POSSIBLES. "
								+ "QUIEN MÀS HUNDIDOS Y/O TOCADOS TENGA, GANA LA PARTIDA. \n");
						break;
					case 2:
						salir = true;
						Juego juego = new Juego();
						juego.ColocarBarcos();
						//juego.jugar();
						break;
					case 3:
						salir = true;
						System.out.println("Gracias por Jugar!");
						break;
					default:
						System.out.println("Debes introducir un numero del 1 al 3.");
						System.out.println();
				}
			} catch(Exception e) {
				System.out.println("Debes introducir un numero del 1 al 3");
				System.out.println();
				sc.next();
			}
		}
		sc.close();
	
	}
	
}
