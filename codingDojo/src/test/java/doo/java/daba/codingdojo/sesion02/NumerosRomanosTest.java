package doo.java.daba.codingdojo.sesion02;

import doo.java.daba.codingdojo.sesion02.numerosRomanos.Numero;
import org.junit.Test;

/**
 *
 * @author java.daba.doo
 */
public class NumerosRomanosTest {
	
	
	
	@Test
	public void pruebaMesta(){
		
		assert "MCMXCIX".equals(Numero.arabigoARomano(1999));
		assert "X".equals(Numero.arabigoARomano(10));
		assert "MMCDXLV".equals(Numero.arabigoARomano(2445));
		assert "MMCDXLIV".equals(Numero.arabigoARomano(2444));
		assert "MMMDCCCXCIX".equals(Numero.arabigoARomano(3899));
	}
}
