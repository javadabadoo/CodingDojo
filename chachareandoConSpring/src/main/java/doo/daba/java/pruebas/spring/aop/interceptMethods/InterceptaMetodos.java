package doo.daba.java.pruebas.spring.aop.interceptMethods;

import org.springframework.aop.framework.ProxyFactory;

public class InterceptaMetodos {

	public static void main(String[] args) {
		ObjetoDeNegocio target = new ObjetoDeNegocio();

		ProxyFactory pf = new ProxyFactory();

		pf.addAdvice(new InterceptorDeMetodo());
		pf.setTarget(target);

		target = (ObjetoDeNegocio) pf.getProxy();

		System.out.println(target.getString());
		target.ejecutaAlgo();

		System.out.println(target.getString());
	}
}
