package doo.daba.java.pruebas.spring.jdbc.dao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Prueba {

	  public static void main(String[] args) throws Exception {
	    BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
	    ChacharaDao bean1 = (ChacharaDao) factory.getBean("chacharaDao");

	  }
}
