package doo.java.daba.codingdojo.sesion02.numerosRomanos;

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
		
		for(;numero.length() < 1;){
			numero = "0" + numero;
		}
		
		
		
		return 
				Reglas.dameUnidadesDeMillar(Integer.parseInt(String.valueOf(numero.charAt(0)))) +
				Reglas.dameCentenas(Integer.parseInt(String.valueOf(numero.charAt(1)))) +
				Reglas.dameDecenas(Integer.parseInt(String.valueOf(numero.charAt(2)))) +
				Reglas.dameUnidades(Integer.parseInt(String.valueOf(numero.charAt(3))));
		
	}
	
	
	public static int romanoAArabigo(String numero){
		
		int
			unidades,
			decenas,
			centenas,
			unidadesDeMillar;
		
		return 0;
	}
	
	
	
}
