package edu.cca.niki.oms.repository;

import java.util.HashMap;
import java.util.Map;

import edu.cca.niki.oms.blueprint.GenericMapCRUD;
import edu.cca.niki.oms.models.Order;

public class OrderMapRepository implements GenericMapCRUD<Order,String>{
	private Map<String,Order>orders;
	public OrderMapRepository() {
		orders=new HashMap<String,Order>();
	}
	@Override
	public String create(Order item) {
		orders.put(item.getId(), item);
		return item.getId();
	}
	@Override
	public Map<String, Order> readAll() {
		
		return orders;
	}
	@Override
	public String update(String id, Order item) {
		orders.put(id, item);
		return id;
	}
	@Override
	public String delete(String id) {
	    orders.remove(id);
		return id;
	}
	@Override
	public Order readOne(String id) {
		// TODO Auto-generated method stub
		return orders.get(id);
	}

}
