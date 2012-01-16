package doo.java.daba.codingdojo.sesion02.numerosRomanos;

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
	
	
	public static String dameUnidades(int n){
		String numero = "";
		
		if(n == 0) return numero;
		
		
		if(n < 4){
			for(int i = 0; i < n; i++){
				numero += NUMEROS_ROMANOS[UNO];
			}
		}
		
		else if(n == 4){
			numero = NUMEROS_ROMANOS[UNO] + NUMEROS_ROMANOS[CINCO];
		}
		
		else if(n == 5){
			numero = NUMEROS_ROMANOS[CINCO];
		}
		
		else if(n > 5 && n < 9){
			numero = NUMEROS_ROMANOS[CINCO];
			for(int i = 0; i < n-5; i++){
				numero += NUMEROS_ROMANOS[UNO];
			}
		}
		
		else if(n == 9){
			numero = NUMEROS_ROMANOS[UNO] + NUMEROS_ROMANOS[DIEZ];
		}
		
		return numero;
	}
	
	
	
	public static String dameDecenas(int n){
		String numero = "";
		
		if(n == 0) return numero;
		
		
		if(n < 4){
			for(int i = 0; i < n; i++){
				numero += NUMEROS_ROMANOS[DIEZ];
			}
		}
		
		else if(n == 4){
			numero = NUMEROS_ROMANOS[DIEZ] + NUMEROS_ROMANOS[CINCUENTA];
		}
		
		else if(n == 5){
			numero = NUMEROS_ROMANOS[CINCUENTA];
		}
		
		else if(n > 5 && n < 9){
			numero = NUMEROS_ROMANOS[CINCUENTA];
			for(int i = 0; i < n-5; i++){
				numero += NUMEROS_ROMANOS[DIEZ];
			}
		}
		
		else if(n == 9){
			numero = NUMEROS_ROMANOS[DIEZ] + NUMEROS_ROMANOS[CIEN];
		}
		
		return numero;
	}
	
	
	
	
	public static String dameCentenas(int n){
		String numero = "";
		
		if(n == 0) return numero;
		
		
		if(n < 4){
			for(int i = 0; i < n; i++){
				numero += NUMEROS_ROMANOS[CIEN];
			}
		}
		
		else if(n == 4){
			numero = NUMEROS_ROMANOS[CIEN] + NUMEROS_ROMANOS[QUINIENTOS];
		}
		
		else if(n == 5){
			numero = NUMEROS_ROMANOS[QUINIENTOS];
		}
		
		else if(n > 5 && n < 9){
			numero = NUMEROS_ROMANOS[QUINIENTOS];
			for(int i = 0; i < n-5; i++){
				numero += NUMEROS_ROMANOS[CIEN];
			}
		}
		
		else if(n == 9){
			numero = NUMEROS_ROMANOS[CIEN] + NUMEROS_ROMANOS[MIL];
		}
		
		return numero;
	}
	
	
	
	public static String dameUnidadesDeMillar(int n){
		String numero  = "";
		
		if(n > 3){
			numero = "{WTF!}";
		}
		
		for(int i = 0; i < n; i++){
			numero += NUMEROS_ROMANOS[MIL];
		}
		
		return numero;
	}
	
	
}
