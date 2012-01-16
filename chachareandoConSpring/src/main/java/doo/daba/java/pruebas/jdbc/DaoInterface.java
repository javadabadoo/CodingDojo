package doo.daba.java.pruebas.spring.jdbc.dao;

public interface DaoInterface<T> {
	
	int insert (T elemento);
	
	T select(T elemento);
	
	T select();
	
	T update (T elemento);
	
}
