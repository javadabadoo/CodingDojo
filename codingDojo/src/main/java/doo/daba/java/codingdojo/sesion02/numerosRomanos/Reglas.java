package doo.daba.java.codingdojo.sesion02.numerosRomanos;

/**
 *
 * @author java.daba.doo
 */
public class Reglas {
	
	public static String[] NUMEROS_ROMANOS = {
		"I", "V", "X", "L", "C", "D", "M"
	};
	
	public static int[] NUMEROS_ARABIGOS = {
		1, 5, 10, 50, 100, 500, 1000
	};
	
	public static int
			UNO = 0,
			CINCO = 1,
			DIEZ = 2,
			CINCUENTA = 3,
			CIEN = 4,
			QUINIENTOS = 5,
			MIL = 6;
	
	public static int
			UNIDADES = 1,
			DECENAS = 10,
			CENTENAS = 100,
			UNIDADES_DE_MILLAR = 1000;
	
	
	public static String convierteNumero(int n, int tipo){
		String numero = "";
		
		if(n == 0) return numero;
		
		
		if(n < 4){
			for(int i = 0; i < n; i++){
				numero += obtenNumeroRomano1o5(1, tipo);
			}
		}
		
		else if(n == 4){
			numero = obtenNumeroRomano1o5(1, tipo) + obtenNumeroRomano1o5(5, tipo);
		}
		
		else if(n == 5){
			numero = obtenNumeroRomano1o5(n, tipo);
		}
		
		else if(n > 5 && n < 9){
			numero = obtenNumeroRomano1o5(6, tipo);
			for(int i = 0; i < n-5; i++){
				numero += obtenNumeroRomano1o5(1, tipo);
			}
		}
		
		else if(n == 9){
			numero = obtenNumeroRomano1o5(1, tipo) + obtenNumeroRomano1o5(1, tipo * 10);
		}
		
		return numero;
	}
	
	
	
	
	private static String obtenNumeroRomano1o5(int numero, int tipo){
		
		if(tipo == UNIDADES){
			return numero == 1 ? NUMEROS_ROMANOS[UNO] : NUMEROS_ROMANOS[CINCO];
		}
		
		if(tipo == DECENAS){
			return numero == 1 ? NUMEROS_ROMANOS[DIEZ] : NUMEROS_ROMANOS[CINCUENTA];
		}
		
		if(tipo == CENTENAS){
			return numero == 1 ? NUMEROS_ROMANOS[CIEN] : NUMEROS_ROMANOS[QUINIENTOS];
		}
		
		if(tipo == UNIDADES_DE_MILLAR){
			return numero == 1 ? NUMEROS_ROMANOS[MIL] : "";
		}
		
		return "eh!?";
	}
	
	
}
