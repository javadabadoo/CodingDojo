package doo.java.daba.codingdojo.sesion02.numerosPrimos;

import java.math.BigInteger;

/**
 *
 * @author gerardoaquino
 */
public class Numero {

	public static boolean esPrimo(BigInteger numero) {
		for (long i = 2; i <= Math.sqrt(numero.longValue()) ; i++) {
			if (numero.longValue() % i == 0) {
				return false;
			}
		}

		return true;
	}

	
	
	
	
	
	public static BigInteger dameNumeroPrimo10001() {

		BigInteger numeroActual = new BigInteger("1");
		int contador = 0;


		while (true) {
			numeroActual = numeroActual.add(BigInteger.ONE);
			if (Numero.esPrimo(numeroActual)) {
				if ((++contador) == 10001) {
					return numeroActual;
				}
			}
		}
	}
}
