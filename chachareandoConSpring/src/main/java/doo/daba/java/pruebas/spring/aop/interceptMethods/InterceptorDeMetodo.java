package doo.daba.java.pruebas.spring.aop.interceptMethods;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class InterceptorDeMetodo implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		String metodo = invocation.getMethod().getName();
		System.out.println("Antes de ejecutar el metodo: " + metodo) ;

		Object result = invocation.proceed();
		
		System.out.println("Despues de la ejecucion del metodo: " + metodo);
		return result;
	}

}
