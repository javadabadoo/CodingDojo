package doo.daba.java.pruebas.spring.aop.interceptMethods;

public class ObjetoDeNegocio {

	public void ejecutaAlgo(){
		throw new RuntimeException("y que truena esto");
	}
	
	
	public String getString() {
		return "SaludaService";
	}
	
}
