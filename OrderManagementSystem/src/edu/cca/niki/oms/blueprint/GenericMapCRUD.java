package edu.cca.niki.oms.blueprint;

import java.util.Map;

public interface GenericMapCRUD<T1,T2> {
	T2 create(T1 item);
	Map<T2,T1>readAll();
	T2 update(T2 id,T1 item);
	T2 delete(T2 id);
	T1 readOne(T2 id);

}
