package edu.cca.niki.oms.blueprint;

import java.util.List;

import edu.cca.niki.oms.models.CartProduct;

public interface CartCRUD {
	String create(CartProduct cart);
	List<CartProduct>readAll();
	CartProduct readOne(String id);
	CartProduct update(String id,CartProduct cart);
	Boolean delete(String id);
}
