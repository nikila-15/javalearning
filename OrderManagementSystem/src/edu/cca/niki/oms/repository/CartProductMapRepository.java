package edu.cca.niki.oms.repository;

import java.util.HashMap;
import java.util.Map;

import edu.cca.niki.oms.blueprint.GenericMapCRUD;
import edu.cca.niki.oms.models.CartProduct;

public class CartProductMapRepository implements GenericMapCRUD<CartProduct,String>{
	private Map<String,CartProduct>cartproducts;
	public CartProductMapRepository() {
		cartproducts=new HashMap<String,CartProduct>();
		CartProduct cr=new CartProduct("Laptop",43543.00,6);
		cartproducts.put(cr.getId(),cr);
	
	}

	@Override
	public String create(CartProduct item) {
		cartproducts.put(item.getId(), item);
		return item.getId();
	}

	@Override
	public Map<String, CartProduct> readAll() {
	
		return cartproducts;
	}

	@Override
	public String update(String id, CartProduct item) {
		cartproducts.put(id, item);
		return id;
	}

	@Override
	public String delete(String id) {
		cartproducts.remove(id);
		return id;
	}

	@Override
	public CartProduct readOne(String id) {
	
		return cartproducts.get(id);
	}

}
