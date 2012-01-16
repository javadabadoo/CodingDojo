package doo.daba.java.pruebas.spring.jdbc.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.nativejdbc.SimpleNativeJdbcExtractor;

public class ChacharaDao extends JdbcDaoSupport implements
		DaoInterface<ChacharaBean> {
	
	
	protected void initDao() throws Exception {
		super.initDao();
		getJdbcTemplate().setNativeJdbcExtractor(new SimpleNativeJdbcExtractor());
	}

	public int insert(ChacharaBean elemento) {
		String sql = "insert into chachara (nombre,apellido,edad) values(?,?,?)";
		Object[] args = { elemento.getNombre(), elemento.getApellido(),
				elemento.getEdad() };

		return this.getJdbcTemplate().update(sql, args);
	}

	public ChacharaBean select(ChacharaBean elemento) {
		// TODO Auto-generated method stub
		return null;
	}

	public ChacharaBean select() {
		// TODO Auto-generated method stub
		return null;
	}

	public ChacharaBean update(ChacharaBean elemento) {
		// TODO Auto-generated method stub
		return null;
	}

}
