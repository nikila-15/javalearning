package edu.cca.niki.oms.repository;

import java.util.ArrayList;

import edu.cca.niki.oms.blueprint.GenericCRUD;
//import edu.cca.niki.oms.blueprint.OrderCRUD;
import edu.cca.niki.oms.models.Order;

public class OrderRepository implements GenericCRUD<Order,String>{
	private ArrayList<Order>orders;
	public OrderRepository() {
		orders=new ArrayList<Order>();
	
	}
	@Override
	public String create(Order item) {
		// TODO Auto-generated method stub
		orders.add(item);
		return item.getId();
	}
	@Override
	public ArrayList<Order> readAll() {
		// TODO Auto-generated method stub
		return orders;
	}

	@Override
	public Boolean delete(String id) {
		/*int index=-1;
		for(int i=0;i<orders.size();i++) {
			if(orders.get(i).getId().equals(id)) {
				index=i;
				break;
			}
		}
		if(index!=-1) {
			orders.remove(index);
			return id;
			
		}else {
			return "NOt Found";
		}*/
		return orders.remove(readOne(id));
	}
	
	@Override
	public Order readOne(String id) {
		// TODO Auto-generated method stub
	    int index=-1;
	    for(int i=0;i<orders.size();i++) {
	    	if(orders.get(i).getId().equals(id)) {
	    		index=i;
	    		break;
	    	}
	    }
	    if(index!=-1) {
	    	return orders.get(index);
	    }else {
	    	return null;
	    }
	}
	@Override
	public Order update(String id,Order item) {
	Order or=readOne(id);
	if(or!=null) {
		or.setCustomerId(item.getCustomerId());
		or.setOrderDate(item.getOrderDate());
	}
	return or;
	}
	@Override
	public Order update(String t1, String t2, String t3, String t4) {
		// TODO Auto-generated method stub
		return null;
	}

}
