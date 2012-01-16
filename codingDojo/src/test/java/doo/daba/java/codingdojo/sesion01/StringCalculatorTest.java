package doo.daba.java.codingdojo.sesion01;

import doo.daba.java.codingdojo.sesion01.StringCalculator;
import org.junit.Test;


/**
 *
 * @author gerardoaquino
 */
public class StringCalculatorTest {

	@Test
	public void testeando() throws Exception {
		
		assert StringCalculator.add("//t\n1t-2,-3\n4") == 10;
//		assert StringCalculator.add("1,-2,3") == 6;
		assert StringCalculator.add("1,-2,-3") == 6;
		assert StringCalculator.add("1,2") == 3;
		assert StringCalculator.add("2") == 2;
		assert StringCalculator.add("") == 0;

	}
	
	
}
