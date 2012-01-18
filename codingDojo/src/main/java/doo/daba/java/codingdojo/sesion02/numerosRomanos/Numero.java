package doo.daba.java.codingdojo.sesion02.numerosRomanos;

/**
 *
 * @author java.daba.doo
 */
public class Numero {
	
	public static String arabigoARomano(int n){
		String numero = String.valueOf(n);
		
		if(n > 3899){
			throw new IllegalArgumentException ("Los romanos no pensaron en eso");
		}
		
		for(;numero.length() < 4;){
			numero = "0" + numero;
		}
		
		String numeroRomano = 
				Reglas.convierteNumero(Integer.parseInt(String.valueOf(numero.charAt(0))), Reglas.UNIDADES_DE_MILLAR) +
				Reglas.convierteNumero(Integer.parseInt(String.valueOf(numero.charAt(1))), Reglas.CENTENAS) +
				Reglas.convierteNumero(Integer.parseInt(String.valueOf(numero.charAt(2))), Reglas.DECENAS) +
				Reglas.convierteNumero(Integer.parseInt(String.valueOf(numero.charAt(3))), Reglas.UNIDADES);
		
		System.out.println(n + "  :: " + numeroRomano);
		
		return numeroRomano;
		
	}
	
	
}
