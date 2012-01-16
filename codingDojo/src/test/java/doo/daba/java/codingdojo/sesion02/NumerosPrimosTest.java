package doo.daba.java.codingdojo.sesion02;

import doo.daba.java.codingdojo.sesion02.numerosPrimos.Numero;
import java.math.BigInteger;
import org.junit.Test;

/**
 *
 * @author java.daba.doo
 */
public class NumerosPrimosTest {
	
	@Test public void pruebaTesA(){
		
		long tiempo = System.currentTimeMillis();
		BigInteger numero = Numero.dameNumeroPrimo10001();
		
		assert numero.longValue() == 104743;
		assert Numero.esPrimo(numero);
		
		tiempo = (System.currentTimeMillis() - tiempo);
		
		System.out.println("El numerito fue: " + numero.toString());
		System.out.printf("%s %d milisegundos","Ejecutado en: ", tiempo);
	}
	
}
