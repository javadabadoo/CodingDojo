package doo.daba.java.pruebas.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import doo.daba.java.pruebas.spring.jdbc.dao.ChacharaBean;
import doo.daba.java.pruebas.spring.jdbc.dao.ChacharaDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class ProbandoJdbc {

	@Autowired
	ChacharaDao chacharaDao;

	@Test
	public void pruebaConexion() {
		
		ChacharaBean cb = new ChacharaBean();
		cb.setNombre("Gerardo");
		cb.setApellido("Aquino");
		cb.setEdad(25);
		
		chacharaDao.insert(cb);
		
		System.out.println("Entramos");
	}
}
