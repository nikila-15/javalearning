package edu.cca.niki.oms.blueprint;

import java.util.List;



public interface GenericCRUD<T1,T2> {
	T2 create(T1 p);
	List<T1>readAll();
	T1 readOne(T2 id);
	T1 update(T2 id,T1 p);
	T1 update(T2 t1,T2 t2,T2 t3,T2 t4);
	Boolean delete(T2 id);
	
}
