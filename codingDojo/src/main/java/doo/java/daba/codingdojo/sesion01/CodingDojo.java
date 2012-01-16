package doo.java.daba.codingdojo.sesion01;

/**
 *
 * %3 fizz
 * %5 buzz
 * %3 y %5 fizz buzz
 * 
 * 
 * @author gerardoaquino
 */
public class CodingDojo {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		
		for(int i = 1; i <= 100; i++){
			boolean entro = false;
			
			if(i % 3 == 0){
				System.out.print("Fizz" + (i % 5 == 0 ? " " : ""));
				entro = true;
			}
			
			
			if(i % 5 == 0){
				System.out.print("Buzz");
				entro = true;
			}
			
			if (!entro){
				System.out.println(i);
				continue;
			}
			
			System.out.println();
			
			
		}
		
	}
}
