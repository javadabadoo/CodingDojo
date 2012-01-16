package doo.daba.java.codingdojo.sesion01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * crear un metodo add que recibe un int y retorna un entero  
 * debe poder tomar 0, 1 o 2 numeros, y debe regresar la suma de esos numeros
 * separados por comas
 * 
 * No se permiten negativos
 * 
 * 
 * 
 * 
 * todos los numeros mayores de mil debes ser ubfnorafis 
 * 
 * 
 * todos os limietadores ouefen tener cualquier longitud
 * 
 * permitir multiple delimitadores
 * 
 * multiples limitadores de multiples tamaños
 * 
 * 
 * prmitir saktis de kube cni seoarador y poder cambiar el limiai
 * 
 * //Limitador\n
 *
 * @author gerardoaquino
 */
public class StringCalculator {
	
	public static int add(String numbers) {
		
		List <String>	limitadores = new ArrayList<String>();
		List<String>	numerosNegativos = new ArrayList<String>();
		List<String>	numeros;
		
		int resultado = 0;
		
		limitadores.add("\n");
		
		if(numbers.startsWith("//")){
			limitadores.add(numbers.substring(2).split("\n")[0]);
			numbers = numbers.substring(numbers.indexOf("\n"));
		} else {
			limitadores.add(",");
		}
		
		for (String l : limitadores){
			numbers = numbers.replaceAll (
					("n".equals(l) || "r".equals(l) || "t".equals(l) ? "" : "\\")+ l,
					",");
		}
		
		numeros = numbers == null ? null : Arrays.asList(numbers.split(","));
		
		if (numeros == null || numeros.isEmpty()){
			return resultado;
		}
		
		for (String n : numeros){
			try{
				int numero = Integer.parseInt(n);
				if(numero < 0){
					numerosNegativos.add(n);
				}
				resultado += numero;
			}catch(NumberFormatException nfe){
				// comete la excepcion
			}
		}
		
		if(numerosNegativos.size() > 0){
			String mensaje = "Existen " + numerosNegativos.size()
					+ " numeros negativos";
			
			if(numerosNegativos.size() > 1){
				for(String n : numerosNegativos){
					mensaje += n;
				}
			}
			
			throw new RuntimeException(mensaje);
		}
		
		return resultado;
	}
	
}
